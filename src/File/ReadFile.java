package File;


import Utils.ExportToCSV;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ReadFile {
    static final String COMMA_DELIMITER = ";";
    static final String dataPath = "src/Data/recensement.csv";
    static final String outputPath = "src/File/Data/cities.csv";

    public static void main(String[] args) {
        System.out.println("------ ReadFile ------");
        try {
            List<String> lines = Files.readAllLines(Paths.get(dataPath));

            String[] headers = lines.get(0).split(COMMA_DELIMITER);
            lines.remove(0);

            List<City> cities = new ArrayList<City>();
            for (String line : lines) {
                String attributes[] = line.split(COMMA_DELIMITER);
                if (attributes.length == 0) continue;

                String region = attributes[0];
                String name = attributes[6];
                String department = attributes[2];
                int population = Integer.parseInt(attributes[9].replaceAll(" ", ""));

                cities.add(new City(name, department, region, population));
            }

            List<City> filteredCities = cities.stream().filter((c) -> c.getPopulation() > 25000)
                    .collect(Collectors.toList());

//            List<String> csvLines = filteredCities.stream()
//                    .map(city -> city.getName() + ";" + city.getDepartment() + ";" + city.getRegion() + ";"
//                            + city.getPopulation())
//                    .collect(Collectors.toList());

            new ExportToCSV(filteredCities, outputPath);

//            Files.write(Paths.get(outputPath), csvLines);
            System.out.println("File created: " + outputPath);

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("------ ReadFile ------");
    }
}
