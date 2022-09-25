package core2.intro.home_work1;

public class Flat {

    private final int number;
    private final Room[] rooms;

    public Flat(int number, Room[] rooms) {
        this.number = number;
        this.rooms = rooms;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void print() {
        System.out.println("Квартира " + number + ", количестово комнат " + rooms.length);
    }
}
