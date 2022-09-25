package core2.intro.home_work1;

public class House {

    private final int number;
    private final Floor[] floors;

    public House(int number, Floor[] floors) {
        this.number = number;
        this.floors = floors;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void print() {
        System.out.println("Дом " + number + ", количество этажей " + floors.length);
    }
}
