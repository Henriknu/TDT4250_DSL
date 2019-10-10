/**
 */
package universityStudies.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import universityStudies.Course;
import universityStudies.ElectiveCourseSlot;
import universityStudies.UniversityStudiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elective Course Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link universityStudies.impl.ElectiveCourseSlotImpl#getOptionalCourses <em>Optional Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElectiveCourseSlotImpl extends CourseSlotImpl implements ElectiveCourseSlot {
	/**
	 * The cached value of the '{@link #getOptionalCourses() <em>Optional Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> optionalCourses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectiveCourseSlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityStudiesPackage.Literals.ELECTIVE_COURSE_SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getOptionalCourses() {
		if (optionalCourses == null) {
			optionalCourses = new EObjectResolvingEList<Course>(Course.class, this, UniversityStudiesPackage.ELECTIVE_COURSE_SLOT__OPTIONAL_COURSES);
		}
		return optionalCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UniversityStudiesPackage.ELECTIVE_COURSE_SLOT__OPTIONAL_COURSES:
				return getOptionalCourses();
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
			case UniversityStudiesPackage.ELECTIVE_COURSE_SLOT__OPTIONAL_COURSES:
				getOptionalCourses().clear();
				getOptionalCourses().addAll((Collection<? extends Course>)newValue);
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
			case UniversityStudiesPackage.ELECTIVE_COURSE_SLOT__OPTIONAL_COURSES:
				getOptionalCourses().clear();
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
			case UniversityStudiesPackage.ELECTIVE_COURSE_SLOT__OPTIONAL_COURSES:
				return optionalCourses != null && !optionalCourses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElectiveCourseSlotImpl
