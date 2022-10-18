package core2.oop.homework3.universe;

public class Runner {

    public static void main(String[] args) {

        Measurable star1 = new Star(new Characteristic.Builder()
                .name("St1")
                .size(Size.BIG)
                .mass(242)
                .build());

        Measurable star2 = new Star(new Characteristic.Builder()
                .name("St2")
                .size(Size.SMALL)
                .mass(24)
                .build());

        Galaxy galaxy = new Galaxy(new Characteristic.Builder()
                .name("Galaxy1")
                .mass(3242342)
                .size(Size.HUGE)
                .brightness(43)
                .distanceFromEarth(3423442)
                .build());

        galaxy.setObjects(new Measurable[]{star1, star2});


        System.out.println(galaxy.measure());
        galaxy.print();
    }

}
