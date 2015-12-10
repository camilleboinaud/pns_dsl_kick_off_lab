package fr.unice.polytech.arduinoml.dsl;

import fr.unice.polytech.arduinoml.dsl.exceptions.*;
import fr.unice.polytech.arduinoml.kernel.behavioral.*;
import fr.unice.polytech.arduinoml.kernel.structural.*;

/**
 * Created by camille on 09/12/15.
 *
 * This class aims to expose a DSL way to describe a state used in arduino application.
 * The entry point is the constructor method. A state description ends by calling
 * the end() method.
 */
public class StateBuilder {

    protected State state;
    protected ArduinoBuilder arduinoBuilder;

    protected boolean initial = false;


    /**
     * Entry point to initialize a new state using its name. We also
     * passed an arduino builder instance to access its model and to
     * return back to arduino initialization.
     * @param name
     * @param arduino
     */
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

    /**
     * This method should be called to indicate that our state will
     * be the inial one for arduino application.
     *
     * Be careful, this method must be called exactly once over different
     * states described in your app. If it is called several times, new calls
     * will replace old ones.
     *
     * @return StateBuilder
     */
    public StateBuilder initial(){
        initial = true;
        return this;
    }

    /**
     * Describe the state action with a given actuator and a signal.
     *
     * Be careful, validation has not been implemented yet, we can't
     * ensure validity of parameters you passed to method.
     *
     * @param actuator
     * @param signal
     * @return StateBuilder
     */
    public StateBuilder action(String actuator, String signal)
            throws BadNamedElementException {

        Action action = new Action();
        Actuator act = (Actuator)arduinoBuilder.getBrickByName(actuator);

        if(act != null) {
            action.setActuator(act);
        } else {
            throw new BadBrickException("Actuor you tried to select doesn't exist");
        }

        try {
            action.setValue(SIGNAL.valueOf(signal.toUpperCase()));
        } catch (IllegalArgumentException e){
            throw new BadSignalException("Signal you tried to select doesn't exist");
        }

        state.getActions().add(action);

        return this;
    }

    /**
     * Describe the state transition to a next state when the given sensor
     * emits the given signal.
     *
     * Be careful, validation has not been implemented yet, we can't
     * ensure validity of parameters you passed to method.
     *
     * @param nextState
     * @param sensor
     * @param signal
     * @return StateBuilder
     */
    public StateBuilder transition(String nextState, String sensor, String signal)
            throws BadNamedElementException {

            Transition transition = new Transition();
            State next = arduinoBuilder.getStateByName(nextState);
            Sensor sens = (Sensor) arduinoBuilder.getBrickByName(sensor);

            try{
                transition.setValue(SIGNAL.valueOf(signal.toUpperCase()));
            } catch (IllegalArgumentException e){
                throw new BadSignalException("Signal you tried to select doesn't exist");
            }

            transition.setNext((next != null) ? next : arduinoBuilder.createState(nextState));

            if(sens != null) {
                transition.setSensor(sens);
            } else {
                throw new BadBrickException("Sensor you tried to select doesn't exist");
            }

            state.setTransition(transition);
            return this;
    }

    /**
     * Ends state description and stores it into ArduinoBuilder's
     * model.
     *
     * @return ArduinoBuilder
     */
    public ArduinoBuilder end() throws NotValidDescriptionException {

        if(state.getActions().size() > 0 && state.getTransition() != null) {
            if (initial) {
                arduinoBuilder.app.setInitial(state);
            }

            arduinoBuilder.app.getStates().add(state);
            return arduinoBuilder;
        }

        throw new NotValidDescriptionException("Action or transition is missing to complete state description ");
    }

}
