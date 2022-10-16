package core2.collections.hw1.task2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Задание 2
 * Дан список чатов с предыдущего задания, только вместо поля “количество пользователей” будет список объектов типа Пользователь, который имеет 3 поля: id (целочисленный идентификатор), имя и возраст.
 * <p>
 * Задача:
 * - Преобразовать список чатов в один список пользователей всех чатов, возраст которых больше 18 лет
 * - С помощью итератора посчитать средний возраст всех оставшихся пользователей.
 */

public class ChatRunner {

    public static void main(String[] args) {

        List<Chat> chatList = new ArrayList<>(List.of(
                new Chat("bChat", UserUtils.getUsers(10)),
                new Chat("aChat", UserUtils.getUsers(5)),
                new Chat("fChat", UserUtils.getUsers(8)),
                new Chat("eChat", UserUtils.getUsers(12)),
                new Chat("daChat", UserUtils.getUsers(19)),
                new Chat("cChat", UserUtils.getUsers(20))
        ));

        List<User> usersWithAgeAfterEighteen = UserUtils.getUsersWithAgeAfter(chatList, 18);
        usersWithAgeAfterEighteen.forEach(System.out::println);

        System.out.println("Средний возраст: " + UserUtils.getUsersAverageAge(usersWithAgeAfterEighteen));

    }
}
