/**
 */
package com.parallels.aps.ide.rqleditor.xtext.rql.rQL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see com.parallels.aps.ide.rqleditor.xtext.rql.rQL.RQLFactory
 * @model kind="package"
 * @generated
 */
public interface RQLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "rQL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.parallels.com/aps/ide/rqleditor/xtext/rql/RQL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "rQL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RQLPackage eINSTANCE = com.parallels.aps.ide.rqleditor.xtext.rql.rQL.impl.RQLPackageImpl.init();

  /**
   * The meta object id for the '{@link com.parallels.aps.ide.rqleditor.xtext.rql.rQL.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.parallels.aps.ide.rqleditor.xtext.rql.rQL.impl.ModelImpl
   * @see com.parallels.aps.ide.rqleditor.xtext.rql.rQL.impl.RQLPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Operands</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__OPERANDS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link com.parallels.aps.ide.rqleditor.xtext.rql.rQL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.parallels.aps.ide.rqleditor.xtext.rql.rQL.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute list '{@link com.parallels.aps.ide.rqleditor.xtext.rql.rQL.Model#getOperands <em>Operands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Operands</em>'.
   * @see com.parallels.aps.ide.rqleditor.xtext.rql.rQL.Model#getOperands()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Operands();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RQLFactory getRQLFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.parallels.aps.ide.rqleditor.xtext.rql.rQL.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.parallels.aps.ide.rqleditor.xtext.rql.rQL.impl.ModelImpl
     * @see com.parallels.aps.ide.rqleditor.xtext.rql.rQL.impl.RQLPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Operands</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__OPERANDS = eINSTANCE.getModel_Operands();

  }

} //RQLPackage
