/*
* generated by Xtext
*/
package com.parallels.aps.ide.rqleditor.xtext.rql.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import com.parallels.aps.ide.rqleditor.xtext.rql.services.RQLGrammarAccess;

public class RQLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private RQLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens();
	}
	
	@Override
	protected com.parallels.aps.ide.rqleditor.xtext.rql.parser.antlr.internal.InternalRQLParser createParser(XtextTokenStream stream) {
		return new com.parallels.aps.ide.rqleditor.xtext.rql.parser.antlr.internal.InternalRQLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public RQLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(RQLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
