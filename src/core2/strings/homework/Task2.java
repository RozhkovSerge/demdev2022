package core2.strings.homework;

/**
 * Задание 2
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * <p>
 * Написать 2 метода:
 * <p>
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * <p>
 * Посчитать сумму всех чисел из строки
 * <p>
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */

public class Task2 {

    public static void main(String[] args) {
        System.out.println(getSumOfNumbersInString("Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?"));
    }

    private static int[] getNumbersFromString(String source) {
        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < source.length(); index++) {
            if (source.charAt(index) >= 49 && source.charAt(index) <= 57) {
                sb.append(source.charAt(index));
            }
        }

        String[] stringsArray = sb.toString().split("");
        int[] numbersArray = new int[stringsArray.length];
        for (int index = 0; index < stringsArray.length; index++) {
            numbersArray[index] = Integer.parseInt(stringsArray[index]);
        }

        return numbersArray;
    }

    private static int getSumOfNumbersInString(String source) {
        int[] numbersArray = getNumbersFromString(source);
        int result = 0;

        for (int elem : numbersArray) {
            result += elem;
        }

        return result;
    }
}
