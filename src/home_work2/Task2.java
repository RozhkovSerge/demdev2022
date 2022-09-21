package home_work2;

/**
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 */

public class Task2 {

    public static void main(String[] args) {
        System.out.println(solution(4700));
    }

    public static int solution(int value) {
        int result = 0;

        while (value > 0) {
            int digit = value % 10;
            value /= 10;
            result *= 10;
            result += digit;

        }
        return result;
    }
}
