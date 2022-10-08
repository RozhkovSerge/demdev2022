package core2.oop.homework3.universe;

public class Galaxy extends MainObject implements Measurable{

    private Measurable[] objects;

    public Galaxy(Characteristic characteristic) {
        super(characteristic);
    }

    public void setObjects(Measurable[] objects) {
        this.objects = objects;
    }

    @Override
    public void print() {
        for (Measurable object : objects) {
            System.out.println(object.measure());
        }
    }

    @Override
    public Characteristic measure() {
        return getCharacteristic();
    }
}
