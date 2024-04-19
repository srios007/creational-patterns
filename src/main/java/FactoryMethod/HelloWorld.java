package FactoryMethod;

/**
 *
 * @author Santiago
 */
public class HelloWorld implements Hello {

    @Override
    public void print() {
        System.out.println("Hola mundo - Patrón Factory");
    }
}
