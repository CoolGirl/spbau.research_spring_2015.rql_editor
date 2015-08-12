/**
 */
package com.parallels.aps.ide.rqleditor.xtext.rql.rQL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.parallels.aps.ide.rqleditor.xtext.rql.rQL.Model#getOperands <em>Operands</em>}</li>
 * </ul>
 *
 * @see com.parallels.aps.ide.rqleditor.xtext.rql.rQL.RQLPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Operands</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operands</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operands</em>' attribute list.
   * @see com.parallels.aps.ide.rqleditor.xtext.rql.rQL.RQLPackage#getModel_Operands()
   * @model unique="false"
   * @generated
   */
  EList<String> getOperands();

} // Model
