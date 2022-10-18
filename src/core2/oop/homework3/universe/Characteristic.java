package core2.oop.homework3.universe;

public class Characteristic {
    private long mass;
    private Size size;
    private int brightness;
    private String name;
    private long distanceFromEarth;
    private int temperature;

    public static class Builder {

        private Characteristic characteristic;

        Builder() {
            characteristic = new Characteristic();
        }

        public Builder mass(long mass) {
            this.characteristic.mass = mass;
            return this;
        }

        public Builder size(Size size) {
            this.characteristic.size = size;
            return this;
        }

        public Builder brightness(int brightness) {
            this.characteristic.brightness = brightness;
            return this;
        }

        public Builder name(String name) {
            this.characteristic.name = name;
            return this;
        }

        public Builder distanceFromEarth(long distanceFromEarth) {
            this.characteristic.distanceFromEarth = distanceFromEarth;
            return this;
        }

        public Builder temperature(int temperature) {
            this.characteristic.temperature = temperature;
            return this;
        }

        public Characteristic build() {
            return characteristic;
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Объект: имя -%s, масса -%d , размер -%s, яркость -%d , температура -%d, расстояние до Земли -%d", name, mass, size, brightness, temperature, distanceFromEarth);
    }
}
