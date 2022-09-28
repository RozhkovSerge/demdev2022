package core2.strings.homework;

/**
 * Задание 1
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * <p>
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */


public class Task1 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abc Cpddd Dio OsfWw!"));

    }

    private static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        String formattedString = str.replace(" ", "").toUpperCase() + " ";
        for (int i = 0; i < formattedString.length()-1; i++) {
            if (formattedString.charAt(i) != formattedString.charAt(i + 1)) {
                sb.append(formattedString.charAt(i));
            }
        }
        return sb.toString();
    }
}
