package fr.diginamic.File;


import fr.diginamic.Utils.Export;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ReadFile {
    static final String COMMA_DELIMITER = ";";
    static final String dataPath = Objects.requireNonNull(ClassLoader.getSystemClassLoader().getResource("recensement.csv")).getFile();
    static final String outputPath = "src/main/java/fr/diginamic/File/Data/cities.csv";

    public static void main(String[] args) {
        System.out.println("------ ReadFile ------");
        try {
            List<String> lines = Files.readAllLines(Paths.get(dataPath));

            String[] headers = lines.removeFirst().split(COMMA_DELIMITER);

            List<City> cities = new ArrayList<City>();
            for (String line : lines) {
                String[] attributes = line.split(COMMA_DELIMITER);
                if (attributes.length == 0) continue;

                String region = attributes[0];
                String name = attributes[6];
                String department = attributes[2];
                int population = Integer.parseInt(attributes[9].replaceAll(" ", ""));

                cities.add(new City(name, department, region, population));
            }

            List<City> filteredCities = cities.stream().filter((c) -> c.getPopulation() > 25000)
                    .collect(Collectors.toList());

            Export.toCSV(filteredCities, outputPath, ';');

            System.out.println("File created: " + outputPath);

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("------ ReadFile ------");
    }
}
