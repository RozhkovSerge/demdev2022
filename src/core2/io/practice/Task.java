package core2.io.practice;

import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PipedReader;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 1. Задан файл с текстом, найти и вывести в консоль все слова начинающиеся гласной буквы.
 * 2. Найти все слова для которых последняя буква одного слова совпадает с первой буквой следующего слова.
 * 3. В каждой сроке найти количество цифр, идущих подряд
 * 4. Прочитать и заменить все public на private и записать в другой файл
 * 5. Задан файл с java-кодом прочитать текст программы и записать в обратном порядке в другой файл
 */

public class Task {

    private final static String VOWELS = "УуЕеОоАаИиЮюЯя";

    public static void main(String[] args) throws IOException {


        /**
         * 1. Задан файл с текстом, найти и вывести в консоль все слова начинающиеся гласной буквы.
         */
        Path path = Path.of("src", "core2", "io", "resources", "esenin.txt");

        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()) {
                String currentWord = scanner.next();
                char firstLetter = currentWord.charAt(0);
                if (VOWELS.indexOf(firstLetter) != -1) {
                    System.out.println(currentWord);
                }
            }
        }

        /**
         * 2. Найти все слова для которых последняя буква одного слова совпадает с первой буквой следующего слова.*/
        try (Scanner scanner = new Scanner(path)) {
            String prev = null;
            if (scanner.hasNext()) {
                prev = scanner.next();
            }
            while (scanner.hasNext()) {
                String currentWord = scanner.next();
                if (isLastLetterIsEqualsToFirstLetter(prev, currentWord)) {
                    System.out.println(prev + " " + currentWord);
                }
                prev = currentWord;
            }
        }
        /**
         * 3. В каждой сроке найти количество цифр, идущих подряд
         */
        System.out.println("-----------Task3----------------");
        Files.readAllLines(path).stream()
                .map(Task::getMaxDigits)
                .forEach(System.out::println);


        /**
         * 4. Прочитать и заменить все public на private и записать в другой файл
         */
        System.out.println("-----------Task4----------------");
        Path javaFilePath = Path.of("src", "core2", "io", "FileRunner.java");
//        String code = Files.readString(javaFilePath).replace("public", "private");
        Path out = Path.of("src", "core2", "io", "FileRunnerOut.java");
//        Files.writeString(out, code);

        /**
         * 5. Задан файл с java-кодом прочитать текст программы и записать в обратном порядке в другой файл
         */
        System.out.println("-----------Task5----------------");
        Path source = Path.of("src", "core2", "io", "FileRunner3.java");
        Path output = Path.of("src", "core2", "io", "Out.java");

        try(Stream<String> lines = Files.lines(source);
            BufferedWriter bufferedWriter = Files.newBufferedWriter(output, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        ) {
            lines
                    .map(StringBuilder::new)
                    .map(StringBuilder::reverse)
                    .forEach(s-> {
                        try {
                            bufferedWriter.write(s.toString());
                            bufferedWriter.newLine();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });

        }





    }

    private static int getMaxDigits(String line) {

        int result = 0;
        int counter = 0;

        for (int i = 0; i < line.length(); i++) {
            if (Character.isDigit(line.charAt(i))) {
                counter++;
            } else {
                if (result < counter) {
                    result = counter;
                }
                counter = 0;
            }
        }
        return result;
    }

    private static boolean isLastLetterIsEqualsToFirstLetter(String prev, String currentWord) {
        return prev.charAt(prev.length() - 1) == currentWord.charAt(0);
    }
}
