package core2.intro.home_work1;

public class Floor {

    private final int number;
    private final Flat[] flats;

    public Floor(int number, Flat[] flats) {
        this.number = number;
        this.flats = flats;
    }

    public Flat[] getFlats() {
        return flats;
    }

    public void print() {
        System.out.println("Этаж " + number + ", количество квартир " + flats.length);
    }
}
