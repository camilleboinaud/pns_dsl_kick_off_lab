package arduinoML.homemade;

import arduinoML.*;
import arduinoML.util.ArduinoMLSwitch;

import org.eclipse.emf.ecore.EObject;


public class ArduinoMLSwitchPrinter extends ArduinoMLSwitch<String> {
	
	
	public ArduinoMLSwitchPrinter() {
		if (modelPackage == null) {
			modelPackage = ArduinoMLPackage.eINSTANCE;
		}
	}

	@Override
	public String caseBrick(Brick object) {
		return "";
	}

	@Override
	public String caseActuator(Actuator object) {
		return "\tpinMode("+object.getPin()+", OUTPUT); // " + object.getName() + " [Actuator]\n";
	}

	@Override
	public String caseSensor(Sensor object) {
		return "\tpinMode("+object.getPin()+", INPUT); // " + object.getName() + " [Sensor]\n";
	}

	@Override
	public String caseApp(App object) {
		 StringBuilder sb = new StringBuilder();
		 sb.append("// Wiring code generated from an ArduinoML model\n");
		 sb.append("// Application name:" + object.getName() + "\n\n");
		 
		 sb.append("void setup() {\n");
		 for(Brick b : object.getBricks()){
			sb.append(doSwitch(b));
		 }
		 sb.append("}\n\n");
		 
	 	 sb.append("long time=0; long debounce = 200;\n\n");
	 	 
		 for(State s : object.getStates()){
				sb.append(doSwitch(s));
		 }
		 sb.append("\nvoid loop() { state_"+object.getInitial().getName()+"(); }");
		 
		 return sb.toString();
	}
	
	@Override
	public String caseState(State object) {
		StringBuilder sb = new StringBuilder();
		 sb.append("void state_"+object.getName()+"() {\n");
		 for(Action a : object.getActions())
			 sb.append(doSwitch(a));
		 sb.append("\tboolean guard = millis() - time > debounce;\n"
		 		+ doSwitch(object.getTransition())
		 		+ "} \n");
		 return sb.toString();
	}

	@Override
	public String caseAction(Action object) {
		StringBuilder sb = new StringBuilder();
		 sb.append("\tdigitalWrite("
		 		+object.getActuator().getPin()
		 		+", "+object.getValue().getLiteral()
		 		+");\n");
		 return sb.toString();
	}

	@Override
	public String caseTransition(Transition object) {
		StringBuilder sb = new StringBuilder();
		 sb.append("\tif (digitalRead(" + object.getSensor().getPin() + ") == " + object.getValue().getLiteral() + " && guard ) {\n"
		 		 + "\t\ttime = millis(); state_"+object.getNext().getName()+"();\n"
		 		 + "\t} else { state_"+object.getState().getName()+"(); }\n");
		 return sb.toString();
	}

	@Override
	public String defaultCase(EObject object) {
		return "";
	}

}