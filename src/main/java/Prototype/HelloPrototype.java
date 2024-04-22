package Prototype;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Santiago
 */
@Getter
@Setter
public class HelloPrototype implements Cloneable {

    private String greeting;
    private String place;
    private String pattern;

    public HelloPrototype(String greeting, String place, String pattern) {
        this.greeting = greeting;
        this.place = place;
        this.pattern = pattern;
    }

    @Override
    public HelloPrototype clone() throws CloneNotSupportedException {
        return (HelloPrototype) super.clone();
    }

    public void printHello() {
        System.out.println(this.greeting + " " + this.place + " " + this.pattern);
    }
}
