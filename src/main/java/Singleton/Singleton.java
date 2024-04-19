package Singleton;

/**
 *
 * @author Santiago
 */
public class Singleton {
    private static Singleton instance;
    
    private Singleton() {}
    
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    public void printHelloWorld() {
        System.out.println("Hola Mundo - Patrón Singleton");
    }
}
