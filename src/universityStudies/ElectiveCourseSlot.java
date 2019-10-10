/**
 */
package universityStudies;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elective Course Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universityStudies.ElectiveCourseSlot#getOptionalCourses <em>Optional Courses</em>}</li>
 * </ul>
 *
 * @see universityStudies.UniversityStudiesPackage#getElectiveCourseSlot()
 * @model
 * @generated
 */
public interface ElectiveCourseSlot extends CourseSlot {
	/**
	 * Returns the value of the '<em><b>Optional Courses</b></em>' reference list.
	 * The list contents are of type {@link universityStudies.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Courses</em>' reference list.
	 * @see universityStudies.UniversityStudiesPackage#getElectiveCourseSlot_OptionalCourses()
	 * @model
	 * @generated
	 */
	EList<Course> getOptionalCourses();

} // ElectiveCourseSlot
