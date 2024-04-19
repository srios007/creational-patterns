package AbstractFactory.Factories;

import AbstractFactory.Greetings.English.EnglishHelloUniverse;
import AbstractFactory.Greetings.English.EnglishHelloWorld;
import AbstractFactory.Greetings.HelloUniverse;
import AbstractFactory.Greetings.HelloWorld;

/**
 *
 * @author Santiago
 */
public class EnglishManufacturer extends Person {

    @Override
    public HelloWorld sayHelloWorld() {
        return new EnglishHelloWorld();
    }

    @Override
    public HelloUniverse sayHelloUniverse() {
        return new EnglishHelloUniverse();
    }
}
