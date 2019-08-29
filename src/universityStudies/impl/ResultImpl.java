/**
 */
package universityStudies.impl;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import universityStudies.Course;
import universityStudies.Result;
import universityStudies.Semester;
import universityStudies.StudyPlan;
import universityStudies.UniversityStudiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link universityStudies.impl.ResultImpl#getGrade <em>Grade</em>}</li>
 *   <li>{@link universityStudies.impl.ResultImpl#getStudyplan <em>Studyplan</em>}</li>
 *   <li>{@link universityStudies.impl.ResultImpl#getDate <em>Date</em>}</li>
 *   <li>{@link universityStudies.impl.ResultImpl#getCandidateNr <em>Candidate Nr</em>}</li>
 *   <li>{@link universityStudies.impl.ResultImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link universityStudies.impl.ResultImpl#getSemester <em>Semester</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultImpl extends MinimalEObjectImpl.Container implements Result {
	/**
	 * The default value of the '{@link #getGrade() <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected static final char GRADE_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getGrade() <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected char grade = GRADE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStudyplan() <em>Studyplan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyplan()
	 * @generated
	 * @ordered
	 */
	protected StudyPlan studyplan;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCandidateNr() <em>Candidate Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidateNr()
	 * @generated
	 * @ordered
	 */
	protected static final int CANDIDATE_NR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCandidateNr() <em>Candidate Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidateNr()
	 * @generated
	 * @ordered
	 */
	protected int candidateNr = CANDIDATE_NR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected Course course;

	/**
	 * The cached value of the '{@link #getSemester() <em>Semester</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected Semester semester;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityStudiesPackage.Literals.RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char getGrade() {
		return grade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrade(char newGrade) {
		char oldGrade = grade;
		grade = newGrade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityStudiesPackage.RESULT__GRADE, oldGrade, grade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyPlan getStudyplan() {
		if (studyplan != null && studyplan.eIsProxy()) {
			InternalEObject oldStudyplan = (InternalEObject)studyplan;
			studyplan = (StudyPlan)eResolveProxy(oldStudyplan);
			if (studyplan != oldStudyplan) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UniversityStudiesPackage.RESULT__STUDYPLAN, oldStudyplan, studyplan));
			}
		}
		return studyplan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyPlan basicGetStudyplan() {
		return studyplan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudyplan(StudyPlan newStudyplan) {
		StudyPlan oldStudyplan = studyplan;
		studyplan = newStudyplan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityStudiesPackage.RESULT__STUDYPLAN, oldStudyplan, studyplan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityStudiesPackage.RESULT__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCandidateNr() {
		return candidateNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCandidateNr(int newCandidateNr) {
		int oldCandidateNr = candidateNr;
		candidateNr = newCandidateNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityStudiesPackage.RESULT__CANDIDATE_NR, oldCandidateNr, candidateNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course getCourse() {
		if (course != null && course.eIsProxy()) {
			InternalEObject oldCourse = (InternalEObject)course;
			course = (Course)eResolveProxy(oldCourse);
			if (course != oldCourse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UniversityStudiesPackage.RESULT__COURSE, oldCourse, course));
			}
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course basicGetCourse() {
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourse(Course newCourse) {
		Course oldCourse = course;
		course = newCourse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityStudiesPackage.RESULT__COURSE, oldCourse, course));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester getSemester() {
		if (semester != null && semester.eIsProxy()) {
			InternalEObject oldSemester = (InternalEObject)semester;
			semester = (Semester)eResolveProxy(oldSemester);
			if (semester != oldSemester) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UniversityStudiesPackage.RESULT__SEMESTER, oldSemester, semester));
			}
		}
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester basicGetSemester() {
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemester(Semester newSemester) {
		Semester oldSemester = semester;
		semester = newSemester;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityStudiesPackage.RESULT__SEMESTER, oldSemester, semester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UniversityStudiesPackage.RESULT__GRADE:
				return getGrade();
			case UniversityStudiesPackage.RESULT__STUDYPLAN:
				if (resolve) return getStudyplan();
				return basicGetStudyplan();
			case UniversityStudiesPackage.RESULT__DATE:
				return getDate();
			case UniversityStudiesPackage.RESULT__CANDIDATE_NR:
				return getCandidateNr();
			case UniversityStudiesPackage.RESULT__COURSE:
				if (resolve) return getCourse();
				return basicGetCourse();
			case UniversityStudiesPackage.RESULT__SEMESTER:
				if (resolve) return getSemester();
				return basicGetSemester();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UniversityStudiesPackage.RESULT__GRADE:
				setGrade((Character)newValue);
				return;
			case UniversityStudiesPackage.RESULT__STUDYPLAN:
				setStudyplan((StudyPlan)newValue);
				return;
			case UniversityStudiesPackage.RESULT__DATE:
				setDate((Date)newValue);
				return;
			case UniversityStudiesPackage.RESULT__CANDIDATE_NR:
				setCandidateNr((Integer)newValue);
				return;
			case UniversityStudiesPackage.RESULT__COURSE:
				setCourse((Course)newValue);
				return;
			case UniversityStudiesPackage.RESULT__SEMESTER:
				setSemester((Semester)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UniversityStudiesPackage.RESULT__GRADE:
				setGrade(GRADE_EDEFAULT);
				return;
			case UniversityStudiesPackage.RESULT__STUDYPLAN:
				setStudyplan((StudyPlan)null);
				return;
			case UniversityStudiesPackage.RESULT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case UniversityStudiesPackage.RESULT__CANDIDATE_NR:
				setCandidateNr(CANDIDATE_NR_EDEFAULT);
				return;
			case UniversityStudiesPackage.RESULT__COURSE:
				setCourse((Course)null);
				return;
			case UniversityStudiesPackage.RESULT__SEMESTER:
				setSemester((Semester)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UniversityStudiesPackage.RESULT__GRADE:
				return grade != GRADE_EDEFAULT;
			case UniversityStudiesPackage.RESULT__STUDYPLAN:
				return studyplan != null;
			case UniversityStudiesPackage.RESULT__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case UniversityStudiesPackage.RESULT__CANDIDATE_NR:
				return candidateNr != CANDIDATE_NR_EDEFAULT;
			case UniversityStudiesPackage.RESULT__COURSE:
				return course != null;
			case UniversityStudiesPackage.RESULT__SEMESTER:
				return semester != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (grade: ");
		result.append(grade);
		result.append(", date: ");
		result.append(date);
		result.append(", candidateNr: ");
		result.append(candidateNr);
		result.append(')');
		return result.toString();
	}

} //ResultImpl
