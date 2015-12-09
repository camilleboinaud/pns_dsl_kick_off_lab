package fr.unice.polytech.arduinoml.dsl;

import fr.unice.polytech.arduinoml.kernel.App;
import fr.unice.polytech.arduinoml.kernel.behavioral.State;
import fr.unice.polytech.arduinoml.kernel.generator.ToWiring;
import fr.unice.polytech.arduinoml.kernel.structural.Actuator;
import fr.unice.polytech.arduinoml.kernel.structural.Brick;
import fr.unice.polytech.arduinoml.kernel.structural.Sensor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by camille on 09/12/15.
 */
public class ArduinoBuilder {

    protected static ArduinoBuilder instance = null;
    protected App app;


    private ArduinoBuilder(String name){
        app = new App();
        app.setName(name);
    }

    public static ArduinoBuilder arduino(String name){
        return new ArduinoBuilder(name);
    }


    /*
     * DSL methods implementation
     */

    public ArduinoBuilder sensor(String name, int pin){

        Sensor sensor = new Sensor();
        sensor.setName(name);
        sensor.setPin(pin);

        app.getBricks().add(sensor);

        return  this;
    }

    public ArduinoBuilder actuator(String name, int pin){

        Actuator actuator = new Actuator();
        actuator.setName(name);
        actuator.setPin(pin);

        app.getBricks().add(actuator);

        return  this;
    }

    public StateBuilder state(String name){
        return new StateBuilder(name, this);
    }

    public void end(){
        ToWiring export = new ToWiring();
        app.accept(export);
        System.out.println(export.getResult());
    }


    /*
     * Internal tools definition
     */

    Brick getBrickByName(String name){

        for (Brick brick : app.getBricks()){
            if(name.equals(brick.getName())){
                return brick;
            }
        }

        return null;
    }

    State getStateByName(String name){

        for (State state : app.getStates()){
            if(name.equals(state.getName())){
                return state;
            }
        }

        return null;
    }

    State createState(String name){
        State state = new State();
        state.setName(name);

        app.getStates().add(state);
        return state;
    }




}
