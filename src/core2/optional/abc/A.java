package core2.optional.abc;

import java.util.Optional;

public class A {

    private final Optional<B> b;

    public A(Optional<B> b) {
        this.b = b;
    }

    public Optional<B> getB() {
        return b;
    }
}
