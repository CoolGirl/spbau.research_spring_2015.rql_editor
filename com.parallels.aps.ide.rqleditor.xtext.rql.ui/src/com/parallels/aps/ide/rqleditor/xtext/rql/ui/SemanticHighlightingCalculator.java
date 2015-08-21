package com.parallels.aps.ide.rqleditor.xtext.rql.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;

public class SemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		// TODO Auto-generated method stub		    
		        INode root = resource.getParseResult().getRootNode();
		        for(INode node : root.getAsTreeIterable()) {   
		            EObject grammarElement = node.getGrammarElement(); 
		            if(grammarElement instanceof RuleCall) {
		                RuleCall rc = (RuleCall)grammarElement;
		                AbstractRule r = rc.getRule();
		                EObject c = grammarElement.eContainer();

		                // It tests whether the node represents a name of an element (class, method, parameter).
		                if(r.getName().equals("LogicalOpAliases") || r.getName().equals("BinaryOpAliasesWithEqualsSign") || r.getName().equals("CompOps")
		                		|| r.getName().equals("BinaryOpAliases") || r.getName().equals("PredTbl") || r.getName().equals("FunctionsTbl")
		                		|| r.getName().equals("ConstFuncTbl")) {
		                    INode p = node.getParent();
		                    if (p != null && p.getGrammarElement() instanceof RuleCall) {
		                        rc = (RuleCall)p.getGrammarElement();
		                        AbstractRule r2 = rc.getRule();

		                        // It tests whether the parent node represents a method.                        
		                        
		                            acceptor.addPosition(node.getOffset(), node.getLength(), DefaultHighlightingConfiguration.KEYWORD_ID);
		                    }
		                }
		            }
		        }

	}
}