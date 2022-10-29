package core2.io.practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;

public class CharacterHelperRunner {
    public static void main(String[] args) throws IOException {
        Path poemPath = Path.of("src", "core2", "io", "resources", "esenin.txt");
        Map<Character, Integer> characterFrequency = CharacterHelper.calcFrequency(poemPath);

        Path resultPath = Path.of("src", "core2", "io", "resources", "file.txt");
        Files.write(resultPath, CharacterHelper.toListRepresentation(characterFrequency), CREATE, TRUNCATE_EXISTING);
    }
}
