/**
 */
package dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Syntax</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Syntax#isIs_id <em>Is id</em>}</li>
 *   <li>{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Syntax#isIs_string <em>Is string</em>}</li>
 *   <li>{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Syntax#isIs_int <em>Is int</em>}</li>
 *   <li>{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Syntax#getToken <em>Token</em>}</li>
 *   <li>{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Syntax#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.SpreadsheetGrammarLanguagePackage#getSyntax()
 * @model
 * @generated
 */
public interface Syntax extends EObject
{
  /**
   * Returns the value of the '<em><b>Is id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is id</em>' attribute.
   * @see #setIs_id(boolean)
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.SpreadsheetGrammarLanguagePackage#getSyntax_Is_id()
   * @model
   * @generated
   */
  boolean isIs_id();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Syntax#isIs_id <em>Is id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is id</em>' attribute.
   * @see #isIs_id()
   * @generated
   */
  void setIs_id(boolean value);

  /**
   * Returns the value of the '<em><b>Is string</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is string</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is string</em>' attribute.
   * @see #setIs_string(boolean)
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.SpreadsheetGrammarLanguagePackage#getSyntax_Is_string()
   * @model
   * @generated
   */
  boolean isIs_string();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Syntax#isIs_string <em>Is string</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is string</em>' attribute.
   * @see #isIs_string()
   * @generated
   */
  void setIs_string(boolean value);

  /**
   * Returns the value of the '<em><b>Is int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is int</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is int</em>' attribute.
   * @see #setIs_int(boolean)
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.SpreadsheetGrammarLanguagePackage#getSyntax_Is_int()
   * @model
   * @generated
   */
  boolean isIs_int();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Syntax#isIs_int <em>Is int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is int</em>' attribute.
   * @see #isIs_int()
   * @generated
   */
  void setIs_int(boolean value);

  /**
   * Returns the value of the '<em><b>Token</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Token</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Token</em>' attribute.
   * @see #setToken(String)
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.SpreadsheetGrammarLanguagePackage#getSyntax_Token()
   * @model
   * @generated
   */
  String getToken();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Syntax#getToken <em>Token</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Token</em>' attribute.
   * @see #getToken()
   * @generated
   */
  void setToken(String value);

  /**
   * Returns the value of the '<em><b>Rule</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule</em>' reference.
   * @see #setRule(Rule)
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.SpreadsheetGrammarLanguagePackage#getSyntax_Rule()
   * @model
   * @generated
   */
  Rule getRule();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Syntax#getRule <em>Rule</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule</em>' reference.
   * @see #getRule()
   * @generated
   */
  void setRule(Rule value);

} // Syntax
