/*
* generated by Xtext
*/
package com.parallels.aps.ide.rqleditor.xtext.rql.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.parallels.aps.ide.rqleditor.xtext.rql.services.RQLGrammarAccess;

public class RQLParser extends AbstractContentAssistParser {
	
	@Inject
	private RQLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.parallels.aps.ide.rqleditor.xtext.rql.ui.contentassist.antlr.internal.InternalRQLParser createParser() {
		com.parallels.aps.ide.rqleditor.xtext.rql.ui.contentassist.antlr.internal.InternalRQLParser result = new com.parallels.aps.ide.rqleditor.xtext.rql.ui.contentassist.antlr.internal.InternalRQLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getModelAccess().getAlternatives_1_0(), "rule__Model__Alternatives_1_0");
					put(grammarAccess.getOrAccess().getAlternatives_0(), "rule__Or__Alternatives_0");
					put(grammarAccess.getHoOperandAccess().getAlternatives_1(), "rule__HoOperand__Alternatives_1");
					put(grammarAccess.getHoOperandAccess().getAlternatives_1_4_2(), "rule__HoOperand__Alternatives_1_4_2");
					put(grammarAccess.getBinaryOpAliasesWithEqualsSignAccess().getAlternatives(), "rule__BinaryOpAliasesWithEqualsSign__Alternatives");
					put(grammarAccess.getBinaryOpAliasesAccess().getAlternatives(), "rule__BinaryOpAliases__Alternatives");
					put(grammarAccess.getCompOpsAccess().getAlternatives(), "rule__CompOps__Alternatives");
					put(grammarAccess.getComparisonAccess().getAlternatives_2(), "rule__Comparison__Alternatives_2");
					put(grammarAccess.getCallOperatorAccess().getAlternatives_0(), "rule__CallOperator__Alternatives_0");
					put(grammarAccess.getPredTblAccess().getAlternatives(), "rule__PredTbl__Alternatives");
					put(grammarAccess.getPrimaryExprAccess().getAlternatives_1(), "rule__PrimaryExpr__Alternatives_1");
					put(grammarAccess.getFunctionsTblAccess().getAlternatives(), "rule__FunctionsTbl__Alternatives");
					put(grammarAccess.getConstFuncTblAccess().getAlternatives(), "rule__ConstFuncTbl__Alternatives");
					put(grammarAccess.getNcharAccess().getAlternatives(), "rule__Nchar__Alternatives");
					put(grammarAccess.getStrvalAccess().getAlternatives(), "rule__Strval__Alternatives");
					put(grammarAccess.getLogicalOpAliasesAccess().getAlternatives(), "rule__LogicalOpAliases__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getModelAccess().getGroup_1(), "rule__Model__Group_1__0");
					put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
					put(grammarAccess.getOrAccess().getGroup(), "rule__Or__Group__0");
					put(grammarAccess.getHoOperandAccess().getGroup(), "rule__HoOperand__Group__0");
					put(grammarAccess.getHoOperandAccess().getGroup_1_4(), "rule__HoOperand__Group_1_4__0");
					put(grammarAccess.getHigherOrderCallAccess().getGroup(), "rule__HigherOrderCall__Group__0");
					put(grammarAccess.getHigherOrderCallAccess().getGroup_3(), "rule__HigherOrderCall__Group_3__0");
					put(grammarAccess.getHigherOrderCallAccess().getGroup_3_1(), "rule__HigherOrderCall__Group_3_1__0");
					put(grammarAccess.getComparisonAccess().getGroup(), "rule__Comparison__Group__0");
					put(grammarAccess.getCallOperatorAccess().getGroup(), "rule__CallOperator__Group__0");
					put(grammarAccess.getCallOperatorAccess().getGroup_3(), "rule__CallOperator__Group_3__0");
					put(grammarAccess.getCallOperatorAccess().getGroup_3_1(), "rule__CallOperator__Group_3_1__0");
					put(grammarAccess.getPredicateAccess().getGroup(), "rule__Predicate__Group__0");
					put(grammarAccess.getPredicateAccess().getGroup_3(), "rule__Predicate__Group_3__0");
					put(grammarAccess.getPredicateAccess().getGroup_3_1(), "rule__Predicate__Group_3_1__0");
					put(grammarAccess.getPrimaryExprAccess().getGroup(), "rule__PrimaryExpr__Group__0");
					put(grammarAccess.getPrimaryExprAccess().getGroup_1_0(), "rule__PrimaryExpr__Group_1_0__0");
					put(grammarAccess.getArrayAccess().getGroup(), "rule__Array__Group__0");
					put(grammarAccess.getArrayAccess().getGroup_4(), "rule__Array__Group_4__0");
					put(grammarAccess.getPct_encodedAccess().getGroup(), "rule__Pct_encoded__Group__0");
					put(grammarAccess.getModelAccess().getOperandsAssignment_0(), "rule__Model__OperandsAssignment_0");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.parallels.aps.ide.rqleditor.xtext.rql.ui.contentassist.antlr.internal.InternalRQLParser typedParser = (com.parallels.aps.ide.rqleditor.xtext.rql.ui.contentassist.antlr.internal.InternalRQLParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] {  };
	}
	
	public RQLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(RQLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
