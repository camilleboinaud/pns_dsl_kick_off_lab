package fr.unice.polytech.arduinoml.sample;

import fr.unice.polytech.arduinoml.dsl.ArduinoBuilder;
import fr.unice.polytech.arduinoml.dsl.exception.ArduinoMLException;
import fr.unice.polytech.arduinoml.kernel.structural.SIGNAL;

import static fr.unice.polytech.arduinoml.dsl.ArduinoBuilder.*;

/**
 * Created by camille on 09/12/15.
 */
public class Switch {

    public static void main(String args[]){

        try {

            // Creating a new arduino application
            // Application is composed of : 1..n sensors, 1..n actuators, 1..n states.
            // It needs to be ended.
            arduino("Switch!")

                // Declaring bricks involved in application (sensors and actuators)
                .sensor("button", 9)
                .actuator("led", 12)

                // Declaring states involved in application
                // State is composed of : 1 action + 1 transition (+ 1 initial status).
                // It needs to be ended.
                .state("on")
                    .action("led", SIGNAL.HIGH)
                    .transition("off", "button", SIGNAL.HIGH)
                    .end()
                .state("off")
                    .initial()
                    .action("led", SIGNAL.LOW)
                    .transition("on", "button", SIGNAL.HIGH)
                    .end()
                .end();

        } catch (ArduinoMLException e){
            e.printStackTrace();
        }
    }

}
