/**
 */
package universityStudies.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import universityStudies.CourseSlot;
import universityStudies.Semester;
import universityStudies.UniversityStudiesPackage;
import universityStudies.seasons;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link universityStudies.impl.SemesterImpl#getSeason <em>Season</em>}</li>
 *   <li>{@link universityStudies.impl.SemesterImpl#getSemesterNumber <em>Semester Number</em>}</li>
 *   <li>{@link universityStudies.impl.SemesterImpl#getCourseSlots <em>Course Slots</em>}</li>
 *   <li>{@link universityStudies.impl.SemesterImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The default value of the '{@link #getSeason() <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeason()
	 * @generated
	 * @ordered
	 */
	protected static final seasons SEASON_EDEFAULT = seasons.FALL;

	/**
	 * The cached value of the '{@link #getSeason() <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeason()
	 * @generated
	 * @ordered
	 */
	protected seasons season = SEASON_EDEFAULT;

	/**
	 * The default value of the '{@link #getSemesterNumber() <em>Semester Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SEMESTER_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSemesterNumber() <em>Semester Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterNumber()
	 * @generated
	 * @ordered
	 */
	protected int semesterNumber = SEMESTER_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourseSlots() <em>Course Slots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseSlots()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseSlot> courseSlots;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityStudiesPackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public seasons getSeason() {
		return season;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeason(seasons newSeason) {
		seasons oldSeason = season;
		season = newSeason == null ? SEASON_EDEFAULT : newSeason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityStudiesPackage.SEMESTER__SEASON, oldSeason, season));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSemesterNumber() {
		return semesterNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemesterNumber(int newSemesterNumber) {
		int oldSemesterNumber = semesterNumber;
		semesterNumber = newSemesterNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityStudiesPackage.SEMESTER__SEMESTER_NUMBER, oldSemesterNumber, semesterNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CourseSlot> getCourseSlots() {
		if (courseSlots == null) {
			courseSlots = new EObjectContainmentEList<CourseSlot>(CourseSlot.class, this, UniversityStudiesPackage.SEMESTER__COURSE_SLOTS);
		}
		return courseSlots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityStudiesPackage.SEMESTER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UniversityStudiesPackage.SEMESTER__COURSE_SLOTS:
				return ((InternalEList<?>)getCourseSlots()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UniversityStudiesPackage.SEMESTER__SEASON:
				return getSeason();
			case UniversityStudiesPackage.SEMESTER__SEMESTER_NUMBER:
				return getSemesterNumber();
			case UniversityStudiesPackage.SEMESTER__COURSE_SLOTS:
				return getCourseSlots();
			case UniversityStudiesPackage.SEMESTER__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UniversityStudiesPackage.SEMESTER__SEASON:
				setSeason((seasons)newValue);
				return;
			case UniversityStudiesPackage.SEMESTER__SEMESTER_NUMBER:
				setSemesterNumber((Integer)newValue);
				return;
			case UniversityStudiesPackage.SEMESTER__COURSE_SLOTS:
				getCourseSlots().clear();
				getCourseSlots().addAll((Collection<? extends CourseSlot>)newValue);
				return;
			case UniversityStudiesPackage.SEMESTER__NAME:
				setName((String)newValue);
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
			case UniversityStudiesPackage.SEMESTER__SEASON:
				setSeason(SEASON_EDEFAULT);
				return;
			case UniversityStudiesPackage.SEMESTER__SEMESTER_NUMBER:
				setSemesterNumber(SEMESTER_NUMBER_EDEFAULT);
				return;
			case UniversityStudiesPackage.SEMESTER__COURSE_SLOTS:
				getCourseSlots().clear();
				return;
			case UniversityStudiesPackage.SEMESTER__NAME:
				setName(NAME_EDEFAULT);
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
			case UniversityStudiesPackage.SEMESTER__SEASON:
				return season != SEASON_EDEFAULT;
			case UniversityStudiesPackage.SEMESTER__SEMESTER_NUMBER:
				return semesterNumber != SEMESTER_NUMBER_EDEFAULT;
			case UniversityStudiesPackage.SEMESTER__COURSE_SLOTS:
				return courseSlots != null && !courseSlots.isEmpty();
			case UniversityStudiesPackage.SEMESTER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (season: ");
		result.append(season);
		result.append(", semesterNumber: ");
		result.append(semesterNumber);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
