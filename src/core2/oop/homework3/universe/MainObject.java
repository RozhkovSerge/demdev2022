package core2.oop.homework3.universe;

public abstract class MainObject {

    private Characteristic characteristic;

    public MainObject(Characteristic characteristic) {
        this.characteristic = characteristic;
    }

     abstract void print();

    public  Characteristic getCharacteristic() {
        return characteristic;
    }
}
