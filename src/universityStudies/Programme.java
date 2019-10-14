/**
 */
package universityStudies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universityStudies.Programme#getNumberOfSemesters <em>Number Of Semesters</em>}</li>
 *   <li>{@link universityStudies.Programme#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link universityStudies.Programme#getName <em>Name</em>}</li>
 *   <li>{@link universityStudies.Programme#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link universityStudies.Programme#getDepartment <em>Department</em>}</li>
 *   <li>{@link universityStudies.Programme#getProgrammeType <em>Programme Type</em>}</li>
 * </ul>
 *
 * @see universityStudies.UniversityStudiesPackage#getProgramme()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validNumberOfSemesters'"
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Number Of Semesters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Semesters</em>' attribute.
	 * @see #setNumberOfSemesters(int)
	 * @see universityStudies.UniversityStudiesPackage#getProgramme_NumberOfSemesters()
	 * @model
	 * @generated
	 */
	int getNumberOfSemesters();

	/**
	 * Sets the value of the '{@link universityStudies.Programme#getNumberOfSemesters <em>Number Of Semesters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Semesters</em>' attribute.
	 * @see #getNumberOfSemesters()
	 * @generated
	 */
	void setNumberOfSemesters(int value);

	/**
	 * Returns the value of the '<em><b>Specializations</b></em>' containment reference list.
	 * The list contents are of type {@link universityStudies.Specialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializations</em>' containment reference list.
	 * @see universityStudies.UniversityStudiesPackage#getProgramme_Specializations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialization> getSpecializations();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see universityStudies.UniversityStudiesPackage#getProgramme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link universityStudies.Programme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link universityStudies.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see universityStudies.UniversityStudiesPackage#getProgramme_Semesters()
	 * @model containment="true" upper="10"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Department</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link universityStudies.Department#getProgrammes <em>Programmes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' container reference.
	 * @see #setDepartment(Department)
	 * @see universityStudies.UniversityStudiesPackage#getProgramme_Department()
	 * @see universityStudies.Department#getProgrammes
	 * @model opposite="Programmes" transient="false"
	 * @generated
	 */
	Department getDepartment();

	/**
	 * Sets the value of the '{@link universityStudies.Programme#getDepartment <em>Department</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' container reference.
	 * @see #getDepartment()
	 * @generated
	 */
	void setDepartment(Department value);

	/**
	 * Returns the value of the '<em><b>Programme Type</b></em>' attribute.
	 * The literals are from the enumeration {@link universityStudies.ProgrammeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme Type</em>' attribute.
	 * @see universityStudies.ProgrammeType
	 * @see #setProgrammeType(ProgrammeType)
	 * @see universityStudies.UniversityStudiesPackage#getProgramme_ProgrammeType()
	 * @model
	 * @generated
	 */
	ProgrammeType getProgrammeType();

	/**
	 * Sets the value of the '{@link universityStudies.Programme#getProgrammeType <em>Programme Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme Type</em>' attribute.
	 * @see universityStudies.ProgrammeType
	 * @see #getProgrammeType()
	 * @generated
	 */
	void setProgrammeType(ProgrammeType value);

} // Programme
