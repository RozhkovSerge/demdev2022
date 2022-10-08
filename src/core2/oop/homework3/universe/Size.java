package core2.oop.homework3.universe;

public enum Size {

    HUGE("Огромный"),
    BIG("Большой"),
    MEDIUM("Средний"),
    SMALL("Маленький");

    private String description;

    Size(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
