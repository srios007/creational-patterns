package FactoryMethod;

/**
 *
 * @author Santiago
 */
public class HelloUniverseManufacturer extends Person {

    @Override
    public Hello sayHello() {
        return new HelloUniverse();
    } 
}
