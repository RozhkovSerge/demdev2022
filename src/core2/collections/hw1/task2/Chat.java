package core2.collections.hw1.task2;

import java.util.List;

public class Chat implements Comparable<Chat> {

    private String name;
    private List<User> users;

    public Chat(String name, List<User> users) {
        this.name = name;
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public List<User> getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "name='" + name + '\'' +
                ", usersAmount=" + users.toString() +
                '}';
    }

    @Override
    public int compareTo(Chat o) {
        return this.name.compareTo(o.getName());
    }
}
