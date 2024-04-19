package FactoryMethod;

/**
 *
 * @author Santiago
 */
public abstract class Person {

    public Hello printHello() {
        Hello hello = sayHello();
        hello.print();
        return hello;
    }

    public abstract Hello sayHello();
}
