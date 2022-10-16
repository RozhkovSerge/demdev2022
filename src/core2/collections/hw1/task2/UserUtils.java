package core2.collections.hw1.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class UserUtils {

    private static final String[] NAMES = new String[]{"John", "Tom", "Maria", "Mark", "Phil", "Mike", "Martin", "Chelsy", "Barbara", "Ann", "Ernesto", "Lucy", "Oleg"};

    private UserUtils() {
    }

    public static List<User> getUsers(int amount) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            users.add(new User(i, NAMES[new Random().nextInt(NAMES.length - 1)], new Random().nextInt(100)));
        }
        return users;
    }

    public static List<User> getUsersWithAgeAfter(List<Chat> chats, int age) {
        List<User> resultList = new ArrayList<>();
        for (Chat chat : chats) {
            for (User user : chat.getUsers()) {
                if (user.getAge() >= age) {
                    resultList.add(user);
                }
            }
        }
        return resultList;
    }

    public static int getUsersAverageAge(List<User> users) {
        int usersAgeSum = 0;
        for (User user : users) {
            usersAgeSum += user.getAge();
        }
        return usersAgeSum / users.size();
    }
}
