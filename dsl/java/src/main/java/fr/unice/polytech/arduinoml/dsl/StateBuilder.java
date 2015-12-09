package fr.unice.polytech.arduinoml.dsl;

import fr.unice.polytech.arduinoml.kernel.behavioral.Action;
import fr.unice.polytech.arduinoml.kernel.behavioral.State;
import fr.unice.polytech.arduinoml.kernel.behavioral.Transition;
import fr.unice.polytech.arduinoml.kernel.structural.Actuator;
import fr.unice.polytech.arduinoml.kernel.structural.SIGNAL;
import fr.unice.polytech.arduinoml.kernel.structural.Sensor;

/**
 * Created by camille on 09/12/15.
 */
public class StateBuilder {

    protected State state;
    protected ArduinoBuilder arduinoBuilder;

    protected boolean initial = false;


    StateBuilder(String name, ArduinoBuilder arduino){

        arduinoBuilder = arduino;
        State candidate = arduinoBuilder.getStateByName(name);

        if(candidate != null){
            state = candidate;
            arduinoBuilder.app.getStates().remove(candidate);
        } else {
            state = new State();
            state.setName(name);
        }

    }

    public StateBuilder initial(){
        initial = true;
        return this;
    }

    public StateBuilder action(String actuator, String signal){

        Action action = new Action();
        action.setActuator((Actuator)arduinoBuilder.getBrickByName(actuator));
        action.setValue(SIGNAL.valueOf(signal.toUpperCase()));

        state.getActions().add(action);

        return this;
    }

    public StateBuilder transition(String nextState, String sensor, String signal){

        Transition transition = new Transition();
        State next = arduinoBuilder.getStateByName(nextState);

        transition.setValue(SIGNAL.valueOf(signal.toUpperCase()));
        transition.setNext((next != null) ? next : arduinoBuilder.createState(nextState));
        transition.setSensor((Sensor)arduinoBuilder.getBrickByName(sensor));

        state.setTransition(transition);

        return this;
    }

    public ArduinoBuilder end(){

        if(initial){
            arduinoBuilder.app.setInitial(state);
        }

        arduinoBuilder.app.getStates().add(state);
        return arduinoBuilder;
    }



}
