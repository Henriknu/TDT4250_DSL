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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import universityStudies.Department;
import universityStudies.Programme;
import universityStudies.Semester;
import universityStudies.Specialization;
import universityStudies.UniversityStudiesPackage;
import universityStudies.programmeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link universityStudies.impl.ProgrammeImpl#getNumberOfSemesters <em>Number Of Semesters</em>}</li>
 *   <li>{@link universityStudies.impl.ProgrammeImpl#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link universityStudies.impl.ProgrammeImpl#getName <em>Name</em>}</li>
 *   <li>{@link universityStudies.impl.ProgrammeImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link universityStudies.impl.ProgrammeImpl#getDepartment <em>Department</em>}</li>
 *   <li>{@link universityStudies.impl.ProgrammeImpl#getProgrammeType <em>Programme Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeImpl extends MinimalEObjectImpl.Container implements Programme {
	/**
	 * The default value of the '{@link #getNumberOfSemesters() <em>Number Of Semesters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSemesters()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_SEMESTERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfSemesters() <em>Number Of Semesters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSemesters()
	 * @generated
	 * @ordered
	 */
	protected int numberOfSemesters = NUMBER_OF_SEMESTERS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecializations() <em>Specializations</em>}' containment reference list.
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
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semesters;

	/**
	 * The default value of the '{@link #getProgrammeType() <em>Programme Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammeType()
	 * @generated
	 * @ordered
	 */
	protected static final programmeType PROGRAMME_TYPE_EDEFAULT = programmeType.BACHELOR;

	/**
	 * The cached value of the '{@link #getProgrammeType() <em>Programme Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammeType()
	 * @generated
	 * @ordered
	 */
	protected programmeType programmeType = PROGRAMME_TYPE_EDEFAULT;

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
	public int getNumberOfSemesters() {
		return numberOfSemesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfSemesters(int newNumberOfSemesters) {
		int oldNumberOfSemesters = numberOfSemesters;
		numberOfSemesters = newNumberOfSemesters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityStudiesPackage.PROGRAMME__NUMBER_OF_SEMESTERS, oldNumberOfSemesters, numberOfSemesters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentEList<Semester>(Semester.class, this, UniversityStudiesPackage.PROGRAMME__SEMESTERS);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department getDepartment() {
		if (eContainerFeatureID() != UniversityStudiesPackage.PROGRAMME__DEPARTMENT) return null;
		return (Department)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepartment(Department newDepartment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDepartment, UniversityStudiesPackage.PROGRAMME__DEPARTMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepartment(Department newDepartment) {
		if (newDepartment != eInternalContainer() || (eContainerFeatureID() != UniversityStudiesPackage.PROGRAMME__DEPARTMENT && newDepartment != null)) {
			if (EcoreUtil.isAncestor(this, newDepartment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDepartment != null)
				msgs = ((InternalEObject)newDepartment).eInverseAdd(this, UniversityStudiesPackage.DEPARTMENT__PROGRAMMES, Department.class, msgs);
			msgs = basicSetDepartment(newDepartment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityStudiesPackage.PROGRAMME__DEPARTMENT, newDepartment, newDepartment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public programmeType getProgrammeType() {
		return programmeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgrammeType(programmeType newProgrammeType) {
		programmeType oldProgrammeType = programmeType;
		programmeType = newProgrammeType == null ? PROGRAMME_TYPE_EDEFAULT : newProgrammeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityStudiesPackage.PROGRAMME__PROGRAMME_TYPE, oldProgrammeType, programmeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UniversityStudiesPackage.PROGRAMME__DEPARTMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDepartment((Department)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UniversityStudiesPackage.PROGRAMME__SPECIALIZATIONS:
				return ((InternalEList<?>)getSpecializations()).basicRemove(otherEnd, msgs);
			case UniversityStudiesPackage.PROGRAMME__SEMESTERS:
				return ((InternalEList<?>)getSemesters()).basicRemove(otherEnd, msgs);
			case UniversityStudiesPackage.PROGRAMME__DEPARTMENT:
				return basicSetDepartment(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case UniversityStudiesPackage.PROGRAMME__DEPARTMENT:
				return eInternalContainer().eInverseRemove(this, UniversityStudiesPackage.DEPARTMENT__PROGRAMMES, Department.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specialization> getSpecializations() {
		if (specializations == null) {
			specializations = new EObjectContainmentEList<Specialization>(Specialization.class, this, UniversityStudiesPackage.PROGRAMME__SPECIALIZATIONS);
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UniversityStudiesPackage.PROGRAMME__NUMBER_OF_SEMESTERS:
				return getNumberOfSemesters();
			case UniversityStudiesPackage.PROGRAMME__SPECIALIZATIONS:
				return getSpecializations();
			case UniversityStudiesPackage.PROGRAMME__NAME:
				return getName();
			case UniversityStudiesPackage.PROGRAMME__SEMESTERS:
				return getSemesters();
			case UniversityStudiesPackage.PROGRAMME__DEPARTMENT:
				return getDepartment();
			case UniversityStudiesPackage.PROGRAMME__PROGRAMME_TYPE:
				return getProgrammeType();
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
			case UniversityStudiesPackage.PROGRAMME__NUMBER_OF_SEMESTERS:
				setNumberOfSemesters((Integer)newValue);
				return;
			case UniversityStudiesPackage.PROGRAMME__SPECIALIZATIONS:
				getSpecializations().clear();
				getSpecializations().addAll((Collection<? extends Specialization>)newValue);
				return;
			case UniversityStudiesPackage.PROGRAMME__NAME:
				setName((String)newValue);
				return;
			case UniversityStudiesPackage.PROGRAMME__SEMESTERS:
				getSemesters().clear();
				getSemesters().addAll((Collection<? extends Semester>)newValue);
				return;
			case UniversityStudiesPackage.PROGRAMME__DEPARTMENT:
				setDepartment((Department)newValue);
				return;
			case UniversityStudiesPackage.PROGRAMME__PROGRAMME_TYPE:
				setProgrammeType((programmeType)newValue);
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
			case UniversityStudiesPackage.PROGRAMME__NUMBER_OF_SEMESTERS:
				setNumberOfSemesters(NUMBER_OF_SEMESTERS_EDEFAULT);
				return;
			case UniversityStudiesPackage.PROGRAMME__SPECIALIZATIONS:
				getSpecializations().clear();
				return;
			case UniversityStudiesPackage.PROGRAMME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UniversityStudiesPackage.PROGRAMME__SEMESTERS:
				getSemesters().clear();
				return;
			case UniversityStudiesPackage.PROGRAMME__DEPARTMENT:
				setDepartment((Department)null);
				return;
			case UniversityStudiesPackage.PROGRAMME__PROGRAMME_TYPE:
				setProgrammeType(PROGRAMME_TYPE_EDEFAULT);
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
			case UniversityStudiesPackage.PROGRAMME__NUMBER_OF_SEMESTERS:
				return numberOfSemesters != NUMBER_OF_SEMESTERS_EDEFAULT;
			case UniversityStudiesPackage.PROGRAMME__SPECIALIZATIONS:
				return specializations != null && !specializations.isEmpty();
			case UniversityStudiesPackage.PROGRAMME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UniversityStudiesPackage.PROGRAMME__SEMESTERS:
				return semesters != null && !semesters.isEmpty();
			case UniversityStudiesPackage.PROGRAMME__DEPARTMENT:
				return getDepartment() != null;
			case UniversityStudiesPackage.PROGRAMME__PROGRAMME_TYPE:
				return programmeType != PROGRAMME_TYPE_EDEFAULT;
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
		result.append(" (numberOfSemesters: ");
		result.append(numberOfSemesters);
		result.append(", name: ");
		result.append(name);
		result.append(", programmeType: ");
		result.append(programmeType);
		result.append(')');
		return result.toString();
	}

} //ProgrammeImpl
