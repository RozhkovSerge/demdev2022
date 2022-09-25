package lesson6.home_work1;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 */

public class Task1 {

    public static void main(String[] args) {
        int[] positiveValuesArray = removeNegativeValues(new int[]{3, 5, -6, 3, 2, -9, 0, -123});
        printArray(positiveValuesArray);
    }

    public static int[] removeNegativeValues(int[] array) {
        int size = getArraySize(array);
        int[] result = new int[size];
        int index = 0;
        for (int elem : array) {
            if (elem >= 0) {
                result[index++] = elem;
            }
        }

        for (int i = 0; i < size; i++) {
            result[i] *= size;
        }
        return result;
    }

    private static int getArraySize(int[] array) {
        int size = 0;
        for (int elem : array) {
            if (elem >= 0) {
                size++;
            }
        }
        return size;
    }

    public static void printArray(int[] array) {
        for (int elem : array) {
            System.out.print(elem + " ");
        }
    }
}
