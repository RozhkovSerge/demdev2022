package core2.collections.hw1.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 Задание 1
 Дан список чатов.
 Каждый чат состоит из двух полей: название и количество пользователей в этом чате.

 Задача:
 - Удалить с помощью итератора из этого списка те чаты, что содержат менее 1000 пользователей.
 - Оставшиеся чаты отсортировать с помощью компараторов по убыванию по количеству пользователей, а если это количество совпадает, то по названию в алфавитном порядке.
 - Также предоставить сортировку чатов по названию по умолчанию.
 */

public class ChatRunner {

    public static void main(String[] args) {

        List<Chat> chatList = new ArrayList<>(List.of(
                new Chat("bChat", 1213),
                new Chat("aChat", 878),
                new Chat("fChat", 46),
                new Chat("eChat", 997),
                new Chat("daChat", 1879),
                new Chat("cChat", 43)
        ));

        Collections.sort(chatList);
        System.out.println(chatList);

        ChatUtil.removeIfUsersAmountLessThanOneThousand(chatList);
        System.out.println(chatList);
        chatList.sort(Comparator.comparing(Chat::getUsersAmount).reversed().thenComparing(Chat::getName));
        System.out.println(chatList);
    }
}
