# ArduinoML implementation usin Java

* Authors:
    * Camille Boinaud [[camille.boinaud@etu.unice.fr](mailto:camille.boinaud@etu.unice.fr)]    
    * Zhou Ren [[zhou.ren@etu.unice.fr](mailto:zhou.ren@etu.unice.fr)]
    * Quan Sun [[quan.sun@etu.unice.fr](mailto:quan.sun@etu.unice.fr)]
* Version:
    * V1.0 : 12/10/2015 00:15


## Syntax exemple
    
```
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
        .action("led", "high")
        .transition("off", "button", "high")
        .end()
    .state("off")
        .initial()
        .action("led", "low")
        .transition("on", "button", "low")
        .end()
    .end();
```

## Specifications

A particular attention will be attached to order of declarations. As this version is only a MVP,
we chosed not to implement massive checks during creation of applications. The following order needs to be suited :

>* Initialisation of application
>* Sensors or actuators (order relation between those bricks does not matter)
>* States
>    * Action, transition
>    * End
>* End    

## Todo list

* Javadoc
* Implement massive checks during application creation