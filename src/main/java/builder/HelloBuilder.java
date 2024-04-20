package builder;

/**
 *
 * @author Santiago
 */
public class HelloBuilder {

    private Hello hello;

    public HelloBuilder(String greeting) {
        this.hello = new Hello(greeting);
    }

    public HelloBuilder place(String place) {
        this.hello.setPlace(place);
        return this;
    }

    public HelloBuilder pattern(String pattern) {
        this.hello.setPattern(pattern);
        return this;
    }

    public Hello build() {
        System.out.println(this.hello.getGreeting() + " " + this.hello.getPlace() + this.hello.getPattern());        
        return this.hello;
    }

}
