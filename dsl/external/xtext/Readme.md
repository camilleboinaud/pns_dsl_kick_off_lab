# ArduinoML

* Authors:
    * Camille Boinaud [[camille.boinaud@etu.unice.fr](mailto:camille.boinaud@etu.unice.fr)]    
    * Zhou Ren [[zhou.ren@etu.unice.fr](mailto:zhou.ren@etu.unice.fr)]
    * Quan Sun [[quan.sun@etu.unice.fr](mailto:quan.sun@etu.unice.fr)]
* Version:
    * V1.0 : 12/14/2015 00:13

## Syntax example
    
```
app Switch initial off 
{
	bricks {
		sensor button : 9
		actuator led : 12
	}
	
	states {
		on {
			set led to high
			if button is high move to off
		}
		
		off {
			set led to low
			if button is high move to on
		}
	}
}
```

## Model generated

A specificity of xtext is the graphical model generation. Thanks to that we described the following model :

![model diagram]("https://github.com/camilleboinaud/pns_dsl_kick_off_lab/blob/master/dsl/external/xtext/doc/model.png" "model diagram")  
  
