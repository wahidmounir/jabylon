/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.jutzig.jabylon.properties.tests;

import java.util.Locale;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import de.jutzig.jabylon.properties.PropertiesFactory;
import de.jutzig.jabylon.properties.PropertyFileDescriptor;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Property File Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link de.jutzig.jabylon.properties.PropertyFileDescriptor#isMaster() <em>Is Master</em>}</li>
 *   <li>{@link de.jutzig.jabylon.properties.PropertyFileDescriptor#loadProperties() <em>Load Properties</em>}</li>
 *   <li>{@link de.jutzig.jabylon.properties.PropertyFileDescriptor#computeLocation() <em>Compute Location</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PropertyFileDescriptorTest extends ResolvableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PropertyFileDescriptorTest.class);
	}

	/**
	 * Constructs a new Property File Descriptor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyFileDescriptorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Property File Descriptor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PropertyFileDescriptor getFixture() {
		return (PropertyFileDescriptor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PropertiesFactory.eINSTANCE.createPropertyFileDescriptor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link de.jutzig.jabylon.properties.PropertyFileDescriptor#isMaster() <em>Master</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jutzig.jabylon.properties.PropertyFileDescriptor#isMaster()
	 * @generated NOT
	 */
	public void testIsMaster() {
		assertTrue(getFixture().isMaster());
		getFixture().setVariant(Locale.FRENCH);
		assertFalse(getFixture().isMaster());
		getFixture().setVariant(null);
		assertTrue(getFixture().isMaster());
	}

	/**
	 * Tests the '{@link de.jutzig.jabylon.properties.PropertyFileDescriptor#loadProperties() <em>Load Properties</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jutzig.jabylon.properties.PropertyFileDescriptor#loadProperties()
	 * @generated
	 */
	public void testLoadProperties() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.jutzig.jabylon.properties.PropertyFileDescriptor#computeLocation() <em>Compute Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jutzig.jabylon.properties.PropertyFileDescriptor#computeLocation()
	 * @generated
	 */
	public void testComputeLocation() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

//	/**
//	 * Tests the '{@link de.jutzig.jabylon.properties.PropertyFileDescriptor#getPropertyFile() <em>Property File</em>}' feature getter.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @see de.jutzig.jabylon.properties.PropertyFileDescriptor#getPropertyFile()
//	 * @generated NOT
//	 */
//	public void testGetPropertyFile() {
//		assertNull(getFixture().getPropertyFile());
//		getFixture().setName("wiki_example.properties");
//		ResourceSet set = new ResourceSetImpl();
//		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Registry.DEFAULT_EXTENSION, new PropertiesResourceFactoryImpl());
//		Resource resource = set.createResource(URI.createFileURI("src"));
//		Workspace workspace = PropertiesFactory.eINSTANCE.createWorkspace();
//		resource.getContents().add(workspace);
//		workspace.setRoot(URI.createFileURI("../"));
//		
//		Project project = PropertiesFactory.eINSTANCE.createProject();
//		project.setName("de.jutzig.jabylon.properties");
//		workspace.getProjects().add(project);
//		
//		PropertyBag bag = PropertiesFactory.eINSTANCE.createPropertyBag();
//		bag.setPath(URI.createFileURI("src/test/resources/de/jutzig/jabylon/properties/util"));
//		bag.getDescriptors().add(getFixture());
//		project.getPropertyBags().add(bag);
//		
//		PropertyFile propertyFile = getFixture().getPropertyFile();
//		assertNotNull(propertyFile);
//		assertEquals(5, propertyFile.getProperties().size());
//		
////		resource
//	}



} //PropertyFileDescriptorTest
