package core2.intro.home_work1;

public class Runner {
    public static void main(String[] args) {
        Room room1 = new Room(true);
        Room room2 = new Room(false);

        Flat flat1 = new Flat(1, new Room[]{room1, room2, room1});
        Flat flat2 = new Flat(2, new Room[]{room1, room2});
        Flat flat3 = new Flat(3, new Room[]{room2, room1, room1});
        Flat flat4 = new Flat(4, new Room[]{room1});
        Flat flat5 = new Flat(5, new Room[]{room1, room2, room1, room1});

        Floor floor1 = new Floor(1, new Flat[]{flat1, flat4});
        Floor floor2 = new Floor(2, new Flat[]{flat1, flat2, flat4});
        Floor floor3 = new Floor(3, new Flat[]{flat1, flat4, flat3});
        Floor floor4 = new Floor(4, new Flat[]{flat1, flat2, flat3, flat5});

        House house = new House(1, new Floor[]{floor1, floor2, floor3, floor4});

        printAllInformation(house);
    }

    public static void printAllInformation(House house) {
        System.out.println("--------------------------------");
        house.print();
        System.out.println("--------------------------------");
        for (Floor floor: house.getFloors() ) {
            floor.print();
            for(Flat flat: floor.getFlats()) {
                flat.print();
                for(Room room: flat.getRooms()) {
                    room.print();
                }
            }
            System.out.println("--------------------------------");
        }
    }
}
