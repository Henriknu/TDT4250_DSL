/**
 */
package universityStudies;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universityStudies.Semester#getName <em>Name</em>}</li>
 *   <li>{@link universityStudies.Semester#getCourses <em>Courses</em>}</li>
 *   <li>{@link universityStudies.Semester#getYear <em>Year</em>}</li>
 *   <li>{@link universityStudies.Semester#getSeason <em>Season</em>}</li>
 *   <li>{@link universityStudies.Semester#getStudyplan <em>Studyplan</em>}</li>
 * </ul>
 *
 * @see universityStudies.UniversityStudiesPackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='isValidSeason CourseNotNull'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see universityStudies.UniversityStudiesPackage#getSemester_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link universityStudies.Semester#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link universityStudies.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see universityStudies.UniversityStudiesPackage#getSemester_Courses()
	 * @model required="true"
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see universityStudies.UniversityStudiesPackage#getSemester_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link universityStudies.Semester#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Season</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season</em>' attribute.
	 * @see #setSeason(String)
	 * @see universityStudies.UniversityStudiesPackage#getSemester_Season()
	 * @model
	 * @generated
	 */
	String getSeason();

	/**
	 * Sets the value of the '{@link universityStudies.Semester#getSeason <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Season</em>' attribute.
	 * @see #getSeason()
	 * @generated
	 */
	void setSeason(String value);

	/**
	 * Returns the value of the '<em><b>Studyplan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Studyplan</em>' reference.
	 * @see #setStudyplan(StudyPlan)
	 * @see universityStudies.UniversityStudiesPackage#getSemester_Studyplan()
	 * @model required="true"
	 * @generated
	 */
	StudyPlan getStudyplan();

	/**
	 * Sets the value of the '{@link universityStudies.Semester#getStudyplan <em>Studyplan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Studyplan</em>' reference.
	 * @see #getStudyplan()
	 * @generated
	 */
	void setStudyplan(StudyPlan value);

} // Semester
