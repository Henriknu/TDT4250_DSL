/**
 */
package universityStudies;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Programme Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see universityStudies.UniversityStudiesPackage#getProgrammeType()
 * @model
 * @generated
 */
public enum ProgrammeType implements Enumerator {
	/**
	 * The '<em><b>Bachelor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACHELOR_VALUE
	 * @generated
	 * @ordered
	 */
	BACHELOR(6, "Bachelor", "Bachelor"),

	/**
	 * The '<em><b>Master</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER_VALUE
	 * @generated
	 * @ordered
	 */
	MASTER(4, "Master", "Master"),

	/**
	 * The '<em><b>Integrert Master</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGRERT_MASTER_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGRERT_MASTER(10, "IntegrertMaster", "IntegrertMaster"),

	/**
	 * The '<em><b>Årsstudie</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ÅRSSTUDIE_VALUE
	 * @generated
	 * @ordered
	 */
	ÅRSSTUDIE(2, "Årsstudie", "\u00c5rsstudie");

	/**
	 * The '<em><b>Bachelor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACHELOR
	 * @model name="Bachelor"
	 * @generated
	 * @ordered
	 */
	public static final int BACHELOR_VALUE = 6;

	/**
	 * The '<em><b>Master</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER
	 * @model name="Master"
	 * @generated
	 * @ordered
	 */
	public static final int MASTER_VALUE = 4;

	/**
	 * The '<em><b>Integrert Master</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGRERT_MASTER
	 * @model name="IntegrertMaster"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGRERT_MASTER_VALUE = 10;

	/**
	 * The '<em><b>Årsstudie</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ÅRSSTUDIE
	 * @model name="Årsstudie"
	 * @generated
	 * @ordered
	 */
	public static final int ÅRSSTUDIE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Programme Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProgrammeType[] VALUES_ARRAY =
		new ProgrammeType[] {
			BACHELOR,
			MASTER,
			INTEGRERT_MASTER,
			ÅRSSTUDIE,
		};

	/**
	 * A public read-only list of all the '<em><b>Programme Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProgrammeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Programme Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProgrammeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProgrammeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Programme Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProgrammeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProgrammeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Programme Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProgrammeType get(int value) {
		switch (value) {
			case BACHELOR_VALUE: return BACHELOR;
			case MASTER_VALUE: return MASTER;
			case INTEGRERT_MASTER_VALUE: return INTEGRERT_MASTER;
			case ÅRSSTUDIE_VALUE: return ÅRSSTUDIE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ProgrammeType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ProgrammeType
