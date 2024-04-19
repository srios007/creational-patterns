package AbstractFactory.Factories;

import AbstractFactory.Greetings.HelloUniverse;
import AbstractFactory.Greetings.HelloWorld;
import AbstractFactory.Greetings.Spanish.SpanishHelloUniverse;
import AbstractFactory.Greetings.Spanish.SpanishHelloWorld;

/**
 *
 * @author Santiago
 */
public class SpanishManufacturer extends Person {

    @Override
    public HelloWorld sayHelloWorld() {
        return new SpanishHelloWorld();
    }

    @Override
    public HelloUniverse sayHelloUniverse() {
        return new SpanishHelloUniverse();
    }
}
