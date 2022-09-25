package lesson6.home_work1;

/**
 * Дан одномерный массив целых чисел.
 * <p>
 * Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными числами, только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 * <p>
 * Пример:
 * [-4, 0, 1, 9, 0, -18, 3] ->
 * <p>
 * [-4, -18]
 * [0, 0]
 * [1, 9, 3]
 */

public class Task3 {
    public static void main(String[] args) {
        printArray(splitArray(-4, 0, 1, 9, 0, -18, 3));
    }

    public static int[][] splitArray(int... source) {
        int[][] result = new int[3][];
        result[0] = new int[getArraySize(source)[0]];
        result[1] = new int[getArraySize(source)[1]];
        result[2] = new int[getArraySize(source)[2]];
        int positiveIndex = 0;
        int negativeIndex = 0;
        int zeroIndex = 0;

        for (int i = 0; i < source.length; i++) {
            if (source[i] > 0) {
                result[0][positiveIndex++] = source[i];
            } else if (source[i] < 0) {
                result[1][negativeIndex++] = source[i];
            } else {
                result[2][zeroIndex++] = source[i];
            }
        }
        return result;
    }

    public static int[] getArraySize(int[] array) {
        int[] result = new int[3];

        for (int elem : array) {
            if (elem > 0) {
                result[0]++;
            } else if (elem < 0) {
                result[1]++;
            } else {
                result[2]++;
            }
        }
        return result;
    }

    public static void printArray(int[][] source) {
        for (int i = 0; i < source.length; i++) {
            for (int j = 0; j < source[i].length; j++) {
                System.out.print(source[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
