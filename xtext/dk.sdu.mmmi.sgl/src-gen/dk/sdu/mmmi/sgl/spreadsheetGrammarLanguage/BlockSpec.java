/**
 */
package dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.BlockSpec#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.SpreadsheetGrammarLanguagePackage#getBlockSpec()
 * @model
 * @generated
 */
public interface BlockSpec extends ColumnSpec
{
  /**
   * Returns the value of the '<em><b>Kind</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' reference.
   * @see #setKind(Block)
   * @see dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.SpreadsheetGrammarLanguagePackage#getBlockSpec_Kind()
   * @model
   * @generated
   */
  Block getKind();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.BlockSpec#getKind <em>Kind</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' reference.
   * @see #getKind()
   * @generated
   */
  void setKind(Block value);

} // BlockSpec
