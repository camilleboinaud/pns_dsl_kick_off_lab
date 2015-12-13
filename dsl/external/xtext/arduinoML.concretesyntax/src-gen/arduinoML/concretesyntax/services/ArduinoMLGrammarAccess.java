/*
 * generated by Xtext
 */
package arduinoML.concretesyntax.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class ArduinoMLGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class AppElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "App");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAppKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cInitialKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cInitialAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cInitialStateCrossReference_3_0 = (CrossReference)cInitialAssignment_3.eContents().get(0);
		private final RuleCall cInitialStateEStringParserRuleCall_3_0_1 = (RuleCall)cInitialStateCrossReference_3_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cBricksKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cLeftCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cBricksAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cBricksBrickParserRuleCall_7_0 = (RuleCall)cBricksAssignment_7.eContents().get(0);
		private final Assignment cBricksAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cBricksBrickParserRuleCall_8_0 = (RuleCall)cBricksAssignment_8.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cStatesKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cLeftCurlyBracketKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cStatesAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cStatesStateParserRuleCall_12_0 = (RuleCall)cStatesAssignment_12.eContents().get(0);
		private final Assignment cStatesAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final RuleCall cStatesStateParserRuleCall_13_0 = (RuleCall)cStatesAssignment_13.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cRightCurlyBracketKeyword_15 = (Keyword)cGroup.eContents().get(15);
		
		//App:
		//	"app" name=EString "initial" initial=[State|EString] "{" "bricks" "{" bricks+=Brick bricks+=Brick* "}" "states" "{"
		//	states+=State states+=State* "}" "}";
		@Override public ParserRule getRule() { return rule; }

		//"app" name=EString "initial" initial=[State|EString] "{" "bricks" "{" bricks+=Brick bricks+=Brick* "}" "states" "{"
		//states+=State states+=State* "}" "}"
		public Group getGroup() { return cGroup; }

		//"app"
		public Keyword getAppKeyword_0() { return cAppKeyword_0; }

		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }

		//"initial"
		public Keyword getInitialKeyword_2() { return cInitialKeyword_2; }

		//initial=[State|EString]
		public Assignment getInitialAssignment_3() { return cInitialAssignment_3; }

		//[State|EString]
		public CrossReference getInitialStateCrossReference_3_0() { return cInitialStateCrossReference_3_0; }

		//EString
		public RuleCall getInitialStateEStringParserRuleCall_3_0_1() { return cInitialStateEStringParserRuleCall_3_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//"bricks"
		public Keyword getBricksKeyword_5() { return cBricksKeyword_5; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_6() { return cLeftCurlyBracketKeyword_6; }

		//bricks+=Brick
		public Assignment getBricksAssignment_7() { return cBricksAssignment_7; }

		//Brick
		public RuleCall getBricksBrickParserRuleCall_7_0() { return cBricksBrickParserRuleCall_7_0; }

		//bricks+=Brick*
		public Assignment getBricksAssignment_8() { return cBricksAssignment_8; }

		//Brick
		public RuleCall getBricksBrickParserRuleCall_8_0() { return cBricksBrickParserRuleCall_8_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }

		//"states"
		public Keyword getStatesKeyword_10() { return cStatesKeyword_10; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_11() { return cLeftCurlyBracketKeyword_11; }

		//states+=State
		public Assignment getStatesAssignment_12() { return cStatesAssignment_12; }

		//State
		public RuleCall getStatesStateParserRuleCall_12_0() { return cStatesStateParserRuleCall_12_0; }

		//states+=State*
		public Assignment getStatesAssignment_13() { return cStatesAssignment_13; }

		//State
		public RuleCall getStatesStateParserRuleCall_13_0() { return cStatesStateParserRuleCall_13_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_14() { return cRightCurlyBracketKeyword_14; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_15() { return cRightCurlyBracketKeyword_15; }
	}

	public class BrickElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Brick");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final RuleCall cSensorParserRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final RuleCall cActuatorParserRuleCall_0_1 = (RuleCall)cAlternatives_0.eContents().get(1);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPinAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPinEIntParserRuleCall_3_0 = (RuleCall)cPinAssignment_3.eContents().get(0);
		
		//Brick:
		//	(Sensor | Actuator) name=EString ":" pin=EInt;
		@Override public ParserRule getRule() { return rule; }

		//(Sensor | Actuator) name=EString ":" pin=EInt
		public Group getGroup() { return cGroup; }

		//Sensor | Actuator
		public Alternatives getAlternatives_0() { return cAlternatives_0; }

		//Sensor
		public RuleCall getSensorParserRuleCall_0_0() { return cSensorParserRuleCall_0_0; }

		//Actuator
		public RuleCall getActuatorParserRuleCall_0_1() { return cActuatorParserRuleCall_0_1; }

		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//pin=EInt
		public Assignment getPinAssignment_3() { return cPinAssignment_3; }

		//EInt
		public RuleCall getPinEIntParserRuleCall_3_0() { return cPinEIntParserRuleCall_3_0; }
	}

	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString returns ecore::EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }

		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}

	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameEStringParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cActionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cActionsActionParserRuleCall_2_0 = (RuleCall)cActionsAssignment_2.eContents().get(0);
		private final Assignment cActionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cActionsActionParserRuleCall_3_0 = (RuleCall)cActionsAssignment_3.eContents().get(0);
		private final Assignment cTransitionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTransitionTransitionParserRuleCall_4_0 = (RuleCall)cTransitionAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//State:
		//	name=EString "{" actions+=Action actions+=Action* transition=Transition "}";
		@Override public ParserRule getRule() { return rule; }

		//name=EString "{" actions+=Action actions+=Action* transition=Transition "}"
		public Group getGroup() { return cGroup; }

		//name=EString
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//EString
		public RuleCall getNameEStringParserRuleCall_0_0() { return cNameEStringParserRuleCall_0_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//actions+=Action
		public Assignment getActionsAssignment_2() { return cActionsAssignment_2; }

		//Action
		public RuleCall getActionsActionParserRuleCall_2_0() { return cActionsActionParserRuleCall_2_0; }

		//actions+=Action*
		public Assignment getActionsAssignment_3() { return cActionsAssignment_3; }

		//Action
		public RuleCall getActionsActionParserRuleCall_3_0() { return cActionsActionParserRuleCall_3_0; }

		//transition=Transition
		public Assignment getTransitionAssignment_4() { return cTransitionAssignment_4; }

		//Transition
		public RuleCall getTransitionTransitionParserRuleCall_4_0() { return cTransitionTransitionParserRuleCall_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//EInt returns ecore::EInt:
		//	"-"? INT;
		@Override public ParserRule getRule() { return rule; }

		//"-"? INT
		public Group getGroup() { return cGroup; }

		//"-"?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }

		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}

	public class SensorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Sensor");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSensorAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSensorKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Sensor:
		//	{Sensor} "sensor";
		@Override public ParserRule getRule() { return rule; }

		//{Sensor} "sensor"
		public Group getGroup() { return cGroup; }

		//{Sensor}
		public Action getSensorAction_0() { return cSensorAction_0; }

		//"sensor"
		public Keyword getSensorKeyword_1() { return cSensorKeyword_1; }
	}

	public class ActuatorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Actuator");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cActuatorAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cActuatorKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Actuator:
		//	{Actuator} "actuator";
		@Override public ParserRule getRule() { return rule; }

		//{Actuator} "actuator"
		public Group getGroup() { return cGroup; }

		//{Actuator}
		public Action getActuatorAction_0() { return cActuatorAction_0; }

		//"actuator"
		public Keyword getActuatorKeyword_1() { return cActuatorKeyword_1; }
	}

	public class ActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Action");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cActuatorAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cActuatorActuatorCrossReference_1_0 = (CrossReference)cActuatorAssignment_1.eContents().get(0);
		private final RuleCall cActuatorActuatorEStringParserRuleCall_1_0_1 = (RuleCall)cActuatorActuatorCrossReference_1_0.eContents().get(1);
		private final Keyword cToKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValueSignalEnumRuleCall_3_0 = (RuleCall)cValueAssignment_3.eContents().get(0);
		
		//Action:
		//	"set" actuator=[Actuator|EString] "to" value=Signal;
		@Override public ParserRule getRule() { return rule; }

		//"set" actuator=[Actuator|EString] "to" value=Signal
		public Group getGroup() { return cGroup; }

		//"set"
		public Keyword getSetKeyword_0() { return cSetKeyword_0; }

		//actuator=[Actuator|EString]
		public Assignment getActuatorAssignment_1() { return cActuatorAssignment_1; }

		//[Actuator|EString]
		public CrossReference getActuatorActuatorCrossReference_1_0() { return cActuatorActuatorCrossReference_1_0; }

		//EString
		public RuleCall getActuatorActuatorEStringParserRuleCall_1_0_1() { return cActuatorActuatorEStringParserRuleCall_1_0_1; }

		//"to"
		public Keyword getToKeyword_2() { return cToKeyword_2; }

		//value=Signal
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }

		//Signal
		public RuleCall getValueSignalEnumRuleCall_3_0() { return cValueSignalEnumRuleCall_3_0; }
	}

	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIfKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSensorAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cSensorSensorCrossReference_1_0 = (CrossReference)cSensorAssignment_1.eContents().get(0);
		private final RuleCall cSensorSensorEStringParserRuleCall_1_0_1 = (RuleCall)cSensorSensorCrossReference_1_0.eContents().get(1);
		private final Keyword cIsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValueSignalEnumRuleCall_3_0 = (RuleCall)cValueAssignment_3.eContents().get(0);
		private final Keyword cMoveToKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cNextAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cNextStateCrossReference_5_0 = (CrossReference)cNextAssignment_5.eContents().get(0);
		private final RuleCall cNextStateEStringParserRuleCall_5_0_1 = (RuleCall)cNextStateCrossReference_5_0.eContents().get(1);
		
		//Transition:
		//	"if" sensor=[Sensor|EString] "is" value=Signal "move to" next=[State|EString];
		@Override public ParserRule getRule() { return rule; }

		//"if" sensor=[Sensor|EString] "is" value=Signal "move to" next=[State|EString]
		public Group getGroup() { return cGroup; }

		//"if"
		public Keyword getIfKeyword_0() { return cIfKeyword_0; }

		//sensor=[Sensor|EString]
		public Assignment getSensorAssignment_1() { return cSensorAssignment_1; }

		//[Sensor|EString]
		public CrossReference getSensorSensorCrossReference_1_0() { return cSensorSensorCrossReference_1_0; }

		//EString
		public RuleCall getSensorSensorEStringParserRuleCall_1_0_1() { return cSensorSensorEStringParserRuleCall_1_0_1; }

		//"is"
		public Keyword getIsKeyword_2() { return cIsKeyword_2; }

		//value=Signal
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }

		//Signal
		public RuleCall getValueSignalEnumRuleCall_3_0() { return cValueSignalEnumRuleCall_3_0; }

		//"move to"
		public Keyword getMoveToKeyword_4() { return cMoveToKeyword_4; }

		//next=[State|EString]
		public Assignment getNextAssignment_5() { return cNextAssignment_5; }

		//[State|EString]
		public CrossReference getNextStateCrossReference_5_0() { return cNextStateCrossReference_5_0; }

		//EString
		public RuleCall getNextStateEStringParserRuleCall_5_0_1() { return cNextStateEStringParserRuleCall_5_0_1; }
	}
	
	
	public class SignalElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "Signal");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cHIGHEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cHIGHHighKeyword_0_0 = (Keyword)cHIGHEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cLOWEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cLOWLowKeyword_1_0 = (Keyword)cLOWEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum Signal:
		//	HIGH="high" | LOW="low";
		public EnumRule getRule() { return rule; }

		//HIGH="high" | LOW="low"
		public Alternatives getAlternatives() { return cAlternatives; }

		//HIGH="high"
		public EnumLiteralDeclaration getHIGHEnumLiteralDeclaration_0() { return cHIGHEnumLiteralDeclaration_0; }

		//"high"
		public Keyword getHIGHHighKeyword_0_0() { return cHIGHHighKeyword_0_0; }

		//LOW="low"
		public EnumLiteralDeclaration getLOWEnumLiteralDeclaration_1() { return cLOWEnumLiteralDeclaration_1; }

		//"low"
		public Keyword getLOWLowKeyword_1_0() { return cLOWLowKeyword_1_0; }
	}
	
	private final AppElements pApp;
	private final BrickElements pBrick;
	private final EStringElements pEString;
	private final StateElements pState;
	private final EIntElements pEInt;
	private final SensorElements pSensor;
	private final ActuatorElements pActuator;
	private final ActionElements pAction;
	private final TransitionElements pTransition;
	private final SignalElements unknownRuleSignal;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ArduinoMLGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pApp = new AppElements();
		this.pBrick = new BrickElements();
		this.pEString = new EStringElements();
		this.pState = new StateElements();
		this.pEInt = new EIntElements();
		this.pSensor = new SensorElements();
		this.pActuator = new ActuatorElements();
		this.pAction = new ActionElements();
		this.pTransition = new TransitionElements();
		this.unknownRuleSignal = new SignalElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("arduinoML.concretesyntax.ArduinoML".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//App:
	//	"app" name=EString "initial" initial=[State|EString] "{" "bricks" "{" bricks+=Brick bricks+=Brick* "}" "states" "{"
	//	states+=State states+=State* "}" "}";
	public AppElements getAppAccess() {
		return pApp;
	}
	
	public ParserRule getAppRule() {
		return getAppAccess().getRule();
	}

	//Brick:
	//	(Sensor | Actuator) name=EString ":" pin=EInt;
	public BrickElements getBrickAccess() {
		return pBrick;
	}
	
	public ParserRule getBrickRule() {
		return getBrickAccess().getRule();
	}

	//EString returns ecore::EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}

	//State:
	//	name=EString "{" actions+=Action actions+=Action* transition=Transition "}";
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}

	//EInt returns ecore::EInt:
	//	"-"? INT;
	public EIntElements getEIntAccess() {
		return pEInt;
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}

	//Sensor:
	//	{Sensor} "sensor";
	public SensorElements getSensorAccess() {
		return pSensor;
	}
	
	public ParserRule getSensorRule() {
		return getSensorAccess().getRule();
	}

	//Actuator:
	//	{Actuator} "actuator";
	public ActuatorElements getActuatorAccess() {
		return pActuator;
	}
	
	public ParserRule getActuatorRule() {
		return getActuatorAccess().getRule();
	}

	//Action:
	//	"set" actuator=[Actuator|EString] "to" value=Signal;
	public ActionElements getActionAccess() {
		return pAction;
	}
	
	public ParserRule getActionRule() {
		return getActionAccess().getRule();
	}

	//Transition:
	//	"if" sensor=[Sensor|EString] "is" value=Signal "move to" next=[State|EString];
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}

	//enum Signal:
	//	HIGH="high" | LOW="low";
	public SignalElements getSignalAccess() {
		return unknownRuleSignal;
	}
	
	public EnumRule getSignalRule() {
		return getSignalAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}