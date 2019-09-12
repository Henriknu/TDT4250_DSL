/**
 */
package universityStudies.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import universityStudies.Course;
import universityStudies.Programme;
import universityStudies.Specialization;
import universityStudies.UniversityStudiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link universityStudies.impl.ProgrammeImpl#getYears <em>Years</em>}</li>
 *   <li>{@link universityStudies.impl.ProgrammeImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link universityStudies.impl.ProgrammeImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link universityStudies.impl.ProgrammeImpl#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link universityStudies.impl.ProgrammeImpl#getName <em>Name</em>}</li>
 *   <li>{@link universityStudies.impl.ProgrammeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeImpl extends MinimalEObjectImpl.Container implements Programme {
	/**
	 * The default value of the '{@link #getYears() <em>Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYears()
	 * @generated
	 * @ordered
	 */
	protected static final int YEARS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYears() <em>Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYears()
	 * @generated
	 * @ordered
	 */
	protected int years = YEARS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSemesters() <em>Semesters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected static final int SEMESTERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected int semesters = SEMESTERS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * The cached value of the '{@link #getSpecializations() <em>Specializations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> specializations;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityStudiesPackage.Literals.PROGRAMME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYears() {
		return years;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYears(int newYears) {
		int oldYears = years;
		years = newYears;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityStudiesPackage.PROGRAMME__YEARS, oldYears, years));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSemesters() {
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemesters(int newSemesters) {
		int oldSemesters = semesters;
		semesters = newSemesters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityStudiesPackage.PROGRAMME__SEMESTERS, oldSemesters, semesters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectResolvingEList<Course>(Course.class, this, UniversityStudiesPackage.PROGRAMME__COURSES);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specialization> getSpecializations() {
		if (specializations == null) {
			specializations = new EObjectResolvingEList<Specialization>(Specialization.class, this, UniversityStudiesPackage.PROGRAMME__SPECIALIZATIONS);
		}
		return specializations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityStudiesPackage.PROGRAMME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityStudiesPackage.PROGRAMME__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UniversityStudiesPackage.PROGRAMME__YEARS:
				return getYears();
			case UniversityStudiesPackage.PROGRAMME__SEMESTERS:
				return getSemesters();
			case UniversityStudiesPackage.PROGRAMME__COURSES:
				return getCourses();
			case UniversityStudiesPackage.PROGRAMME__SPECIALIZATIONS:
				return getSpecializations();
			case UniversityStudiesPackage.PROGRAMME__NAME:
				return getName();
			case UniversityStudiesPackage.PROGRAMME__TYPE:
				return getType();
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
			case UniversityStudiesPackage.PROGRAMME__YEARS:
				setYears((Integer)newValue);
				return;
			case UniversityStudiesPackage.PROGRAMME__SEMESTERS:
				setSemesters((Integer)newValue);
				return;
			case UniversityStudiesPackage.PROGRAMME__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case UniversityStudiesPackage.PROGRAMME__SPECIALIZATIONS:
				getSpecializations().clear();
				getSpecializations().addAll((Collection<? extends Specialization>)newValue);
				return;
			case UniversityStudiesPackage.PROGRAMME__NAME:
				setName((String)newValue);
				return;
			case UniversityStudiesPackage.PROGRAMME__TYPE:
				setType((String)newValue);
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
			case UniversityStudiesPackage.PROGRAMME__YEARS:
				setYears(YEARS_EDEFAULT);
				return;
			case UniversityStudiesPackage.PROGRAMME__SEMESTERS:
				setSemesters(SEMESTERS_EDEFAULT);
				return;
			case UniversityStudiesPackage.PROGRAMME__COURSES:
				getCourses().clear();
				return;
			case UniversityStudiesPackage.PROGRAMME__SPECIALIZATIONS:
				getSpecializations().clear();
				return;
			case UniversityStudiesPackage.PROGRAMME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UniversityStudiesPackage.PROGRAMME__TYPE:
				setType(TYPE_EDEFAULT);
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
			case UniversityStudiesPackage.PROGRAMME__YEARS:
				return years != YEARS_EDEFAULT;
			case UniversityStudiesPackage.PROGRAMME__SEMESTERS:
				return semesters != SEMESTERS_EDEFAULT;
			case UniversityStudiesPackage.PROGRAMME__COURSES:
				return courses != null && !courses.isEmpty();
			case UniversityStudiesPackage.PROGRAMME__SPECIALIZATIONS:
				return specializations != null && !specializations.isEmpty();
			case UniversityStudiesPackage.PROGRAMME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UniversityStudiesPackage.PROGRAMME__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (years: ");
		result.append(years);
		result.append(", semesters: ");
		result.append(semesters);
		result.append(", name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ProgrammeImpl
