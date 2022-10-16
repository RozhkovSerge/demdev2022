package core2.collections.hw1.task1;

import java.util.Iterator;
import java.util.List;

public final class ChatUtil {

    private ChatUtil() {
    }

    public static void removeIfUsersAmountLessThanOneThousand(List<Chat> chatList) {
        Iterator<Chat> chatIterator = chatList.listIterator();
        while (chatIterator.hasNext()) {
            Chat chat = chatIterator.next();
            if (chat.getUsersAmount() < 1000) {
                chatIterator.remove();
            }
        }
    }
}
