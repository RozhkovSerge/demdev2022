package core2.io.hw1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

    public static void main(String[] args) {
        Path name = Path.of("src", "core2", "io", "hw1", "items-name.csv");
        Path price = Path.of("src", "core2", "io", "hw1", "items-price.csv");
        Path out = Path.of("src", "core2", "io", "hw1", "out.csv");

        try (
                Stream<String> prices = Files.lines(price);
                Stream<String> names = Files.lines(name);
                BufferedWriter bufferedWriter = Files.newBufferedWriter(out, StandardOpenOption.APPEND, StandardOpenOption.CREATE)
        ) {
            List<String> priceList = prices.collect(Collectors.toList());
            List<String> nameList = names.collect(Collectors.toList());

            for (int id = 0; id < Math.max(priceList.size(), nameList.size()); id++) {
                bufferedWriter.write(getOutLine(priceList, nameList, id));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String getOutLine(List<String> priceList, List<String> nameList, int id) {
        if (id == 0) {
            return "ID, NAME, PRICE";
        } else {
            List<String> nameLine = Arrays.stream(nameList.get(id).split(",")).collect(Collectors.toList());
            List<String> priceLine = Arrays.stream(priceList.get(id).split(",")).collect(Collectors.toList());
            if (nameLine.contains(String.valueOf(id)) && priceLine.contains(String.valueOf(id))) {
                return nameLine.get(0) + ", " + nameLine.get(1) + ", " + priceLine.get(1);
            }
        }
        return "null, null, null";
    }
}
