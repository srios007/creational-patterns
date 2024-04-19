package FactoryMethod;

/**
 *
 * @author Santiago
 */
public class HelloUniverse implements Hello {

    @Override
    public void print() {
        System.out.println("Hola universo - Patrón Factory");
    }
}
