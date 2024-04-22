package builder;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Santiago
 */
@Getter
@Setter
public class Hello {

    private String greeting = "";
    private String place = "";
    private String pattern = "";

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
