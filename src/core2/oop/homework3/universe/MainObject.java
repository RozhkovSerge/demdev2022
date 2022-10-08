package core2.oop.homework3.universe;

public abstract class MainObject {

    protected Characteristic characteristic;

    public MainObject(Characteristic characteristic) {
        this.characteristic = characteristic;
    }

     abstract void print();
}
