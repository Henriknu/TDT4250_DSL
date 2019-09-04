/**
 */
package universityStudies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universityStudies.Course#getName <em>Name</em>}</li>
 *   <li>{@link universityStudies.Course#getCode <em>Code</em>}</li>
 *   <li>{@link universityStudies.Course#getCredits <em>Credits</em>}</li>
 *   <li>{@link universityStudies.Course#getLevel <em>Level</em>}</li>
 *   <li>{@link universityStudies.Course#getProgrammes <em>Programmes</em>}</li>
 * </ul>
 *
 * @see universityStudies.UniversityStudiesPackage#getCourse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidCode Validcredits'"
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see universityStudies.UniversityStudiesPackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link universityStudies.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see universityStudies.UniversityStudiesPackage#getCourse_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link universityStudies.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute list.
	 * @see universityStudies.UniversityStudiesPackage#getCourse_Credits()
	 * @model lower="5" upper="60"
	 * @generated
	 */
	EList<Float> getCredits();

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute list.
	 * @see universityStudies.UniversityStudiesPackage#getCourse_Level()
	 * @model required="true" upper="4"
	 * @generated
	 */
	EList<Integer> getLevel();

	/**
	 * Returns the value of the '<em><b>Programmes</b></em>' containment reference list.
	 * The list contents are of type {@link universityStudies.Programme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programmes</em>' containment reference list.
	 * @see universityStudies.UniversityStudiesPackage#getCourse_Programmes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Programme> getProgrammes();

} // Course
