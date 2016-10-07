/**
 */
package dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.RowSpec#getHeader <em>Header</em>}</li>
 *   <li>{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.RowSpec#getSyntax <em>Syntax</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.SpreadsheetGrammarLanguagePackage#getRowSpec()
 * @model
 * @generated
 */
public interface RowSpec extends ColumnSpec
{
  /**
   * Returns the value of the '<em><b>Header</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Header</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Header</em>' attribute.
   * @see #setHeader(String)
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.SpreadsheetGrammarLanguagePackage#getRowSpec_Header()
   * @model
   * @generated
   */
  String getHeader();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.RowSpec#getHeader <em>Header</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Header</em>' attribute.
   * @see #getHeader()
   * @generated
   */
  void setHeader(String value);

  /**
   * Returns the value of the '<em><b>Syntax</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Syntax</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Syntax</em>' containment reference.
   * @see #setSyntax(Syntax)
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.SpreadsheetGrammarLanguagePackage#getRowSpec_Syntax()
   * @model containment="true"
   * @generated
   */
  Syntax getSyntax();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.RowSpec#getSyntax <em>Syntax</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Syntax</em>' containment reference.
   * @see #getSyntax()
   * @generated
   */
  void setSyntax(Syntax value);

} // RowSpec
