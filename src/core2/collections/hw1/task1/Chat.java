package core2.collections.hw1.task1;

public class Chat implements Comparable<Chat> {

    private String name;
    private int usersAmount;

    public Chat(String name, int usersAmount) {
        this.name = name;
        this.usersAmount = usersAmount;
    }

    public String getName() {
        return name;
    }

    public int getUsersAmount() {
        return usersAmount;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "name='" + name + '\'' +
                ", usersAmount=" + usersAmount +
                '}';
    }

    @Override
    public int compareTo(Chat o) {
        return this.name.compareTo(o.getName());
    }
}
