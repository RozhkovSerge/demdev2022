package core2.io.hw1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.stream.Stream;

public class Task1 {

    private static String[] priceData;
    private static String[] nameData;

    public static void main(String[] args) {
        Path name = Path.of("src", "core2", "io", "hw1", "items-name.csv");
        Path price = Path.of("src", "core2", "io", "hw1", "items-price.csv");
        Path out = Path.of("src", "core2", "io", "hw1", "out.csv");

        try (
                Stream<String> prices = Files.lines(price);
                Stream<String> names = Files.lines(name);
                BufferedWriter bufferedWriter = Files.newBufferedWriter(out, StandardOpenOption.APPEND, StandardOpenOption.CREATE)
        ) {
            priceData = prices.toArray(String[]::new);
            nameData = names.toArray(String[]::new);

            for (int id = 0; id < Math.max(priceData.length, nameData.length); id++) {
                bufferedWriter.write(getNextLine(id));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String getNextLine(int id) {
        int headerPosition = 0;
        int indexPosition = 0;
        int namePosition = 1;
        int pricePosition = 1;

        if (id == headerPosition) {
            return "ID, NAME, PRICE";
        } else {
            String[] nameLineById = nameData[id].split(",");
            String[] priceLineById = priceData[id].split(",");
            if (Arrays.asList(nameLineById).contains(String.valueOf(id)) && Arrays.asList(priceLineById).contains(String.valueOf(id))) {
                return nameLineById[indexPosition] + ", " + nameLineById[namePosition] + ", " + priceLineById[pricePosition];
            }
        }
        return "null, null, null";
    }
}
