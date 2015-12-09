package fr.unice.polytech.arduinoml.kernel.structural;

import fr.unice.polytech.arduinoml.kernel.generator.Visitor;

public class Actuator extends Brick {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
