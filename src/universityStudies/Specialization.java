/**
 */
package universityStudies;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universityStudies.Specialization#getName <em>Name</em>}</li>
 *   <li>{@link universityStudies.Specialization#getFurtherSpecializations <em>Further Specializations</em>}</li>
 *   <li>{@link universityStudies.Specialization#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see universityStudies.UniversityStudiesPackage#getSpecialization()
 * @model
 * @generated
 */
public interface Specialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see universityStudies.UniversityStudiesPackage#getSpecialization_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link universityStudies.Specialization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Further Specializations</b></em>' containment reference list.
	 * The list contents are of type {@link universityStudies.Specialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Further Specializations</em>' containment reference list.
	 * @see universityStudies.UniversityStudiesPackage#getSpecialization_FurtherSpecializations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialization> getFurtherSpecializations();

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link universityStudies.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see universityStudies.UniversityStudiesPackage#getSpecialization_Courses()
	 * @model
	 * @generated
	 */
	EList<Course> getCourses();

} // Specialization
