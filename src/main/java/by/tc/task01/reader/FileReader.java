package by.tc.task01.reader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static by.tc.task01.writer.FileWriter.addDataToFile;

public class FileReader {

    private final static String filePath;

    static {
        try {
            File file = File.createTempFile("tmp", "txt");
            filePath = file.getAbsolutePath();
            file.deleteOnExit();
            addDataToFile(filePath);
        } catch (IOException e) {
            throw new ExceptionInInitializerError("Can't create temp file");
        }

    }

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
