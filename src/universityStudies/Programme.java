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
 *   <li>{@link universityStudies.Programme#getYears <em>Years</em>}</li>
 *   <li>{@link universityStudies.Programme#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link universityStudies.Programme#getCourses <em>Courses</em>}</li>
 *   <li>{@link universityStudies.Programme#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link universityStudies.Programme#getName <em>Name</em>}</li>
 *   <li>{@link universityStudies.Programme#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see universityStudies.UniversityStudiesPackage#getProgramme()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidYears'"
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Years</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Years</em>' attribute.
	 * @see #setYears(int)
	 * @see universityStudies.UniversityStudiesPackage#getProgramme_Years()
	 * @model required="true"
	 * @generated
	 */
	int getYears();

	/**
	 * Sets the value of the '{@link universityStudies.Programme#getYears <em>Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Years</em>' attribute.
	 * @see #getYears()
	 * @generated
	 */
	void setYears(int value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' attribute.
	 * @see #setSemesters(int)
	 * @see universityStudies.UniversityStudiesPackage#getProgramme_Semesters()
	 * @model
	 * @generated
	 */
	int getSemesters();

	/**
	 * Sets the value of the '{@link universityStudies.Programme#getSemesters <em>Semesters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semesters</em>' attribute.
	 * @see #getSemesters()
	 * @generated
	 */
	void setSemesters(int value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link universityStudies.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see universityStudies.UniversityStudiesPackage#getProgramme_Courses()
	 * @model required="true"
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Specializations</b></em>' reference list.
	 * The list contents are of type {@link universityStudies.Specialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializations</em>' reference list.
	 * @see universityStudies.UniversityStudiesPackage#getProgramme_Specializations()
	 * @model
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
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see universityStudies.UniversityStudiesPackage#getProgramme_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link universityStudies.Programme#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Programme
