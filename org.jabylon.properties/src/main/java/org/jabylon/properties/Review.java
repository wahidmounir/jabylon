/**
 * (C) Copyright 2013 Jabylon (http://www.jabylon.org) and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jabylon.properties;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Review</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jabylon.properties.Review#getMessage <em>Message</em>}</li>
 *   <li>{@link org.jabylon.properties.Review#getUser <em>User</em>}</li>
 *   <li>{@link org.jabylon.properties.Review#getComments <em>Comments</em>}</li>
 *   <li>{@link org.jabylon.properties.Review#getState <em>State</em>}</li>
 *   <li>{@link org.jabylon.properties.Review#getReviewType <em>Review Type</em>}</li>
 *   <li>{@link org.jabylon.properties.Review#getKey <em>Key</em>}</li>
 *   <li>{@link org.jabylon.properties.Review#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.jabylon.properties.Review#getCreated <em>Created</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jabylon.properties.PropertiesPackage#getReview()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Review extends CDOObject {
    /**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.jabylon.properties.PropertiesPackage#getReview_Message()
	 * @model annotation="http://www.eclipse.org/CDO/DBStore columnType='VARCHAR' columnLength='1024'"
	 * @generated
	 */
    String getMessage();

    /**
	 * Sets the value of the '{@link org.jabylon.properties.Review#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
    void setMessage(String value);

    /**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>User</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see org.jabylon.properties.PropertiesPackage#getReview_User()
	 * @model annotation="http://www.eclipse.org/CDO/DBStore columnType='VARCHAR' columnLength='255'"
	 * @generated
	 */
    String getUser();

    /**
	 * Sets the value of the '{@link org.jabylon.properties.Review#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
    void setUser(String value);

    /**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
	 * The list contents are of type {@link org.jabylon.properties.Comment}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Comments</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference list.
	 * @see org.jabylon.properties.PropertiesPackage#getReview_Comments()
	 * @model containment="true"
	 * @generated
	 */
    EList<Comment> getComments();

    /**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.jabylon.properties.ReviewState}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>State</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.jabylon.properties.ReviewState
	 * @see #setState(ReviewState)
	 * @see org.jabylon.properties.PropertiesPackage#getReview_State()
	 * @model
	 * @generated
	 */
    ReviewState getState();

    /**
	 * Sets the value of the '{@link org.jabylon.properties.Review#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.jabylon.properties.ReviewState
	 * @see #getState()
	 * @generated
	 */
    void setState(ReviewState value);

    /**
	 * Returns the value of the '<em><b>Review Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * The kind of the review (human readable)
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Review Type</em>' attribute.
	 * @see #setReviewType(String)
	 * @see org.jabylon.properties.PropertiesPackage#getReview_ReviewType()
	 * @model annotation="http://www.eclipse.org/CDO/DBStore columnType='VARCHAR' columnLength='255'"
	 * @generated
	 */
    String getReviewType();

    /**
	 * Sets the value of the '{@link org.jabylon.properties.Review#getReviewType <em>Review Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * The kind of the review (human readable)
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Review Type</em>' attribute.
	 * @see #getReviewType()
	 * @generated
	 */
    void setReviewType(String value);

    /**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * The property key that this review applies to
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see org.jabylon.properties.PropertiesPackage#getReview_Key()
	 * @model annotation="http://www.eclipse.org/CDO/DBStore columnType='VARCHAR' columnLength='1024'"
	 * @generated
	 */
    String getKey();

    /**
	 * Sets the value of the '{@link org.jabylon.properties.Review#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * The property key that this review applies to
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
    void setKey(String value);

    /**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.jabylon.properties.Severity}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Severity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see org.jabylon.properties.Severity
	 * @see #setSeverity(Severity)
	 * @see org.jabylon.properties.PropertiesPackage#getReview_Severity()
	 * @model
	 * @generated
	 */
    Severity getSeverity();

    /**
	 * Sets the value of the '{@link org.jabylon.properties.Review#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see org.jabylon.properties.Severity
	 * @see #getSeverity()
	 * @generated
	 */
    void setSeverity(Severity value);

				/**
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * when this review was created
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(long)
	 * @see org.jabylon.properties.PropertiesPackage#getReview_Created()
	 * @model
	 * @generated
	 */
	long getCreated();

				/**
	 * Sets the value of the '{@link org.jabylon.properties.Review#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * when this review was created
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(long value);

	
	static final String KIND_SUGGESTION = "Suggestion";
} // Review
