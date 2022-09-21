package home_work2;

/**
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр (вторая функция - нечетных).
 */

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Четных: " + getEvensSum(228910));
        System.out.println("Нечетных: " + getOddsSum(228910));
    }

    public static int getOddsSum(int value) {
        int currentValue = value;
        int count = 0;

        while (currentValue != 0) {
            if ((currentValue % 10) % 2 != 0) {
                count++;
            }
            currentValue /= 10;
        }
        return count;
    }

    public static int getEvensSum(int value) {
        int currentValue = value;
        int count = 0;

        while (currentValue != 0) {
            if ((currentValue % 10) % 2 == 0) {
                count++;
            }
            currentValue /= 10;
        }
        return count;
    }
}

