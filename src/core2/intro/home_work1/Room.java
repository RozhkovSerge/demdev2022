package core2.intro.home_work1;

public class Room {

    private final boolean isPassage;

    public Room(boolean isPassage) {
        this.isPassage = isPassage;
    }

    public boolean isPassage() {
        return isPassage;
    }

    public void print() {
        System.out.println("Комната проходная: " + isPassage);
    }
}
