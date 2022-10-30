package core2.io;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class FileRunner {
    public static void main(String[] args) throws IOException {
        File dir = new File("src/core2/io/resources");
        File file = new File("src/core2/io/resources/file.txt");
        dir.mkdir();
        file.createNewFile();
        System.out.println(file.exists());
        System.out.println(file.getParent());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.isDirectory());

        //***************************************

        File file1 = Path.of("src", "core2", "io", "resources", "file3.txt").toFile();
//        file1.createNewFile();

        try (InputStream is = new FileInputStream(file1)) {
            byte[] bytes = new byte[is.available()];
            int currentByte = 0;
            int count = 0;
            while ((currentByte = is.read()) != -1) {
                bytes[count++] = (byte) currentByte;
            }
            String str = new String(bytes);
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //***************************************Reader
        System.out.println("------------------------------------------");
        BufferedReader br = new BufferedReader(new FileReader(file1));
        String str = br.lines().collect(Collectors.joining("\n"));
        System.out.println(str);

        //***************************************OutputStream
        File outFile = Path.of("src","core2","io", "resources", "file.txt").toFile();
        try(FileOutputStream fos = new FileOutputStream(outFile, true);) {
            fos.write(str.getBytes());
            fos.write(System.lineSeparator().getBytes());
        }

        //!!!!!!!!!!!!!!!!!!!!!!!!ВОПРОС!!!!!!!!!!!!!!!!!!
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file)); //LogOutputStream нельзя


        //**************************************Writer
        try(BufferedWriter bf = new BufferedWriter(new FileWriter(file))) {
            bf.append("hello word!");
            bf.append("by world!!!");
            FileWriter fw = new FileWriter(file1);
        }

        //**************************************Files
        Path path = Path.of("src","core2","io", "resources", "poem.txt");
        Files.write(path, List.of("hello", "java"));
        System.out.println(Files.readAllLines(path));
    }
}
