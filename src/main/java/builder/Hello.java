package builder;

/**
 *
 * @author Santiago
 */
public class Hello {

    private String greeting;
    private String place;
    private String pattern;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public Hello(String hello) {
        this.greeting = hello;
    }

    public static Builder builder(String hello) {
        return new Builder(hello);
    }

  

    public static class Builder {

        private Hello hello;

        private Builder(String hello) {
            this.hello = new Hello(hello);
        }

        public Builder place(String place) {
            this.hello.place = place;
            return this;
        }

        public Builder pattern(String pattern) {
            this.hello.pattern = pattern;
            return this;
        }

        public Hello build() {
            return hello;
        }

    }
}
