/**
 */
package universityStudies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universityStudies.Department#getCourses <em>Courses</em>}</li>
 *   <li>{@link universityStudies.Department#getProgrammes <em>Programmes</em>}</li>
 * </ul>
 *
 * @see universityStudies.UniversityStudiesPackage#getDepartment()
 * @model
 * @generated
 */
public interface Department extends EObject {
	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link universityStudies.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see universityStudies.UniversityStudiesPackage#getDepartment_Courses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Programmes</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link universityStudies.Programme#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programmes</em>' containment reference.
	 * @see #setProgrammes(Programme)
	 * @see universityStudies.UniversityStudiesPackage#getDepartment_Programmes()
	 * @see universityStudies.Programme#getDepartment
	 * @model opposite="Department" containment="true"
	 * @generated
	 */
	Programme getProgrammes();

	/**
	 * Sets the value of the '{@link universityStudies.Department#getProgrammes <em>Programmes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programmes</em>' containment reference.
	 * @see #getProgrammes()
	 * @generated
	 */
	void setProgrammes(Programme value);

} // Department
