package com.parallels.aps.ide.rqleditor.xtext.rql.serializer;

import com.google.inject.Inject;
import com.parallels.aps.ide.rqleditor.xtext.rql.services.RQLGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class RQLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected RQLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Model_____AmpersandKeyword_1_0_1_or_CommaKeyword_1_0_0___HoOperandParserRuleCall_1_1__a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (RQLGrammarAccess) access;
		match_Model_____AmpersandKeyword_1_0_1_or_CommaKeyword_1_0_0___HoOperandParserRuleCall_1_1__a = new GroupAlias(true, true, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getModelAccess().getAmpersandKeyword_1_0_1()), new TokenAlias(false, false, grammarAccess.getModelAccess().getCommaKeyword_1_0_0())), new TokenAlias(false, false, grammarAccess.getModelAccess().getHoOperandParserRuleCall_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getHoOperandRule())
			return getHoOperandToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * HoOperand:
	 * 	WSP* ( HigherOrderCall | CallOperator | Predicate | Comparison | ( '(' HoOperand (And | Or) ')' ))? WSP* '\r'? '\n'?
	 * ;
	 */
	protected String getHoOperandToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Model_____AmpersandKeyword_1_0_1_or_CommaKeyword_1_0_0___HoOperandParserRuleCall_1_1__a.equals(syntax))
				emit_Model_____AmpersandKeyword_1_0_1_or_CommaKeyword_1_0_0___HoOperandParserRuleCall_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ((',' | '&') HoOperand)*
	 */
	protected void emit_Model_____AmpersandKeyword_1_0_1_or_CommaKeyword_1_0_0___HoOperandParserRuleCall_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
