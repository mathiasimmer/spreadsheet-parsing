/**
 */
package dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl;

import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Rule;
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.SpreadsheetGrammarLanguagePackage;
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Syntax;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Syntax</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SyntaxImpl#isIs_id <em>Is id</em>}</li>
 *   <li>{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SyntaxImpl#isIs_string <em>Is string</em>}</li>
 *   <li>{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SyntaxImpl#isIs_int <em>Is int</em>}</li>
 *   <li>{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SyntaxImpl#getToken <em>Token</em>}</li>
 *   <li>{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.SyntaxImpl#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SyntaxImpl extends MinimalEObjectImpl.Container implements Syntax
{
  /**
   * The default value of the '{@link #isIs_id() <em>Is id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIs_id()
   * @generated
   * @ordered
   */
  protected static final boolean IS_ID_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIs_id() <em>Is id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIs_id()
   * @generated
   * @ordered
   */
  protected boolean is_id = IS_ID_EDEFAULT;

  /**
   * The default value of the '{@link #isIs_string() <em>Is string</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIs_string()
   * @generated
   * @ordered
   */
  protected static final boolean IS_STRING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIs_string() <em>Is string</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIs_string()
   * @generated
   * @ordered
   */
  protected boolean is_string = IS_STRING_EDEFAULT;

  /**
   * The default value of the '{@link #isIs_int() <em>Is int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIs_int()
   * @generated
   * @ordered
   */
  protected static final boolean IS_INT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIs_int() <em>Is int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIs_int()
   * @generated
   * @ordered
   */
  protected boolean is_int = IS_INT_EDEFAULT;

  /**
   * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToken()
   * @generated
   * @ordered
   */
  protected static final String TOKEN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToken()
   * @generated
   * @ordered
   */
  protected String token = TOKEN_EDEFAULT;

  /**
   * The cached value of the '{@link #getRule() <em>Rule</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRule()
   * @generated
   * @ordered
   */
  protected Rule rule;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SyntaxImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SpreadsheetGrammarLanguagePackage.Literals.SYNTAX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIs_id()
  {
    return is_id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIs_id(boolean newIs_id)
  {
    boolean oldIs_id = is_id;
    is_id = newIs_id;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetGrammarLanguagePackage.SYNTAX__IS_ID, oldIs_id, is_id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIs_string()
  {
    return is_string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIs_string(boolean newIs_string)
  {
    boolean oldIs_string = is_string;
    is_string = newIs_string;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetGrammarLanguagePackage.SYNTAX__IS_STRING, oldIs_string, is_string));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIs_int()
  {
    return is_int;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIs_int(boolean newIs_int)
  {
    boolean oldIs_int = is_int;
    is_int = newIs_int;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetGrammarLanguagePackage.SYNTAX__IS_INT, oldIs_int, is_int));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getToken()
  {
    return token;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToken(String newToken)
  {
    String oldToken = token;
    token = newToken;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetGrammarLanguagePackage.SYNTAX__TOKEN, oldToken, token));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule getRule()
  {
    if (rule != null && rule.eIsProxy())
    {
      InternalEObject oldRule = (InternalEObject)rule;
      rule = (Rule)eResolveProxy(oldRule);
      if (rule != oldRule)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpreadsheetGrammarLanguagePackage.SYNTAX__RULE, oldRule, rule));
      }
    }
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule basicGetRule()
  {
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRule(Rule newRule)
  {
    Rule oldRule = rule;
    rule = newRule;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetGrammarLanguagePackage.SYNTAX__RULE, oldRule, rule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SpreadsheetGrammarLanguagePackage.SYNTAX__IS_ID:
        return isIs_id();
      case SpreadsheetGrammarLanguagePackage.SYNTAX__IS_STRING:
        return isIs_string();
      case SpreadsheetGrammarLanguagePackage.SYNTAX__IS_INT:
        return isIs_int();
      case SpreadsheetGrammarLanguagePackage.SYNTAX__TOKEN:
        return getToken();
      case SpreadsheetGrammarLanguagePackage.SYNTAX__RULE:
        if (resolve) return getRule();
        return basicGetRule();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SpreadsheetGrammarLanguagePackage.SYNTAX__IS_ID:
        setIs_id((Boolean)newValue);
        return;
      case SpreadsheetGrammarLanguagePackage.SYNTAX__IS_STRING:
        setIs_string((Boolean)newValue);
        return;
      case SpreadsheetGrammarLanguagePackage.SYNTAX__IS_INT:
        setIs_int((Boolean)newValue);
        return;
      case SpreadsheetGrammarLanguagePackage.SYNTAX__TOKEN:
        setToken((String)newValue);
        return;
      case SpreadsheetGrammarLanguagePackage.SYNTAX__RULE:
        setRule((Rule)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SpreadsheetGrammarLanguagePackage.SYNTAX__IS_ID:
        setIs_id(IS_ID_EDEFAULT);
        return;
      case SpreadsheetGrammarLanguagePackage.SYNTAX__IS_STRING:
        setIs_string(IS_STRING_EDEFAULT);
        return;
      case SpreadsheetGrammarLanguagePackage.SYNTAX__IS_INT:
        setIs_int(IS_INT_EDEFAULT);
        return;
      case SpreadsheetGrammarLanguagePackage.SYNTAX__TOKEN:
        setToken(TOKEN_EDEFAULT);
        return;
      case SpreadsheetGrammarLanguagePackage.SYNTAX__RULE:
        setRule((Rule)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SpreadsheetGrammarLanguagePackage.SYNTAX__IS_ID:
        return is_id != IS_ID_EDEFAULT;
      case SpreadsheetGrammarLanguagePackage.SYNTAX__IS_STRING:
        return is_string != IS_STRING_EDEFAULT;
      case SpreadsheetGrammarLanguagePackage.SYNTAX__IS_INT:
        return is_int != IS_INT_EDEFAULT;
      case SpreadsheetGrammarLanguagePackage.SYNTAX__TOKEN:
        return TOKEN_EDEFAULT == null ? token != null : !TOKEN_EDEFAULT.equals(token);
      case SpreadsheetGrammarLanguagePackage.SYNTAX__RULE:
        return rule != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (is_id: ");
    result.append(is_id);
    result.append(", is_string: ");
    result.append(is_string);
    result.append(", is_int: ");
    result.append(is_int);
    result.append(", token: ");
    result.append(token);
    result.append(')');
    return result.toString();
  }

} //SyntaxImpl
