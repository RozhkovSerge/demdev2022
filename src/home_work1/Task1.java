package home_work1;

/**
 * Задание 1
 * <p>
 * В переменной minutes лежит число от 0 до 59.
 * Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
 * в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
 * <p>
 * Протестировать функцию в main.
 */

public class Task1 {
    public static void main(String[] args) {
        System.out.println(solution(59));
    }

    public static String solution(int minutes) {
        if (minutes >= 0 && minutes < 15) {
            return "Первая четверть часа";
        } else if (minutes >= 15 && minutes < 30) {
            return "Вторая четверть часа";
        } else if (minutes >= 30 && minutes < 45) {
            return "Третья четверть часа";
        } else if (minutes >= 45 && minutes < 60) {
            return "Четвертая четверть часа";
        } else {
            return "Неверные данные";
        }
    }
}


