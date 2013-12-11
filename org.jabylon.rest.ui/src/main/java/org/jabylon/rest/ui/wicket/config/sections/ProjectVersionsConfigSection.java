package org.jabylon.rest.ui.wicket.config.sections;

import java.io.File;
import java.util.Collection;

import javax.inject.Inject;

import org.apache.wicket.Component;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.extensions.ajax.markup.html.IndicatingAjaxButton;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.html.panel.GenericPanel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.StringResourceModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.cdo.CDOState;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.jabylon.common.progress.RunnableWithProgress;
import org.jabylon.common.team.TeamProvider;
import org.jabylon.common.team.TeamProviderException;
import org.jabylon.common.team.TeamProviderUtil;
import org.jabylon.common.util.FileUtil;
import org.jabylon.common.util.PreferencesUtil;
import org.jabylon.properties.Project;
import org.jabylon.properties.ProjectVersion;
import org.jabylon.properties.PropertiesPackage;
import org.jabylon.properties.PropertyFileDiff;
import org.jabylon.properties.ScanConfiguration;
import org.jabylon.resources.persistence.PropertyPersistenceService;
import org.jabylon.rest.ui.Activator;
import org.jabylon.rest.ui.model.ComplexEObjectListDataProvider;
import org.jabylon.rest.ui.model.ProgressionModel;
import org.jabylon.rest.ui.util.WicketUtil;
import org.jabylon.rest.ui.wicket.components.ProgressPanel;
import org.jabylon.rest.ui.wicket.components.ProgressShowingAjaxButton;
import org.jabylon.rest.ui.wicket.config.AbstractConfigSection;
import org.jabylon.rest.ui.wicket.config.SettingsPage;
import org.jabylon.rest.ui.wicket.config.SettingsPanel;
import org.jabylon.security.CommonPermissions;
import org.osgi.service.prefs.Preferences;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProjectVersionsConfigSection extends GenericPanel<Project> {

    private static final long serialVersionUID = 1L;
    private static final Logger logger = LoggerFactory.getLogger(ProjectVersionsConfigSection.class);
    @Inject
    private transient PropertyPersistenceService persistenceService;

    public ProjectVersionsConfigSection(String id, IModel<Project> model, Preferences config) {
        super(id, model);
        add(buildAddNewLink(model));
        ComplexEObjectListDataProvider<ProjectVersion> provider = new ComplexEObjectListDataProvider<ProjectVersion>(model,
                PropertiesPackage.Literals.RESOLVABLE__CHILDREN);
        ListView<ProjectVersion> project = new ListView<ProjectVersion>("versions", provider) {

            private static final long serialVersionUID = 1L;
            private ProgressionModel progressModel;

            @Override
            protected void populateItem(ListItem<ProjectVersion> item) {
                item.setOutputMarkupId(true);
                item.add(new Label("name", item.getModelObject().getName()));
                item.add(new Label("summary", new StringResourceModel("ProjectVersionsConfigSection.summary", item, null, item.getModel().getObject().getChildren().size())));
                progressModel = new ProgressionModel(-1);
                final ProgressPanel progressPanel = new ProgressPanel("progress", progressModel);

                item.add(progressPanel);
                ProjectVersion projectVersion = item.getModelObject();
                item.add(new BookmarkablePageLink<Void>("edit",SettingsPage.class,WicketUtil.buildPageParametersFor(projectVersion)));
                item.add(createCheckoutAction(progressPanel, item.getModel()));
                item.add(createRescanAction(progressPanel, item.getModel()));
                item.add(createUpdateAction(progressPanel, item.getModel()));
                item.add(createCommitAction(progressPanel, item.getModel()));
                item.add(createDeleteAction(progressPanel, item.getModel()));

            }

        };
        project.setOutputMarkupId(true);
        add(project);
    }

    private Component buildAddNewLink(IModel<Project> model) {
        Project project = model.getObject();
        if (project.cdoState() == CDOState.NEW || project.cdoState() == CDOState.TRANSIENT) {
            // it's a new project, we can't add anything yet
            Button link = new Button("addNew");
            link.setEnabled(false);
            return link;
        }
        PageParameters parameters = WicketUtil.buildPageParametersFor(project);
        parameters.add(SettingsPanel.QUERY_PARAM_CREATE, PropertiesPackage.Literals.PROJECT_VERSION.getName());
        return new BookmarkablePageLink<Void>("addNew", SettingsPage.class, parameters);
    }

    protected Component createDeleteAction(ProgressPanel progressPanel, final IModel<ProjectVersion> model) {

        Button button = new IndicatingAjaxButton("delete") {

            private static final long serialVersionUID = 1L;

            @Override
            protected void onAfterSubmit(AjaxRequestTarget target, Form<?> form) {

                ProjectVersion version = model.getObject();
                CDOTransaction transaction = Activator.getDefault().getRepositoryConnector().openTransaction();
                version = transaction.getObject(version);

                try {
                    File directory = new File(version.absolutPath().toFileString());
                    FileUtil.delete(directory);
                    Project project = version.getParent();
                    project.getChildren().remove(version);
                    transaction.commit();
                    setResponsePage(SettingsPage.class, WicketUtil.buildPageParametersFor(project));
                } catch (CommitException e) {
                    logger.error("Commit failed",e);
                    getSession().error(e.getMessage());
                } finally {
                    transaction.close();
                }
            }

        };
        // button.add(new AttributeModifier("onclick",
        // "return confirm('Are you sure you want to delete this version?');"));
        button.setDefaultFormProcessing(false);
        return button;
    }


    protected Component createUpdateAction(ProgressPanel progressPanel, final IModel<ProjectVersion> model) {
        RunnableWithProgress runnable = new RunnableWithProgress() {

            private static final long serialVersionUID = 1L;

            @Override
            public IStatus run(IProgressMonitor monitor) {
                ProjectVersion version = model.getObject();
                TeamProvider provider = TeamProviderUtil.getTeamProvider(version.getParent().getTeamProvider());
                CDOTransaction transaction = Activator.getDefault().getRepositoryConnector().openTransaction();
                try {
                    version = transaction.getObject(version);
                    SubMonitor subMonitor = SubMonitor.convert(monitor, "Updating", 100);
                    Collection<PropertyFileDiff> updates = provider.update(version, subMonitor.newChild(50));
                    subMonitor.setWorkRemaining(updates.size() * 2);
                    subMonitor.subTask("Processing updates");
                    for (PropertyFileDiff updatedFile : updates) {
                        version.partialScan(PreferencesUtil.getScanConfigForProject(getModelObject()), updatedFile);
                        subMonitor.worked(1);
                    }
                    subMonitor.setTaskName("Database Sync");
                    transaction.commit(subMonitor.newChild(updates.size()));
                } catch (TeamProviderException e) {
                    logger.error("Update failed",e);
                    return new Status(IStatus.ERROR, Activator.BUNDLE_ID, "Update failed",e);
                } catch (CommitException e) {
                    logger.error("Failed to commit the transaction",e);
                    return new Status(IStatus.ERROR, Activator.BUNDLE_ID, "Failed to commit the transaction",e);
                } finally {
                	persistenceService.clearCache();
                    transaction.close();
                }
                return Status.OK_STATUS;

            }
        };
        return new ProgressShowingAjaxButton("update", progressPanel, runnable) {

            private static final long serialVersionUID = 1L;

            public boolean isVisible() {
                ProjectVersion version = model.getObject();
                TeamProvider provider = TeamProviderUtil.getTeamProvider(version.getParent().getTeamProvider());
                if (provider == null)
                    return false;
                File file = new File(version.absoluteFilePath().toFileString());
                return (file.isDirectory());
            };
        };

    }


    protected Component createCommitAction(ProgressPanel progressPanel, final IModel<ProjectVersion> model)
    {
        RunnableWithProgress runnable = new RunnableWithProgress()
        {
            private static final long serialVersionUID = 1L;

            @Override
            public IStatus run(IProgressMonitor monitor)
            {

                ProjectVersion version = model.getObject();
                TeamProvider provider = TeamProviderUtil.getTeamProvider(version.getParent()
                                                                                .getTeamProvider());
                CDOTransaction transaction = Activator.getDefault()
                                                      .getRepositoryConnector()
                                                      .openTransaction();
                try
                {
                    version = transaction.getObject(version);
                    SubMonitor subMonitor = SubMonitor.convert(monitor, "Committing", 100);

                    provider.commit(version, subMonitor.newChild(100));

                }
                catch (TeamProviderException e)
                {
                    logger.error("Commit failed", e);
                    return new Status(IStatus.ERROR, Activator.BUNDLE_ID, "Commit Failed", e);
                }

                finally
                {
                    transaction.close();
                }

                return Status.OK_STATUS;
            }
        };
        return new ProgressShowingAjaxButton("commit", progressPanel, runnable)
        {

            private static final long serialVersionUID = 1L;


            public boolean isVisible()
            {
                ProjectVersion version = model.getObject();
                TeamProvider provider = TeamProviderUtil.getTeamProvider(version.getParent()
                                                                                .getTeamProvider());
                if (provider == null)
                    return false;
                File file = new File(version.absoluteFilePath().toFileString());
                return (file.isDirectory());
            };
        };

    }

    private Component createCheckoutAction(ProgressPanel progressPanel, final IModel<ProjectVersion> model) {
        RunnableWithProgress runnable = new RunnableWithProgress() {

            private static final long serialVersionUID = 1L;

            @Override
            public IStatus run(IProgressMonitor monitor) {
                CDOTransaction transaction = Activator.getDefault().getRepositoryConnector().openTransaction();
                try {
                    ProjectVersion version = model.getObject();
                    version = transaction.getObject(version);
                    TeamProvider provider = TeamProviderUtil.getTeamProvider(version.getParent().getTeamProvider());
                    provider.checkout(version, monitor);
                } catch (TeamProviderException e) {
                    logger.error("Checkout failed",e);
                    return new Status(IStatus.ERROR, Activator.BUNDLE_ID, "Checkout failed",e);
                }
                finally{
                    try {
                        transaction.commit();
                    } catch (CommitException e) {
                        logger.error("Failed to commit the transaction",e);
                        return new Status(IStatus.ERROR, Activator.BUNDLE_ID, "Failed to commit the transaction",e);
                    }
                    transaction.close();
                }
                return Status.OK_STATUS;
            }
        };
        return new ProgressShowingAjaxButton("checkout", progressPanel, runnable) {

            private static final long serialVersionUID = 1L;

            public boolean isVisible() {
                ProjectVersion version = model.getObject();
                TeamProvider provider = TeamProviderUtil.getTeamProvider(version.getParent().getTeamProvider());
                if (provider == null)
                    return false;
                File file = new File(version.absoluteFilePath().toFileString());
                return (!file.isDirectory());
            };
        };

    }

    private Component createRescanAction(ProgressPanel progressPanel, final IModel<ProjectVersion> model) {
        RunnableWithProgress runnable = new RunnableWithProgress() {

            private static final long serialVersionUID = 1L;

            @Override
            public IStatus run(IProgressMonitor monitor) {
                ScanConfiguration scanConfiguration = PreferencesUtil.getScanConfigForProject(getModelObject());
                ProjectVersion version = model.getObject();
                SubMonitor subMonitor = SubMonitor.convert(monitor, "Scanning", 100);
                CDOTransaction transaction = Activator.getDefault().getRepositoryConnector().openTransaction();
                version = transaction.getObject(version);
                version.fullScan(scanConfiguration, subMonitor.newChild(50));
                subMonitor.setTaskName("Database Sync");
                try {
                    transaction.commit(subMonitor.newChild(50));
                } catch (CommitException e) {
                    return new Status(IStatus.ERROR, Activator.BUNDLE_ID, "Transaction commit failed",e);
                } finally {
                	persistenceService.clearCache();
                    transaction.close();
                }
                monitor.done();
                return Status.OK_STATUS;
            }
        };
        return new ProgressShowingAjaxButton("rescan", progressPanel, runnable) {

            private static final long serialVersionUID = 1L;

            public boolean isVisible() {
                // ProjectVersion version = model.getObject();
                // File file = new
                // File(version.absoluteFilePath().toFileString());
                // return (file.isDirectory());
                return true;
            };
        };

    }

    public static class VersionsConfig extends AbstractConfigSection<Project> {

        private static final long serialVersionUID = 1L;

        @Override
        public WebMarkupContainer doCreateContents(String id, IModel<Project> input, Preferences prefs) {
            return new ProjectVersionsConfigSection(id, input, prefs);
        }

        @Override
        public void commit(IModel<Project> input, Preferences config) {
            // TODO Auto-generated method stub

        }


        @Override
        public String getRequiredPermission() {
            String projectName = null;
            if(getDomainObject()!=null)
                projectName = getDomainObject().getName();
            return CommonPermissions.constructPermission(CommonPermissions.PROJECT,projectName,CommonPermissions.ACTION_EDIT);
        }
    }
}
