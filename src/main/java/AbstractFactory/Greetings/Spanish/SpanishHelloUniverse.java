package AbstractFactory.Greetings.Spanish;

import AbstractFactory.Greetings.HelloUniverse;

/**
 *
 * @author Santiago
 */
public class SpanishHelloUniverse implements HelloUniverse {

    @Override
    public void print() {
        System.out.println("Hola universo en español - Patrón Abstract Factory");
    }
}