package de.jutzig.jabylon.rest.ui.wicket.config.impl;

import java.io.File;
import java.io.IOException;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.html.panel.GenericPanel;
import org.apache.wicket.model.IModel;
import org.eclipse.core.runtime.IProgressMonitor;
import org.osgi.service.prefs.Preferences;

import de.jutzig.jabylon.common.progress.RunnableWithProgress;
import de.jutzig.jabylon.common.team.TeamProvider;
import de.jutzig.jabylon.common.team.TeamProviderUtil;
import de.jutzig.jabylon.properties.Project;
import de.jutzig.jabylon.properties.ProjectVersion;
import de.jutzig.jabylon.properties.PropertiesPackage;
import de.jutzig.jabylon.rest.ui.Activator;
import de.jutzig.jabylon.rest.ui.model.ComplexEObjectListDataProvider;
import de.jutzig.jabylon.rest.ui.model.ProgressionModel;
import de.jutzig.jabylon.rest.ui.wicket.components.ProgressPanel;
import de.jutzig.jabylon.rest.ui.wicket.components.ProgressShowingAjaxButton;
import de.jutzig.jabylon.rest.ui.wicket.config.AbstractConfigSection;

public class ProjectVersionsConfigSection extends GenericPanel<Project> {

	private static final long serialVersionUID = 1L;

	public ProjectVersionsConfigSection(String id, IModel<Project> model, Preferences config) {
		super(id, model);
		ComplexEObjectListDataProvider<ProjectVersion> provider = new ComplexEObjectListDataProvider<ProjectVersion>(model.getObject(), PropertiesPackage.Literals.RESOLVABLE__CHILDREN);
		ListView<ProjectVersion> project = new ListView<ProjectVersion>("versions",provider) {

			private static final long serialVersionUID = 1L;
			private ProgressionModel progressModel;

			@Override
			protected void populateItem(ListItem<ProjectVersion> item) {
				item.setOutputMarkupId(true);
				item.add(new Label("name",item.getModelObject().getName()));
				
				progressModel = new ProgressionModel(-1);
				final ProgressPanel progressPanel = new ProgressPanel("progress",progressModel);
				item.add(progressPanel);
				
				item.add(createCheckoutAction(progressPanel,item.getModel()));
				
			}


		};
		project.setOutputMarkupId(true);
		add(project);
	}
	
	private Component createCheckoutAction(ProgressPanel progressPanel, final IModel<ProjectVersion> model) {
		RunnableWithProgress runnable = new RunnableWithProgress() {

			private static final long serialVersionUID = 1L;

			@Override
			public void run(IProgressMonitor monitor) {
				ProjectVersion version = model.getObject();
				TeamProvider provider = TeamProviderUtil.getTeamProvider(version.getParent().getTeamProvider());
				try {
					provider.checkout(version, monitor);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					getSession().error(e.getMessage());
					e.printStackTrace();
				}
				
			}
		};
		return new ProgressShowingAjaxButton("checkout", progressPanel, runnable){

			private static final long serialVersionUID = 1L;

			public boolean isVisible() {
				ProjectVersion version = model.getObject();
				TeamProvider provider = TeamProviderUtil.getTeamProvider(version.getParent().getTeamProvider());
				if(provider==null)
					return false;
				File file = new File(version.absoluteFilePath().toFileString());
				return (!file.isDirectory());
			};
		};
		
	}

	public static class VersionsConfig extends AbstractConfigSection<Project> {

		private static final long serialVersionUID = 1L;

		@Override
		public WebMarkupContainer createContents(String id, IModel<Project> input, Preferences prefs) {
			return new ProjectVersionsConfigSection(id, input, prefs);
		}

		@Override
		public void commit(IModel<Project> input, Preferences config) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean hasFormComponents() {
			return false;
		}
	}
}