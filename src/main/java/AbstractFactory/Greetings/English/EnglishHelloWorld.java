package AbstractFactory.Greetings.English;

import AbstractFactory.Greetings.HelloWorld;

/**
 *
 * @author Santiago
 */
public class EnglishHelloWorld implements HelloWorld {

    @Override
    public void print() {
        System.out.println("Hello World in english - Patrón Abstract Factory");
    }
}
