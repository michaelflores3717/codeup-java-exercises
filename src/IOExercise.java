import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IOExercise {
    public static void main(String[] args) {
        String directory = "data";
        String filename = "info.txt";
        String filepath = "data/info.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);
        Path filePath = Paths.get(filepath);

        try {
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }
            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }

            List<String> lines = new ArrayList<>(Arrays.asList("mike", "bob", "charlie"));

            Files.write(filePath, lines);

        } catch(IOException ioe) {
            System.out.println(ioe);
        }

        List<String> testList = returnStringList(filePath);
        for (String item : testList) {
            System.out.println(item);
        }

    }

    public static List<String> returnStringList (Path filePath) {
        List<String> newFile = new ArrayList<>();
        try {
            newFile = Files.readAllLines(filePath);
        } catch(IOException ioe) {
            System.out.println(ioe);
        }
        return newFile;
    }
}

