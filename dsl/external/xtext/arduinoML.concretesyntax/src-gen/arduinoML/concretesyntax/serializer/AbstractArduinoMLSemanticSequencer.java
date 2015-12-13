/*
 * generated by Xtext
 */
package arduinoML.concretesyntax.serializer;

import arduinoML.Action;
import arduinoML.Actuator;
import arduinoML.App;
import arduinoML.ArduinoMLPackage;
import arduinoML.Sensor;
import arduinoML.State;
import arduinoML.Transition;
import arduinoML.concretesyntax.services.ArduinoMLGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
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
public abstract class AbstractArduinoMLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ArduinoMLGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ArduinoMLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ArduinoMLPackage.ACTION:
				sequence_Action(context, (Action) semanticObject); 
				return; 
			case ArduinoMLPackage.ACTUATOR:
				if(context == grammarAccess.getActuatorRule()) {
					sequence_Actuator(context, (Actuator) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getBrickRule()) {
					sequence_Brick(context, (Actuator) semanticObject); 
					return; 
				}
				else break;
			case ArduinoMLPackage.APP:
				sequence_App(context, (App) semanticObject); 
				return; 
			case ArduinoMLPackage.SENSOR:
				if(context == grammarAccess.getBrickRule()) {
					sequence_Brick(context, (Sensor) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSensorRule()) {
					sequence_Sensor(context, (Sensor) semanticObject); 
					return; 
				}
				else break;
			case ArduinoMLPackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case ArduinoMLPackage.TRANSITION:
				sequence_Transition(context, (Transition) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (actuator=[Actuator|EString] value=Signal)
	 */
	protected void sequence_Action(EObject context, Action semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ArduinoMLPackage.Literals.ACTION__ACTUATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArduinoMLPackage.Literals.ACTION__ACTUATOR));
			if(transientValues.isValueTransient(semanticObject, ArduinoMLPackage.Literals.ACTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArduinoMLPackage.Literals.ACTION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActionAccess().getActuatorActuatorEStringParserRuleCall_1_0_1(), semanticObject.getActuator());
		feeder.accept(grammarAccess.getActionAccess().getValueSignalEnumRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {Actuator}
	 */
	protected void sequence_Actuator(EObject context, Actuator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         initial=[State|EString] 
	 *         bricks+=Brick 
	 *         bricks+=Brick* 
	 *         states+=State 
	 *         states+=State*
	 *     )
	 */
	protected void sequence_App(EObject context, App semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString pin=EInt)
	 */
	protected void sequence_Brick(EObject context, Actuator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ArduinoMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArduinoMLPackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, ArduinoMLPackage.Literals.BRICK__PIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArduinoMLPackage.Literals.BRICK__PIN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getBrickAccess().getPinEIntParserRuleCall_3_0(), semanticObject.getPin());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString pin=EInt)
	 */
	protected void sequence_Brick(EObject context, Sensor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ArduinoMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArduinoMLPackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, ArduinoMLPackage.Literals.BRICK__PIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArduinoMLPackage.Literals.BRICK__PIN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getBrickAccess().getPinEIntParserRuleCall_3_0(), semanticObject.getPin());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {Sensor}
	 */
	protected void sequence_Sensor(EObject context, Sensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString actions+=Action actions+=Action* transition=Transition)
	 */
	protected void sequence_State(EObject context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sensor=[Sensor|EString] value=Signal next=[State|EString])
	 */
	protected void sequence_Transition(EObject context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
