package AbstractFactory.Greetings.Spanish;

import AbstractFactory.Greetings.HelloWorld;

/**
 *
 * @author Santiago
 */
public class SpanishHelloWorld implements HelloWorld {

    @Override
    public void print() {
        System.out.println("Hola mundo en español - Patrón Abstract Factory");
    }
}