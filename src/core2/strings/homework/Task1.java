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
        System.out.println(removeDuplicateSymbolsFromString("abc Cpddd Dio OsfWw!"));

    }

    private static String removeDuplicateSymbolsFromString(String str) {
        StringBuilder sb = new StringBuilder();
        String formattedString = str.replace(" ", "").toUpperCase() + " ";
        for (int index = 0; index < formattedString.length()-1; index++) {
            if (formattedString.charAt(index) != formattedString.charAt(index + 1)) {
                sb.append(formattedString.charAt(index));
            }
        }
        return sb.toString();
    }
}
