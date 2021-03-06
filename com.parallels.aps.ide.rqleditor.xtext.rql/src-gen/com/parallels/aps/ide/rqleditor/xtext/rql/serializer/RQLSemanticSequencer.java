package com.parallels.aps.ide.rqleditor.xtext.rql.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.parallels.aps.ide.rqleditor.xtext.rql.rQL.Model;
import com.parallels.aps.ide.rqleditor.xtext.rql.rQL.RQLPackage;
import com.parallels.aps.ide.rqleditor.xtext.rql.services.RQLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class RQLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RQLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == RQLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RQLPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     operands+=HoOperand
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
