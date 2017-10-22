package by.tc.task01.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileReader {

    private final static String filePath = "data.txt";

    private FileReader() {
    }

    public static List<String> readLines() {
        try {
            return Files.lines(Paths.get(filePath)).collect(Collectors.toList());
        } catch (NoSuchFileException e) {
            System.out.println("File wasn't found, file path = " + filePath);
        } catch (IOException e) {
            System.out.println("Can't open file, file path = " + filePath);
        }
        return null;
    }

}
