/**
 */
package dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl;

import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.RowSpec;
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.SpreadsheetGrammarLanguagePackage;
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Syntax;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Row Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.RowSpecImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.impl.RowSpecImpl#getSyntax <em>Syntax</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RowSpecImpl extends ColumnSpecImpl implements RowSpec
{
  /**
   * The default value of the '{@link #getHeader() <em>Header</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeader()
   * @generated
   * @ordered
   */
  protected static final String HEADER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHeader() <em>Header</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeader()
   * @generated
   * @ordered
   */
  protected String header = HEADER_EDEFAULT;

  /**
   * The cached value of the '{@link #getSyntax() <em>Syntax</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSyntax()
   * @generated
   * @ordered
   */
  protected Syntax syntax;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RowSpecImpl()
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
    return SpreadsheetGrammarLanguagePackage.Literals.ROW_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHeader()
  {
    return header;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeader(String newHeader)
  {
    String oldHeader = header;
    header = newHeader;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetGrammarLanguagePackage.ROW_SPEC__HEADER, oldHeader, header));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Syntax getSyntax()
  {
    return syntax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSyntax(Syntax newSyntax, NotificationChain msgs)
  {
    Syntax oldSyntax = syntax;
    syntax = newSyntax;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpreadsheetGrammarLanguagePackage.ROW_SPEC__SYNTAX, oldSyntax, newSyntax);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSyntax(Syntax newSyntax)
  {
    if (newSyntax != syntax)
    {
      NotificationChain msgs = null;
      if (syntax != null)
        msgs = ((InternalEObject)syntax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpreadsheetGrammarLanguagePackage.ROW_SPEC__SYNTAX, null, msgs);
      if (newSyntax != null)
        msgs = ((InternalEObject)newSyntax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpreadsheetGrammarLanguagePackage.ROW_SPEC__SYNTAX, null, msgs);
      msgs = basicSetSyntax(newSyntax, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpreadsheetGrammarLanguagePackage.ROW_SPEC__SYNTAX, newSyntax, newSyntax));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SpreadsheetGrammarLanguagePackage.ROW_SPEC__SYNTAX:
        return basicSetSyntax(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SpreadsheetGrammarLanguagePackage.ROW_SPEC__HEADER:
        return getHeader();
      case SpreadsheetGrammarLanguagePackage.ROW_SPEC__SYNTAX:
        return getSyntax();
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
      case SpreadsheetGrammarLanguagePackage.ROW_SPEC__HEADER:
        setHeader((String)newValue);
        return;
      case SpreadsheetGrammarLanguagePackage.ROW_SPEC__SYNTAX:
        setSyntax((Syntax)newValue);
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
      case SpreadsheetGrammarLanguagePackage.ROW_SPEC__HEADER:
        setHeader(HEADER_EDEFAULT);
        return;
      case SpreadsheetGrammarLanguagePackage.ROW_SPEC__SYNTAX:
        setSyntax((Syntax)null);
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
      case SpreadsheetGrammarLanguagePackage.ROW_SPEC__HEADER:
        return HEADER_EDEFAULT == null ? header != null : !HEADER_EDEFAULT.equals(header);
      case SpreadsheetGrammarLanguagePackage.ROW_SPEC__SYNTAX:
        return syntax != null;
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
    result.append(" (header: ");
    result.append(header);
    result.append(')');
    return result.toString();
  }

} //RowSpecImpl
