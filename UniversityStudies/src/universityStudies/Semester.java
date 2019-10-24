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
 *   <li>{@link universityStudies.Semester#getSeason <em>Season</em>}</li>
 *   <li>{@link universityStudies.Semester#getSemesterNumber <em>Semester Number</em>}</li>
 *   <li>{@link universityStudies.Semester#getCourseSlots <em>Course Slots</em>}</li>
 *   <li>{@link universityStudies.Semester#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see universityStudies.UniversityStudiesPackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='isValidSeason courseNotNull enoughPoints'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL courseNotNull='self.courseSlots.course -&gt; notEmpty()'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Season</b></em>' attribute.
	 * The literals are from the enumeration {@link universityStudies.Seasons}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season</em>' attribute.
	 * @see universityStudies.Seasons
	 * @see #setSeason(Seasons)
	 * @see universityStudies.UniversityStudiesPackage#getSemester_Season()
	 * @model
	 * @generated
	 */
	Seasons getSeason();

	/**
	 * Sets the value of the '{@link universityStudies.Semester#getSeason <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Season</em>' attribute.
	 * @see universityStudies.Seasons
	 * @see #getSeason()
	 * @generated
	 */
	void setSeason(Seasons value);

	/**
	 * Returns the value of the '<em><b>Semester Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Number</em>' attribute.
	 * @see #setSemesterNumber(int)
	 * @see universityStudies.UniversityStudiesPackage#getSemester_SemesterNumber()
	 * @model
	 * @generated
	 */
	int getSemesterNumber();

	/**
	 * Sets the value of the '{@link universityStudies.Semester#getSemesterNumber <em>Semester Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester Number</em>' attribute.
	 * @see #getSemesterNumber()
	 * @generated
	 */
	void setSemesterNumber(int value);

	/**
	 * Returns the value of the '<em><b>Course Slots</b></em>' containment reference list.
	 * The list contents are of type {@link universityStudies.CourseSlot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Slots</em>' containment reference list.
	 * @see universityStudies.UniversityStudiesPackage#getSemester_CourseSlots()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CourseSlot> getCourseSlots();

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

} // Semester
