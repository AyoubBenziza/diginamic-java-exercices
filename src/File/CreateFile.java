package File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class CreateFile {

    static final String dataPath = "src/Data/recensement.csv";
    static final String outPath = "src/Data/citiesFirst100.csv";

    public static void main(String[] args) {
        System.out.println("------ CreateFile ------");

        try {
            List<String> lines = Files.readAllLines(Paths.get(dataPath));
            String header = lines.getFirst();

            List<String> first100 = lines.subList(1, 100);

            Files.write(Paths.get(outPath), first100, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("File created: " + outPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("------ CreateFile ------");
    }
}
