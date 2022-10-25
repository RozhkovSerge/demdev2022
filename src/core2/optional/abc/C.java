package core2.optional.abc;

import javax.swing.text.html.Option;
import java.util.Optional;

public class C {
    private final Optional<Long> id;

    public C(Optional<Long> id) {
        this.id = id;
    }

    public Optional<Long> getId() {
        return id;
    }
}
