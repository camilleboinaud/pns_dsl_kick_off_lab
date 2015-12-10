package fr.unice.polytech.arduinoml.dsl;

import fr.unice.polytech.arduinoml.kernel.App;
import fr.unice.polytech.arduinoml.kernel.behavioral.State;
import fr.unice.polytech.arduinoml.kernel.generator.ToWiring;
import fr.unice.polytech.arduinoml.kernel.structural.Actuator;
import fr.unice.polytech.arduinoml.kernel.structural.Brick;
import fr.unice.polytech.arduinoml.kernel.structural.Sensor;

/**
 * Created by camille on 09/12/15.
 *
 * This class aims to expose a DSL way to create an Arduino application. The entry point
 * is the static method of the arduino() method. An Arduino application ends by calling
 * the end() method.
 */
public class ArduinoBuilder {

    protected static ArduinoBuilder instance = null;
    protected App app;


    private ArduinoBuilder(String name){
        app = new App();
        app.setName(name);
    }

    /**
     * This static method is the only entry point to create an Arduino application
     * using this DSL. It initialize application name.
     * @param name
     * @return
     */
    public static ArduinoBuilder arduino(String name){
        return new ArduinoBuilder(name);
    }


    /*
     * DSL methods implementation
     */

    /**
     * This method must be call to declare a new sensor in application.
     * A sensor is defined by its name and its pin number.
     * @param name
     * @param pin
     * @return
     */
    public ArduinoBuilder sensor(String name, int pin){

        Sensor sensor = new Sensor();
        sensor.setName(name);
        sensor.setPin(pin);

        app.getBricks().add(sensor);

        return  this;
    }

    /**
     * This method must be call to declare a new actuator in application.
     * An actuator is defined by its name and its pin number.
     * @param name
     * @param pin
     * @return
     */
    public ArduinoBuilder actuator(String name, int pin){

        Actuator actuator = new Actuator();
        actuator.setName(name);
        actuator.setPin(pin);

        app.getBricks().add(actuator);

        return  this;
    }

    /**
     * This method must be called to declare a new state in application.
     * To define a state we are using a new class : StateBuilder.
     * @param name
     * @return
     */
    public StateBuilder state(String name){
        return new StateBuilder(name, this);
    }

    /**
     * This method must be called to end application. It will be in charge
     * of application validation and result export (a simple print for now).
     */
    public void end(){
        ToWiring export = new ToWiring();
        app.accept(export);
        System.out.println(export.getResult());
    }


    /*
     * Internal tools definition
     */

    /**
     * Allows to retrieve a brick using its name. Returns null if
     * searched brick doesn't exist.
     * @param name
     * @return
     */
    Brick getBrickByName(String name){

        for (Brick brick : app.getBricks()){
            if(name.equals(brick.getName())){
                return brick;
            }
        }

        return null;
    }

    /**
     * Allows to retrieve a state using its name. Returns null if
     * searched state doesn't exist.
     * @param name
     * @return
     */
    State getStateByName(String name){

        for (State state : app.getStates()){
            if(name.equals(state.getName())){
                return state;
            }
        }

        return null;
    }

    /**
     * Creates a new state (not fully initialized) and stores it in
     * our App object (in order to set it up later).
     * @param name
     * @return
     */
    State createState(String name){
        State state = new State();
        state.setName(name);

        app.getStates().add(state);
        return state;
    }




}
