package FactoryMethod;

/**
 *
 * @author Santiago
 */
public class HelloWorldManufacturer extends Person {

    @Override
    public Hello sayHello() {
        return new HelloWorld();
    } 
}
