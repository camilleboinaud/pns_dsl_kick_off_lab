package fr.unice.polytech.arduinoml.dsl;

import fr.unice.polytech.arduinoml.dsl.exception.BadValidationException;
import fr.unice.polytech.arduinoml.dsl.exception.ElementNotFoundException;
import fr.unice.polytech.arduinoml.kernel.behavioral.Action;
import fr.unice.polytech.arduinoml.kernel.behavioral.State;
import fr.unice.polytech.arduinoml.kernel.behavioral.Transition;
import fr.unice.polytech.arduinoml.kernel.structural.Actuator;
import fr.unice.polytech.arduinoml.kernel.structural.SIGNAL;
import fr.unice.polytech.arduinoml.kernel.structural.Sensor;

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
     * Describes the state action with a given actuator and a signal.
     *
     * Be careful, validation has not been implemented yet, we can't
     * ensure validity of parameters you passed to method.
     *
     * @param actuator
     * @param signal
     * @return StateBuilder
     */
    public StateBuilder action(String actuator, SIGNAL signal) throws ElementNotFoundException {

        Action action = new Action();
        Actuator actuatorObj = (Actuator)arduinoBuilder.getBrickByName(actuator);

        if(actuatorObj == null){
            throw new ElementNotFoundException("Actuator you looked for doesn't exist. " +
                    "You must define your bricks before using them.");
        }

        action.setActuator(actuatorObj);
        action.setValue(signal);

        state.getActions().add(action);

        return this;
    }

    /**
     * Describes the state transition to a next state when the given sensor
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
    public StateBuilder transition(String nextState, String sensor, SIGNAL signal)
            throws ElementNotFoundException{

        Transition transition = new Transition();
        State next = arduinoBuilder.getStateByName(nextState);

        Sensor sensorObj = (Sensor)arduinoBuilder.getBrickByName(sensor);
        State nextStateObj = (next != null) ? next : arduinoBuilder.createState(nextState);

        if(sensorObj == null){
            throw new ElementNotFoundException("Sensor you looked for doesn't exist. " +
                    "You must define your bricks before using them.");
        }

        transition.setValue(signal);
        transition.setNext(nextStateObj);
        transition.setSensor(sensorObj);

        state.setTransition(transition);

        return this;
    }

    /**
     * Ends state description and stores it into ArduinoBuilder's
     * model.
     *
     * @return ArduinoBuilder
     */
    public ArduinoBuilder end() throws BadValidationException {

        if(state.getTransition() == null){
            throw new BadValidationException("Ooops, you tried to define a state without any transition..");
        }

        if(initial){
            arduinoBuilder.app.setInitial(state);
        }

        arduinoBuilder.app.getStates().add(state);
        return arduinoBuilder;
    }

}
