# ArduinoML DSL implementation using JetBrains MPS

* Authors:
    * Camille Boinaud [[camille.boinaud@etu.unice.fr](mailto:camille.boinaud@etu.unice.fr)]    
    * Zhou Ren [[zhou.ren@etu.unice.fr](mailto:zhou.ren@etu.unice.fr)]
    * Quan Sun [[quan.sun@etu.unice.fr](mailto:quan.sun@etu.unice.fr)]
* Version:
    * V1.0 : 12/13/2015 01:15


## Syntax example
    
```
app Switch init_state : off {
    
    bricks :
        actuator led : 12
        sensor button : 9

    states : 
        off {
            led <= low
            button is high => on
        }
        on {
            led <= high
            button is high => off
        }

}
```