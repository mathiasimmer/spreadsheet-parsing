package dk.sdu.mmmi.sgl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import dk.sdu.mmmi.sgl.services.SpreadsheetGrammarLanguageGrammarAccess;
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Block;
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.BlockSpec;
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Column;
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Grammar;
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.MandatoryColumn;
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.OptionalColumn;
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.RowSpec;
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Rule;
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.SpreadsheetGrammarLanguagePackage;
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Syntax;
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.SyntaxSeq;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SpreadsheetGrammarLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SpreadsheetGrammarLanguageGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SpreadsheetGrammarLanguagePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SpreadsheetGrammarLanguagePackage.BLOCK:
				if(context == grammarAccess.getBlockRule() ||
				   context == grammarAccess.getElementRule()) {
					sequence_Block(context, (Block) semanticObject); 
					return; 
				}
				else break;
			case SpreadsheetGrammarLanguagePackage.BLOCK_SPEC:
				if(context == grammarAccess.getBlockSpecRule() ||
				   context == grammarAccess.getColumnSpecRule()) {
					sequence_BlockSpec(context, (BlockSpec) semanticObject); 
					return; 
				}
				else break;
			case SpreadsheetGrammarLanguagePackage.COLUMN:
				if(context == grammarAccess.getColumnRule()) {
					sequence_Column(context, (Column) semanticObject); 
					return; 
				}
				else break;
			case SpreadsheetGrammarLanguagePackage.GRAMMAR:
				if(context == grammarAccess.getGrammarRule()) {
					sequence_Grammar(context, (Grammar) semanticObject); 
					return; 
				}
				else break;
			case SpreadsheetGrammarLanguagePackage.MANDATORY_COLUMN:
				if(context == grammarAccess.getColumnDefinitionRule() ||
				   context == grammarAccess.getMandatoryColumnRule()) {
					sequence_MandatoryColumn(context, (MandatoryColumn) semanticObject); 
					return; 
				}
				else break;
			case SpreadsheetGrammarLanguagePackage.OPTIONAL_COLUMN:
				if(context == grammarAccess.getColumnDefinitionRule() ||
				   context == grammarAccess.getOptionalColumnRule()) {
					sequence_OptionalColumn(context, (OptionalColumn) semanticObject); 
					return; 
				}
				else break;
			case SpreadsheetGrammarLanguagePackage.ROW_SPEC:
				if(context == grammarAccess.getColumnSpecRule() ||
				   context == grammarAccess.getRowSpecRule()) {
					sequence_RowSpec(context, (RowSpec) semanticObject); 
					return; 
				}
				else break;
			case SpreadsheetGrammarLanguagePackage.RULE:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getRuleRule()) {
					sequence_Rule(context, (Rule) semanticObject); 
					return; 
				}
				else break;
			case SpreadsheetGrammarLanguagePackage.SYNTAX:
				if(context == grammarAccess.getSyntaxRule()) {
					sequence_Syntax(context, (Syntax) semanticObject); 
					return; 
				}
				else break;
			case SpreadsheetGrammarLanguagePackage.SYNTAX_SEQ:
				if(context == grammarAccess.getSyntaxSeqRule()) {
					sequence_SyntaxSeq(context, (SyntaxSeq) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     kind=[Block|ID]
	 */
	protected void sequence_BlockSpec(EObject context, BlockSpec semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpreadsheetGrammarLanguagePackage.Literals.BLOCK_SPEC__KIND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpreadsheetGrammarLanguagePackage.Literals.BLOCK_SPEC__KIND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBlockSpecAccess().getKindBlockIDTerminalRuleCall_1_0_1(), semanticObject.getKind());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID columns+=Column*)
	 */
	protected void sequence_Block(EObject context, Block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID multiple?='*'? def=ColumnDefinition)
	 */
	protected void sequence_Column(EObject context, Column semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID root=[Block|ID] elements+=Element*)
	 */
	protected void sequence_Grammar(EObject context, Grammar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     spec=ColumnSpec
	 */
	protected void sequence_MandatoryColumn(EObject context, MandatoryColumn semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpreadsheetGrammarLanguagePackage.Literals.COLUMN_DEFINITION__SPEC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpreadsheetGrammarLanguagePackage.Literals.COLUMN_DEFINITION__SPEC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMandatoryColumnAccess().getSpecColumnSpecParserRuleCall_1_0(), semanticObject.getSpec());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     spec=ColumnSpec
	 */
	protected void sequence_OptionalColumn(EObject context, OptionalColumn semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpreadsheetGrammarLanguagePackage.Literals.COLUMN_DEFINITION__SPEC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpreadsheetGrammarLanguagePackage.Literals.COLUMN_DEFINITION__SPEC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOptionalColumnAccess().getSpecColumnSpecParserRuleCall_1_0(), semanticObject.getSpec());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (header=STRING syntax=Syntax)
	 */
	protected void sequence_RowSpec(EObject context, RowSpec semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpreadsheetGrammarLanguagePackage.Literals.ROW_SPEC__HEADER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpreadsheetGrammarLanguagePackage.Literals.ROW_SPEC__HEADER));
			if(transientValues.isValueTransient(semanticObject, SpreadsheetGrammarLanguagePackage.Literals.ROW_SPEC__SYNTAX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpreadsheetGrammarLanguagePackage.Literals.ROW_SPEC__SYNTAX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRowSpecAccess().getHeaderSTRINGTerminalRuleCall_1_0(), semanticObject.getHeader());
		feeder.accept(grammarAccess.getRowSpecAccess().getSyntaxSyntaxParserRuleCall_3_0(), semanticObject.getSyntax());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID alternatives+=SyntaxSeq alternatives+=SyntaxSeq*)
	 */
	protected void sequence_Rule(EObject context, Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     parts+=Syntax+
	 */
	protected void sequence_SyntaxSeq(EObject context, SyntaxSeq semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (is_id?='IDENTIFIER' | is_string?='STRING' | is_int?='INTEGER' | token=STRING | rule=[Rule|ID])
	 */
	protected void sequence_Syntax(EObject context, Syntax semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
