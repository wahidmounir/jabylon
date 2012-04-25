/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.jutzig.jabylon.properties;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.jutzig.jabylon.properties.PropertiesFactory
 * @model kind="package"
 * @generated
 */
public interface PropertiesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "properties";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jutzig.de/jabylon/properties";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "prop";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PropertiesPackage eINSTANCE = de.jutzig.jabylon.properties.impl.PropertiesPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jutzig.jabylon.properties.impl.ResolvableImpl <em>Resolvable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jutzig.jabylon.properties.impl.ResolvableImpl
	 * @see de.jutzig.jabylon.properties.impl.PropertiesPackageImpl#getResolvable()
	 * @generated
	 */
	int RESOLVABLE = 7;

	/**
	 * The meta object id for the '{@link de.jutzig.jabylon.properties.impl.PropertyFileImpl <em>Property File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jutzig.jabylon.properties.impl.PropertyFileImpl
	 * @see de.jutzig.jabylon.properties.impl.PropertiesPackageImpl#getPropertyFile()
	 * @generated
	 */
	int PROPERTY_FILE = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILE__PROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>Property File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.jutzig.jabylon.properties.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jutzig.jabylon.properties.impl.PropertyImpl
	 * @see de.jutzig.jabylon.properties.impl.PropertiesPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__COMMENT = 2;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Percent Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVABLE__PERCENT_COMPLETE = 0;

	/**
	 * The number of structural features of the '<em>Resolvable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.jutzig.jabylon.properties.impl.PropertyFileDescriptorImpl <em>Property File Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jutzig.jabylon.properties.impl.PropertyFileDescriptorImpl
	 * @see de.jutzig.jabylon.properties.impl.PropertiesPackageImpl#getPropertyFileDescriptor()
	 * @generated
	 */
	int PROPERTY_FILE_DESCRIPTOR = 2;

	/**
	 * The feature id for the '<em><b>Percent Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILE_DESCRIPTOR__PERCENT_COMPLETE = RESOLVABLE__PERCENT_COMPLETE;

	/**
	 * The feature id for the '<em><b>Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILE_DESCRIPTOR__VARIANT = RESOLVABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILE_DESCRIPTOR__LOCATION = RESOLVABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILE_DESCRIPTOR__MASTER = RESOLVABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Project Locale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILE_DESCRIPTOR__PROJECT_LOCALE = RESOLVABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILE_DESCRIPTOR__KEYS = RESOLVABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Property File Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FILE_DESCRIPTOR_FEATURE_COUNT = RESOLVABLE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link de.jutzig.jabylon.properties.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jutzig.jabylon.properties.impl.ProjectImpl
	 * @see de.jutzig.jabylon.properties.impl.PropertiesPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 3;

	/**
	 * The feature id for the '<em><b>Percent Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PERCENT_COMPLETE = RESOLVABLE__PERCENT_COMPLETE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = RESOLVABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Workspace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__WORKSPACE = RESOLVABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__VERSIONS = RESOLVABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Master</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__MASTER = RESOLVABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Repository URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__REPOSITORY_URI = RESOLVABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Property Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROPERTY_TYPE = RESOLVABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = RESOLVABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link de.jutzig.jabylon.properties.impl.ProjectVersionImpl <em>Project Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jutzig.jabylon.properties.impl.ProjectVersionImpl
	 * @see de.jutzig.jabylon.properties.impl.PropertiesPackageImpl#getProjectVersion()
	 * @generated
	 */
	int PROJECT_VERSION = 4;

	/**
	 * The feature id for the '<em><b>Percent Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_VERSION__PERCENT_COMPLETE = RESOLVABLE__PERCENT_COMPLETE;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_VERSION__PROJECT = RESOLVABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_VERSION__BRANCH = RESOLVABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Locales</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_VERSION__LOCALES = RESOLVABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Master</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_VERSION__MASTER = RESOLVABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Project Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_VERSION_FEATURE_COUNT = RESOLVABLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.jutzig.jabylon.properties.impl.ProjectLocaleImpl <em>Project Locale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jutzig.jabylon.properties.impl.ProjectLocaleImpl
	 * @see de.jutzig.jabylon.properties.impl.PropertiesPackageImpl#getProjectLocale()
	 * @generated
	 */
	int PROJECT_LOCALE = 5;

	/**
	 * The feature id for the '<em><b>Percent Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_LOCALE__PERCENT_COMPLETE = RESOLVABLE__PERCENT_COMPLETE;

	/**
	 * The feature id for the '<em><b>Project Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_LOCALE__PROJECT_VERSION = RESOLVABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_LOCALE__LOCALE = RESOLVABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_LOCALE__DESCRIPTORS = RESOLVABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Property Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_LOCALE__PROPERTY_COUNT = RESOLVABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Project Locale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_LOCALE_FEATURE_COUNT = RESOLVABLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.jutzig.jabylon.properties.impl.WorkspaceImpl <em>Workspace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jutzig.jabylon.properties.impl.WorkspaceImpl
	 * @see de.jutzig.jabylon.properties.impl.PropertiesPackageImpl#getWorkspace()
	 * @generated
	 */
	int WORKSPACE = 6;

	/**
	 * The feature id for the '<em><b>Percent Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__PERCENT_COMPLETE = RESOLVABLE__PERCENT_COMPLETE;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__ROOT = RESOLVABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__PROJECTS = RESOLVABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Workspace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_FEATURE_COUNT = RESOLVABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.jutzig.jabylon.properties.impl.ScanConfigurationImpl <em>Scan Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jutzig.jabylon.properties.impl.ScanConfigurationImpl
	 * @see de.jutzig.jabylon.properties.impl.PropertiesPackageImpl#getScanConfiguration()
	 * @generated
	 */
	int SCAN_CONFIGURATION = 8;

	/**
	 * The feature id for the '<em><b>Excludes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_CONFIGURATION__EXCLUDES = 0;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_CONFIGURATION__INCLUDES = 1;

	/**
	 * The feature id for the '<em><b>Master Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_CONFIGURATION__MASTER_LOCALE = 2;

	/**
	 * The feature id for the '<em><b>Include</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_CONFIGURATION__INCLUDE = 3;

	/**
	 * The feature id for the '<em><b>Exclude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_CONFIGURATION__EXCLUDE = 4;

	/**
	 * The number of structural features of the '<em>Scan Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCAN_CONFIGURATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link de.jutzig.jabylon.properties.PropertyType <em>Property Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jutzig.jabylon.properties.PropertyType
	 * @see de.jutzig.jabylon.properties.impl.PropertiesPackageImpl#getPropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 9;

	/**
	 * The meta object id for the '<em>Locale</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Locale
	 * @see de.jutzig.jabylon.properties.impl.PropertiesPackageImpl#getLocale()
	 * @generated
	 */
	int LOCALE = 10;


	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.URI
	 * @see de.jutzig.jabylon.properties.impl.PropertiesPackageImpl#getURI()
	 * @generated
	 */
	int URI = 11;


	/**
	 * Returns the meta object for class '{@link de.jutzig.jabylon.properties.PropertyFile <em>Property File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property File</em>'.
	 * @see de.jutzig.jabylon.properties.PropertyFile
	 * @generated
	 */
	EClass getPropertyFile();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jutzig.jabylon.properties.PropertyFile#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see de.jutzig.jabylon.properties.PropertyFile#getProperties()
	 * @see #getPropertyFile()
	 * @generated
	 */
	EReference getPropertyFile_Properties();

	/**
	 * Returns the meta object for class '{@link de.jutzig.jabylon.properties.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see de.jutzig.jabylon.properties.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link de.jutzig.jabylon.properties.Property#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see de.jutzig.jabylon.properties.Property#getKey()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Key();

	/**
	 * Returns the meta object for the attribute '{@link de.jutzig.jabylon.properties.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.jutzig.jabylon.properties.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.jutzig.jabylon.properties.Property#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see de.jutzig.jabylon.properties.Property#getComment()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Comment();

	/**
	 * Returns the meta object for class '{@link de.jutzig.jabylon.properties.PropertyFileDescriptor <em>Property File Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property File Descriptor</em>'.
	 * @see de.jutzig.jabylon.properties.PropertyFileDescriptor
	 * @generated
	 */
	EClass getPropertyFileDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link de.jutzig.jabylon.properties.PropertyFileDescriptor#getVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variant</em>'.
	 * @see de.jutzig.jabylon.properties.PropertyFileDescriptor#getVariant()
	 * @see #getPropertyFileDescriptor()
	 * @generated
	 */
	EAttribute getPropertyFileDescriptor_Variant();

	/**
	 * Returns the meta object for the attribute '{@link de.jutzig.jabylon.properties.PropertyFileDescriptor#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see de.jutzig.jabylon.properties.PropertyFileDescriptor#getLocation()
	 * @see #getPropertyFileDescriptor()
	 * @generated
	 */
	EAttribute getPropertyFileDescriptor_Location();

	/**
	 * Returns the meta object for the reference '{@link de.jutzig.jabylon.properties.PropertyFileDescriptor#getMaster <em>Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Master</em>'.
	 * @see de.jutzig.jabylon.properties.PropertyFileDescriptor#getMaster()
	 * @see #getPropertyFileDescriptor()
	 * @generated
	 */
	EReference getPropertyFileDescriptor_Master();

	/**
	 * Returns the meta object for the reference '{@link de.jutzig.jabylon.properties.PropertyFileDescriptor#getProjectLocale <em>Project Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Project Locale</em>'.
	 * @see de.jutzig.jabylon.properties.PropertyFileDescriptor#getProjectLocale()
	 * @see #getPropertyFileDescriptor()
	 * @generated
	 */
	EReference getPropertyFileDescriptor_ProjectLocale();

	/**
	 * Returns the meta object for the attribute '{@link de.jutzig.jabylon.properties.PropertyFileDescriptor#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keys</em>'.
	 * @see de.jutzig.jabylon.properties.PropertyFileDescriptor#getKeys()
	 * @see #getPropertyFileDescriptor()
	 * @generated
	 */
	EAttribute getPropertyFileDescriptor_Keys();

	/**
	 * Returns the meta object for class '{@link de.jutzig.jabylon.properties.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see de.jutzig.jabylon.properties.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link de.jutzig.jabylon.properties.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jutzig.jabylon.properties.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the container reference '{@link de.jutzig.jabylon.properties.Project#getWorkspace <em>Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Workspace</em>'.
	 * @see de.jutzig.jabylon.properties.Project#getWorkspace()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Workspace();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jutzig.jabylon.properties.Project#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Versions</em>'.
	 * @see de.jutzig.jabylon.properties.Project#getVersions()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Versions();

	/**
	 * Returns the meta object for the containment reference '{@link de.jutzig.jabylon.properties.Project#getMaster <em>Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Master</em>'.
	 * @see de.jutzig.jabylon.properties.Project#getMaster()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Master();

	/**
	 * Returns the meta object for the attribute '{@link de.jutzig.jabylon.properties.Project#getRepositoryURI <em>Repository URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository URI</em>'.
	 * @see de.jutzig.jabylon.properties.Project#getRepositoryURI()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_RepositoryURI();

	/**
	 * Returns the meta object for the attribute '{@link de.jutzig.jabylon.properties.Project#getPropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Type</em>'.
	 * @see de.jutzig.jabylon.properties.Project#getPropertyType()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_PropertyType();

	/**
	 * Returns the meta object for class '{@link de.jutzig.jabylon.properties.ProjectVersion <em>Project Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Version</em>'.
	 * @see de.jutzig.jabylon.properties.ProjectVersion
	 * @generated
	 */
	EClass getProjectVersion();

	/**
	 * Returns the meta object for the reference '{@link de.jutzig.jabylon.properties.ProjectVersion#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Project</em>'.
	 * @see de.jutzig.jabylon.properties.ProjectVersion#getProject()
	 * @see #getProjectVersion()
	 * @generated
	 */
	EReference getProjectVersion_Project();

	/**
	 * Returns the meta object for the attribute '{@link de.jutzig.jabylon.properties.ProjectVersion#getBranch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch</em>'.
	 * @see de.jutzig.jabylon.properties.ProjectVersion#getBranch()
	 * @see #getProjectVersion()
	 * @generated
	 */
	EAttribute getProjectVersion_Branch();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jutzig.jabylon.properties.ProjectVersion#getLocales <em>Locales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locales</em>'.
	 * @see de.jutzig.jabylon.properties.ProjectVersion#getLocales()
	 * @see #getProjectVersion()
	 * @generated
	 */
	EReference getProjectVersion_Locales();

	/**
	 * Returns the meta object for the containment reference '{@link de.jutzig.jabylon.properties.ProjectVersion#getMaster <em>Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Master</em>'.
	 * @see de.jutzig.jabylon.properties.ProjectVersion#getMaster()
	 * @see #getProjectVersion()
	 * @generated
	 */
	EReference getProjectVersion_Master();

	/**
	 * Returns the meta object for class '{@link de.jutzig.jabylon.properties.ProjectLocale <em>Project Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Locale</em>'.
	 * @see de.jutzig.jabylon.properties.ProjectLocale
	 * @generated
	 */
	EClass getProjectLocale();

	/**
	 * Returns the meta object for the reference '{@link de.jutzig.jabylon.properties.ProjectLocale#getProjectVersion <em>Project Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Project Version</em>'.
	 * @see de.jutzig.jabylon.properties.ProjectLocale#getProjectVersion()
	 * @see #getProjectLocale()
	 * @generated
	 */
	EReference getProjectLocale_ProjectVersion();

	/**
	 * Returns the meta object for the attribute '{@link de.jutzig.jabylon.properties.ProjectLocale#getLocale <em>Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locale</em>'.
	 * @see de.jutzig.jabylon.properties.ProjectLocale#getLocale()
	 * @see #getProjectLocale()
	 * @generated
	 */
	EAttribute getProjectLocale_Locale();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jutzig.jabylon.properties.ProjectLocale#getDescriptors <em>Descriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptors</em>'.
	 * @see de.jutzig.jabylon.properties.ProjectLocale#getDescriptors()
	 * @see #getProjectLocale()
	 * @generated
	 */
	EReference getProjectLocale_Descriptors();

	/**
	 * Returns the meta object for the attribute '{@link de.jutzig.jabylon.properties.ProjectLocale#getPropertyCount <em>Property Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Count</em>'.
	 * @see de.jutzig.jabylon.properties.ProjectLocale#getPropertyCount()
	 * @see #getProjectLocale()
	 * @generated
	 */
	EAttribute getProjectLocale_PropertyCount();

	/**
	 * Returns the meta object for class '{@link de.jutzig.jabylon.properties.Workspace <em>Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workspace</em>'.
	 * @see de.jutzig.jabylon.properties.Workspace
	 * @generated
	 */
	EClass getWorkspace();

	/**
	 * Returns the meta object for the attribute '{@link de.jutzig.jabylon.properties.Workspace#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root</em>'.
	 * @see de.jutzig.jabylon.properties.Workspace#getRoot()
	 * @see #getWorkspace()
	 * @generated
	 */
	EAttribute getWorkspace_Root();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jutzig.jabylon.properties.Workspace#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projects</em>'.
	 * @see de.jutzig.jabylon.properties.Workspace#getProjects()
	 * @see #getWorkspace()
	 * @generated
	 */
	EReference getWorkspace_Projects();

	/**
	 * Returns the meta object for class '{@link de.jutzig.jabylon.properties.Resolvable <em>Resolvable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolvable</em>'.
	 * @see de.jutzig.jabylon.properties.Resolvable
	 * @generated
	 */
	EClass getResolvable();

	/**
	 * Returns the meta object for the attribute '{@link de.jutzig.jabylon.properties.Resolvable#getPercentComplete <em>Percent Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percent Complete</em>'.
	 * @see de.jutzig.jabylon.properties.Resolvable#getPercentComplete()
	 * @see #getResolvable()
	 * @generated
	 */
	EAttribute getResolvable_PercentComplete();

	/**
	 * Returns the meta object for class '{@link de.jutzig.jabylon.properties.ScanConfiguration <em>Scan Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scan Configuration</em>'.
	 * @see de.jutzig.jabylon.properties.ScanConfiguration
	 * @generated
	 */
	EClass getScanConfiguration();

	/**
	 * Returns the meta object for the attribute list '{@link de.jutzig.jabylon.properties.ScanConfiguration#getExcludes <em>Excludes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Excludes</em>'.
	 * @see de.jutzig.jabylon.properties.ScanConfiguration#getExcludes()
	 * @see #getScanConfiguration()
	 * @generated
	 */
	EAttribute getScanConfiguration_Excludes();

	/**
	 * Returns the meta object for the attribute list '{@link de.jutzig.jabylon.properties.ScanConfiguration#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Includes</em>'.
	 * @see de.jutzig.jabylon.properties.ScanConfiguration#getIncludes()
	 * @see #getScanConfiguration()
	 * @generated
	 */
	EAttribute getScanConfiguration_Includes();

	/**
	 * Returns the meta object for the attribute '{@link de.jutzig.jabylon.properties.ScanConfiguration#getMasterLocale <em>Master Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Master Locale</em>'.
	 * @see de.jutzig.jabylon.properties.ScanConfiguration#getMasterLocale()
	 * @see #getScanConfiguration()
	 * @generated
	 */
	EAttribute getScanConfiguration_MasterLocale();

	/**
	 * Returns the meta object for the attribute '{@link de.jutzig.jabylon.properties.ScanConfiguration#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include</em>'.
	 * @see de.jutzig.jabylon.properties.ScanConfiguration#getInclude()
	 * @see #getScanConfiguration()
	 * @generated
	 */
	EAttribute getScanConfiguration_Include();

	/**
	 * Returns the meta object for the attribute '{@link de.jutzig.jabylon.properties.ScanConfiguration#getExclude <em>Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude</em>'.
	 * @see de.jutzig.jabylon.properties.ScanConfiguration#getExclude()
	 * @see #getScanConfiguration()
	 * @generated
	 */
	EAttribute getScanConfiguration_Exclude();

	/**
	 * Returns the meta object for enum '{@link de.jutzig.jabylon.properties.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Type</em>'.
	 * @see de.jutzig.jabylon.properties.PropertyType
	 * @generated
	 */
	EEnum getPropertyType();

	/**
	 * Returns the meta object for data type '{@link java.util.Locale <em>Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Locale</em>'.
	 * @see java.util.Locale
	 * @model instanceClass="java.util.Locale"
	 * @generated
	 */
	EDataType getLocale();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.URI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see org.eclipse.emf.common.util.URI
	 * @model instanceClass="org.eclipse.emf.common.util.URI"
	 * @generated
	 */
	EDataType getURI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PropertiesFactory getPropertiesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.jutzig.jabylon.properties.impl.PropertyFileImpl <em>Property File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jutzig.jabylon.properties.impl.PropertyFileImpl
		 * @see de.jutzig.jabylon.properties.impl.PropertiesPackageImpl#getPropertyFile()
		 * @generated
		 */
		EClass PROPERTY_FILE = eINSTANCE.getPropertyFile();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_FILE__PROPERTIES = eINSTANCE.getPropertyFile_Properties();

		/**
		 * The meta object literal for the '{@link de.jutzig.jabylon.properties.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jutzig.jabylon.properties.impl.PropertyImpl
		 * @see de.jutzig.jabylon.properties.impl.PropertiesPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__KEY = eINSTANCE.getProperty_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__COMMENT = eINSTANCE.getProperty_Comment();

		/**
		 * The meta object literal for the '{@link de.jutzig.jabylon.properties.impl.PropertyFileDescriptorImpl <em>Property File Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jutzig.jabylon.properties.impl.PropertyFileDescriptorImpl
		 * @see de.jutzig.jabylon.properties.impl.PropertiesPackageImpl#getPropertyFileDescriptor()
		 * @generated
		 */
		EClass PROPERTY_FILE_DESCRIPTOR = eINSTANCE.getPropertyFileDescriptor();

		/**
		 * The meta object literal for the '<em><b>Variant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_FILE_DESCRIPTOR__VARIANT = eINSTANCE.getPropertyFileDescriptor_Variant();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_FILE_DESCRIPTOR__LOCATION = eINSTANCE.getPropertyFileDescriptor_Location();

		/**
		 * The meta object literal for the '<em><b>Master</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_FILE_DESCRIPTOR__MASTER = eINSTANCE.getPropertyFileDescriptor_Master();

		/**
		 * The meta object literal for the '<em><b>Project Locale</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_FILE_DESCRIPTOR__PROJECT_LOCALE = eINSTANCE.getPropertyFileDescriptor_ProjectLocale();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_FILE_DESCRIPTOR__KEYS = eINSTANCE.getPropertyFileDescriptor_Keys();

		/**
		 * The meta object literal for the '{@link de.jutzig.jabylon.properties.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jutzig.jabylon.properties.impl.ProjectImpl
		 * @see de.jutzig.jabylon.properties.impl.PropertiesPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Workspace</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__WORKSPACE = eINSTANCE.getProject_Workspace();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__VERSIONS = eINSTANCE.getProject_Versions();

		/**
		 * The meta object literal for the '<em><b>Master</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__MASTER = eINSTANCE.getProject_Master();

		/**
		 * The meta object literal for the '<em><b>Repository URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__REPOSITORY_URI = eINSTANCE.getProject_RepositoryURI();

		/**
		 * The meta object literal for the '<em><b>Property Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__PROPERTY_TYPE = eINSTANCE.getProject_PropertyType();

		/**
		 * The meta object literal for the '{@link de.jutzig.jabylon.properties.impl.ProjectVersionImpl <em>Project Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jutzig.jabylon.properties.impl.ProjectVersionImpl
		 * @see de.jutzig.jabylon.properties.impl.PropertiesPackageImpl#getProjectVersion()
		 * @generated
		 */
		EClass PROJECT_VERSION = eINSTANCE.getProjectVersion();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_VERSION__PROJECT = eINSTANCE.getProjectVersion_Project();

		/**
		 * The meta object literal for the '<em><b>Branch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_VERSION__BRANCH = eINSTANCE.getProjectVersion_Branch();

		/**
		 * The meta object literal for the '<em><b>Locales</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_VERSION__LOCALES = eINSTANCE.getProjectVersion_Locales();

		/**
		 * The meta object literal for the '<em><b>Master</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_VERSION__MASTER = eINSTANCE.getProjectVersion_Master();

		/**
		 * The meta object literal for the '{@link de.jutzig.jabylon.properties.impl.ProjectLocaleImpl <em>Project Locale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jutzig.jabylon.properties.impl.ProjectLocaleImpl
		 * @see de.jutzig.jabylon.properties.impl.PropertiesPackageImpl#getProjectLocale()
		 * @generated
		 */
		EClass PROJECT_LOCALE = eINSTANCE.getProjectLocale();

		/**
		 * The meta object literal for the '<em><b>Project Version</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_LOCALE__PROJECT_VERSION = eINSTANCE.getProjectLocale_ProjectVersion();

		/**
		 * The meta object literal for the '<em><b>Locale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_LOCALE__LOCALE = eINSTANCE.getProjectLocale_Locale();

		/**
		 * The meta object literal for the '<em><b>Descriptors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_LOCALE__DESCRIPTORS = eINSTANCE.getProjectLocale_Descriptors();

		/**
		 * The meta object literal for the '<em><b>Property Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_LOCALE__PROPERTY_COUNT = eINSTANCE.getProjectLocale_PropertyCount();

		/**
		 * The meta object literal for the '{@link de.jutzig.jabylon.properties.impl.WorkspaceImpl <em>Workspace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jutzig.jabylon.properties.impl.WorkspaceImpl
		 * @see de.jutzig.jabylon.properties.impl.PropertiesPackageImpl#getWorkspace()
		 * @generated
		 */
		EClass WORKSPACE = eINSTANCE.getWorkspace();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSPACE__ROOT = eINSTANCE.getWorkspace_Root();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSPACE__PROJECTS = eINSTANCE.getWorkspace_Projects();

		/**
		 * The meta object literal for the '{@link de.jutzig.jabylon.properties.impl.ResolvableImpl <em>Resolvable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jutzig.jabylon.properties.impl.ResolvableImpl
		 * @see de.jutzig.jabylon.properties.impl.PropertiesPackageImpl#getResolvable()
		 * @generated
		 */
		EClass RESOLVABLE = eINSTANCE.getResolvable();

		/**
		 * The meta object literal for the '<em><b>Percent Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVABLE__PERCENT_COMPLETE = eINSTANCE.getResolvable_PercentComplete();

		/**
		 * The meta object literal for the '{@link de.jutzig.jabylon.properties.impl.ScanConfigurationImpl <em>Scan Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jutzig.jabylon.properties.impl.ScanConfigurationImpl
		 * @see de.jutzig.jabylon.properties.impl.PropertiesPackageImpl#getScanConfiguration()
		 * @generated
		 */
		EClass SCAN_CONFIGURATION = eINSTANCE.getScanConfiguration();

		/**
		 * The meta object literal for the '<em><b>Excludes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCAN_CONFIGURATION__EXCLUDES = eINSTANCE.getScanConfiguration_Excludes();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCAN_CONFIGURATION__INCLUDES = eINSTANCE.getScanConfiguration_Includes();

		/**
		 * The meta object literal for the '<em><b>Master Locale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCAN_CONFIGURATION__MASTER_LOCALE = eINSTANCE.getScanConfiguration_MasterLocale();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCAN_CONFIGURATION__INCLUDE = eINSTANCE.getScanConfiguration_Include();

		/**
		 * The meta object literal for the '<em><b>Exclude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCAN_CONFIGURATION__EXCLUDE = eINSTANCE.getScanConfiguration_Exclude();

		/**
		 * The meta object literal for the '{@link de.jutzig.jabylon.properties.PropertyType <em>Property Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jutzig.jabylon.properties.PropertyType
		 * @see de.jutzig.jabylon.properties.impl.PropertiesPackageImpl#getPropertyType()
		 * @generated
		 */
		EEnum PROPERTY_TYPE = eINSTANCE.getPropertyType();

		/**
		 * The meta object literal for the '<em>Locale</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Locale
		 * @see de.jutzig.jabylon.properties.impl.PropertiesPackageImpl#getLocale()
		 * @generated
		 */
		EDataType LOCALE = eINSTANCE.getLocale();

		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.URI
		 * @see de.jutzig.jabylon.properties.impl.PropertiesPackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

	}

} //PropertiesPackage
