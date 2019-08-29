/**
 */
package universityStudies;

import java.util.Date;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universityStudies.Result#getGrade <em>Grade</em>}</li>
 *   <li>{@link universityStudies.Result#getStudyplan <em>Studyplan</em>}</li>
 *   <li>{@link universityStudies.Result#getDate <em>Date</em>}</li>
 *   <li>{@link universityStudies.Result#getCandidateNr <em>Candidate Nr</em>}</li>
 *   <li>{@link universityStudies.Result#getCourse <em>Course</em>}</li>
 *   <li>{@link universityStudies.Result#getSemester <em>Semester</em>}</li>
 * </ul>
 *
 * @see universityStudies.UniversityStudiesPackage#getResult()
 * @model
 * @generated
 */
public interface Result extends EObject {
	/**
	 * Returns the value of the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade</em>' attribute.
	 * @see #setGrade(char)
	 * @see universityStudies.UniversityStudiesPackage#getResult_Grade()
	 * @model
	 * @generated
	 */
	char getGrade();

	/**
	 * Sets the value of the '{@link universityStudies.Result#getGrade <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade</em>' attribute.
	 * @see #getGrade()
	 * @generated
	 */
	void setGrade(char value);

	/**
	 * Returns the value of the '<em><b>Studyplan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Studyplan</em>' reference.
	 * @see #setStudyplan(StudyPlan)
	 * @see universityStudies.UniversityStudiesPackage#getResult_Studyplan()
	 * @model required="true"
	 * @generated
	 */
	StudyPlan getStudyplan();

	/**
	 * Sets the value of the '{@link universityStudies.Result#getStudyplan <em>Studyplan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Studyplan</em>' reference.
	 * @see #getStudyplan()
	 * @generated
	 */
	void setStudyplan(StudyPlan value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see universityStudies.UniversityStudiesPackage#getResult_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link universityStudies.Result#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Candidate Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Candidate Nr</em>' attribute.
	 * @see #setCandidateNr(int)
	 * @see universityStudies.UniversityStudiesPackage#getResult_CandidateNr()
	 * @model
	 * @generated
	 */
	int getCandidateNr();

	/**
	 * Sets the value of the '{@link universityStudies.Result#getCandidateNr <em>Candidate Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Candidate Nr</em>' attribute.
	 * @see #getCandidateNr()
	 * @generated
	 */
	void setCandidateNr(int value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference.
	 * @see #setCourse(Course)
	 * @see universityStudies.UniversityStudiesPackage#getResult_Course()
	 * @model required="true"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link universityStudies.Result#getCourse <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' reference.
	 * @see #setSemester(Semester)
	 * @see universityStudies.UniversityStudiesPackage#getResult_Semester()
	 * @model required="true"
	 * @generated
	 */
	Semester getSemester();

	/**
	 * Sets the value of the '{@link universityStudies.Result#getSemester <em>Semester</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' reference.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(Semester value);

} // Result
