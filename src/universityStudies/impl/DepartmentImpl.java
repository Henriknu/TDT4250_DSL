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

import universityStudies.Course;
import universityStudies.Department;
import universityStudies.Programme;
import universityStudies.UniversityStudiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link universityStudies.impl.DepartmentImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link universityStudies.impl.DepartmentImpl#getProgrammes <em>Programmes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepartmentImpl extends MinimalEObjectImpl.Container implements Department {
	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * The cached value of the '{@link #getProgrammes() <em>Programmes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammes()
	 * @generated
	 * @ordered
	 */
	protected Programme programmes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityStudiesPackage.Literals.DEPARTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectContainmentEList<Course>(Course.class, this, UniversityStudiesPackage.DEPARTMENT__COURSES);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Programme getProgrammes() {
		return programmes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgrammes(Programme newProgrammes, NotificationChain msgs) {
		Programme oldProgrammes = programmes;
		programmes = newProgrammes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UniversityStudiesPackage.DEPARTMENT__PROGRAMMES, oldProgrammes, newProgrammes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgrammes(Programme newProgrammes) {
		if (newProgrammes != programmes) {
			NotificationChain msgs = null;
			if (programmes != null)
				msgs = ((InternalEObject)programmes).eInverseRemove(this, UniversityStudiesPackage.PROGRAMME__DEPARTMENT, Programme.class, msgs);
			if (newProgrammes != null)
				msgs = ((InternalEObject)newProgrammes).eInverseAdd(this, UniversityStudiesPackage.PROGRAMME__DEPARTMENT, Programme.class, msgs);
			msgs = basicSetProgrammes(newProgrammes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityStudiesPackage.DEPARTMENT__PROGRAMMES, newProgrammes, newProgrammes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UniversityStudiesPackage.DEPARTMENT__PROGRAMMES:
				if (programmes != null)
					msgs = ((InternalEObject)programmes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UniversityStudiesPackage.DEPARTMENT__PROGRAMMES, null, msgs);
				return basicSetProgrammes((Programme)otherEnd, msgs);
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
			case UniversityStudiesPackage.DEPARTMENT__COURSES:
				return ((InternalEList<?>)getCourses()).basicRemove(otherEnd, msgs);
			case UniversityStudiesPackage.DEPARTMENT__PROGRAMMES:
				return basicSetProgrammes(null, msgs);
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
			case UniversityStudiesPackage.DEPARTMENT__COURSES:
				return getCourses();
			case UniversityStudiesPackage.DEPARTMENT__PROGRAMMES:
				return getProgrammes();
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
			case UniversityStudiesPackage.DEPARTMENT__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case UniversityStudiesPackage.DEPARTMENT__PROGRAMMES:
				setProgrammes((Programme)newValue);
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
			case UniversityStudiesPackage.DEPARTMENT__COURSES:
				getCourses().clear();
				return;
			case UniversityStudiesPackage.DEPARTMENT__PROGRAMMES:
				setProgrammes((Programme)null);
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
			case UniversityStudiesPackage.DEPARTMENT__COURSES:
				return courses != null && !courses.isEmpty();
			case UniversityStudiesPackage.DEPARTMENT__PROGRAMMES:
				return programmes != null;
		}
		return super.eIsSet(featureID);
	}

} //DepartmentImpl
