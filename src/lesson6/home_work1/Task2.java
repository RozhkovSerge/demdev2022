package lesson6.home_work1;

/**
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 * <p>
 * Далее определить среднее арифметическое всех элементов целочисленного массива и вывести на консоль только те элементы, которые больше этого среднего арифметического.
 */

public class Task2 {
    public static void main(String[] args) {
        int[] numsArray = charsToNumbers('a', '6', 'y', 'P', 'T', 'q', '9', '+');
        int average = findAverage(numsArray);

        for (int elem : numsArray) {
            if (elem > average) {
                System.out.print(elem + " ");
            }
        }
    }

    public static int[] charsToNumbers(char... source) {
        int[] result = new int[source.length];
        int index = 0;
        for (char c : source) {
            result[index++] = c;
        }
        return result;
    }

    public static int findAverage(int[] source) {
        int sum = 0;
        for (int i : source) {
            sum += i;
        }
        return sum / source.length;
    }
}
