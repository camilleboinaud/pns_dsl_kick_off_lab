package fr.unice.polytech.arduinoml.dsl.exceptions;

/**
 * Created by camille on 10/12/15.
 */
public class BadStateException extends BadNamedElementException {

    public BadStateException(String msg) {
        super(msg);
    }

}
