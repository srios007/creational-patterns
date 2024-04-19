package AbstractFactory.Factories;

import AbstractFactory.Greetings.HelloUniverse;
import AbstractFactory.Greetings.HelloWorld;

/**
 *
 * @author Santiago
 */
public abstract class Person {
    public abstract HelloWorld sayHelloWorld();   
    public abstract HelloUniverse sayHelloUniverse();

}
