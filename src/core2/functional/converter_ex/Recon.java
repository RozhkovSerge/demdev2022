package core2.functional.converter_ex;

public class Recon {
    private final String name;
    private final int age;

    public Recon(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Recon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
