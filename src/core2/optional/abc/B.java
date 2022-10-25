package core2.optional.abc;

import java.util.Optional;

public class B {

    private final Optional<C> c;

    public B(Optional<C> c) {
        this.c = c;
    }

    public Optional<C> getC() {
        return c;
    }
}
