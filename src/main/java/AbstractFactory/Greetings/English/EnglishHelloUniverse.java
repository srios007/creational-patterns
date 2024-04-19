package AbstractFactory.Greetings.English;

import AbstractFactory.Greetings.HelloUniverse;

/**
 *
 * @author Santiago
 */
public class EnglishHelloUniverse implements HelloUniverse {

    @Override
    public void print() {
        System.out.println("Hello Universe in english - Patrón Abstract Factory");
    }
}
