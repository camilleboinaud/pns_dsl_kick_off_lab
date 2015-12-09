package fr.unice.polytech.arduinoml.sample;

import static fr.unice.polytech.arduinoml.dsl.ArduinoBuilder.*;

/**
 * Created by camille on 09/12/15.
 */
public class Switch {

    public static void main(String args[]){

        arduino("Switch!")
            .sensor("button", 9)
            .actuator("led", 12)
            .state("on")
                .action("led", "high")
                .transition("off", "button", "high")
                .end()
            .state("off")
                .initial()
                .action("led", "low")
                .transition("on", "button", "low")
                .end()
            .end();
    }

}
