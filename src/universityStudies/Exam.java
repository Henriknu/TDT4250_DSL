/**
 */
package universityStudies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exam</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universityStudies.Exam#getCourses <em>Courses</em>}</li>
 *   <li>{@link universityStudies.Exam#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @see universityStudies.UniversityStudiesPackage#getExam()
 * @model
 * @generated
 */
public interface Exam extends EObject {
	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference.
	 * @see #setCourses(Course)
	 * @see universityStudies.UniversityStudiesPackage#getExam_Courses()
	 * @model
	 * @generated
	 */
	Course getCourses();

	/**
	 * Sets the value of the '{@link universityStudies.Exam#getCourses <em>Courses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Courses</em>' reference.
	 * @see #getCourses()
	 * @generated
	 */
	void setCourses(Course value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute list.
	 * @see universityStudies.UniversityStudiesPackage#getExam_Year()
	 * @model lower="1900" upper="2200"
	 * @generated
	 */
	EList<Integer> getYear();

} // Exam
