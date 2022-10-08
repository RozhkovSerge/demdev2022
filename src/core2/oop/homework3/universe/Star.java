package core2.oop.homework3.universe;

public class Star extends MainObject implements Measurable {

    public Star(Characteristic characteristic) {
        super(characteristic);
    }

    @Override
    public Characteristic measure() {
        return getCharacteristic();
    }

    @Override
    void print() {
        getCharacteristic().getName();
    }


}
