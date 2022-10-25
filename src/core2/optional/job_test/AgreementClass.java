package core2.optional.job_test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class AgreementClass {
    private final Optional<Long> id;
    private final Map<Long, Boolean> map = new LinkedHashMap<>();

    public AgreementClass(long id) {
        this.id = Optional.of(id);
        this.map.put(1L, true);
        this.map.put(2L, false);

    }

    public Optional<Long> getId() {
        return id;
    }
}
