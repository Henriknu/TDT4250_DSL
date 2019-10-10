/**
 */
package universityStudies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universityStudies.StudyPlan#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link universityStudies.StudyPlan#getProgramme <em>Programme</em>}</li>
 *   <li>{@link universityStudies.StudyPlan#getResults <em>Results</em>}</li>
 *   <li>{@link universityStudies.StudyPlan#getSpecializations <em>Specializations</em>}</li>
 * </ul>
 *
 * @see universityStudies.UniversityStudiesPackage#getStudyPlan()
 * @model
 * @generated
 */
public interface StudyPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' reference list.
	 * The list contents are of type {@link universityStudies.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' reference list.
	 * @see universityStudies.UniversityStudiesPackage#getStudyPlan_Semesters()
	 * @model required="true"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Programme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme</em>' reference.
	 * @see #setProgramme(Programme)
	 * @see universityStudies.UniversityStudiesPackage#getStudyPlan_Programme()
	 * @model required="true"
	 * @generated
	 */
	Programme getProgramme();

	/**
	 * Sets the value of the '{@link universityStudies.StudyPlan#getProgramme <em>Programme</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme</em>' reference.
	 * @see #getProgramme()
	 * @generated
	 */
	void setProgramme(Programme value);

	/**
	 * Returns the value of the '<em><b>Results</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' reference.
	 * @see #setResults(Result)
	 * @see universityStudies.UniversityStudiesPackage#getStudyPlan_Results()
	 * @model
	 * @generated
	 */
	Result getResults();

	/**
	 * Sets the value of the '{@link universityStudies.StudyPlan#getResults <em>Results</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Results</em>' reference.
	 * @see #getResults()
	 * @generated
	 */
	void setResults(Result value);

	/**
	 * Returns the value of the '<em><b>Specializations</b></em>' reference list.
	 * The list contents are of type {@link universityStudies.Specialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializations</em>' reference list.
	 * @see universityStudies.UniversityStudiesPackage#getStudyPlan_Specializations()
	 * @model
	 * @generated
	 */
	EList<Specialization> getSpecializations();

} // StudyPlan
