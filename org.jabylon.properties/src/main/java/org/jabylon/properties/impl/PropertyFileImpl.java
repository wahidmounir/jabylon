/**
 * (C) Copyright 2013 Jabylon (http://www.jabylon.org) and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jabylon.properties.impl;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.jabylon.properties.PropertiesPackage;
import org.jabylon.properties.Property;
import org.jabylon.properties.PropertyFile;
import org.jabylon.properties.util.SynchronizedEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Property File</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jabylon.properties.impl.PropertyFileImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.jabylon.properties.impl.PropertyFileImpl#getLicenseHeader <em>License Header</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyFileImpl extends CDOObjectImpl implements PropertyFile {
    /**
	 * The default value of the '{@link #getLicenseHeader() <em>License Header</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
	 * @see #getLicenseHeader()
	 * @generated
	 * @ordered
	 */
    protected static final String LICENSE_HEADER_EDEFAULT = null;
	private transient ConcurrentMap<String, Property> map;

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    protected PropertyFileImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return PropertiesPackage.Literals.PROPERTY_FILE;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected int eStaticFeatureCount() {
		return 0;
	}

    /**
     * <!-- begin-user-doc --> synchronized list to allow access from multiple
     * threads <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @SuppressWarnings("unchecked")
    public EList<Property> getProperties() {
        EList<Property> properties = (EList<Property>) eDynamicGet(PropertiesPackage.PROPERTY_FILE__PROPERTIES,
                PropertiesPackage.Literals.PROPERTY_FILE__PROPERTIES, true, true);
        return new SynchronizedEList<Property>(properties);
    }

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public String getLicenseHeader() {
		return (String)eDynamicGet(PropertiesPackage.PROPERTY_FILE__LICENSE_HEADER, PropertiesPackage.Literals.PROPERTY_FILE__LICENSE_HEADER, true, true);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public void setLicenseHeader(String newLicenseHeader) {
		eDynamicSet(PropertiesPackage.PROPERTY_FILE__LICENSE_HEADER, PropertiesPackage.Literals.PROPERTY_FILE__LICENSE_HEADER, newLicenseHeader);
	}

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public Property getProperty(String key) {
        EList<Property> eList = getProperties();
        synchronized (eList) {
            for (Property property : eList) {
                if (key.equals(property.getKey()))
                    return property;
            }
        }
        return null;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public Map<String, Property> asMap() {
        EList<Property> properties = getProperties();
        if(map!=null && properties.size()==map.size()) {
        	return map;
        }
        synchronized (properties) {
            map = new ConcurrentHashMap<String, Property>(properties.size());
            for (Property property : getProperties()) {
                map.put(property.getKey(), property);
            }
            return map;
        }
    }

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PropertiesPackage.PROPERTY_FILE__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PropertiesPackage.PROPERTY_FILE__PROPERTIES:
				return getProperties();
			case PropertiesPackage.PROPERTY_FILE__LICENSE_HEADER:
				return getLicenseHeader();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PropertiesPackage.PROPERTY_FILE__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case PropertiesPackage.PROPERTY_FILE__LICENSE_HEADER:
				setLicenseHeader((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eUnset(int featureID) {
		switch (featureID) {
			case PropertiesPackage.PROPERTY_FILE__PROPERTIES:
				getProperties().clear();
				return;
			case PropertiesPackage.PROPERTY_FILE__LICENSE_HEADER:
				setLicenseHeader(LICENSE_HEADER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PropertiesPackage.PROPERTY_FILE__PROPERTIES:
				return !getProperties().isEmpty();
			case PropertiesPackage.PROPERTY_FILE__LICENSE_HEADER:
				return LICENSE_HEADER_EDEFAULT == null ? getLicenseHeader() != null : !LICENSE_HEADER_EDEFAULT.equals(getLicenseHeader());
		}
		return super.eIsSet(featureID);
	}

} // PropertyFileImpl
