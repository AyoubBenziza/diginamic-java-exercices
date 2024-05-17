package fr.diginamic.Sorting;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestSortCity {
    static final String outPath = "src/Sorting/Data/test.csv";

    public static void main(String[] args) {
        System.out.println("------ TestSortCity ------");
        List<City> cities = new ArrayList<City>();
        Collections.addAll(cities,
                new City("Paris", 2_148_000),
                new City("Berlin", 3_326_000),
                new City("Brussels", 1_208_000),
                new City("Moscow", 12_506_000),
                new City("Beijing", 21_516_000),
                new City("Jakarta", 10_075_000),
                new City("Sydney", 5_312_000));

        System.out.println("Cities: ");
        for (City city : cities) {
            System.out.println(city);
        }

        System.out.println("--- Sort by Name ---");
        Collections.sort(cities, new ComparatorName());
        System.out.println("Cities: ");
        for (City city : cities) {
            System.out.println(city);
        }
        System.out.println("--- Sort by Name ---");

        System.out.println("--- Sort by Population ---");
        Collections.sort(cities, new ComparatorPopulation());
        System.out.println("Cities: ");
        for (City city : cities) {
            System.out.println(city);
        }
        System.out.println("--- Sort by Population---");

        System.out.println("--- Sort by Population > 25000 Order by DESC ---");
        try {
            Collections.sort(cities);
            List<City> filteredCities = cities.stream().filter((c) -> c.getPopulation() > 25000).toList();

            List<String> csvLines = filteredCities.stream()
                    .map(city -> city.getName() + ";" + city.getPopulation()).toList();

            Files.write(Paths.get(outPath), csvLines, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("File created: " + outPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("--- Sort by Population > 25000 Order by DESC ---");

        System.out.println("------ TestSortCity ------");
    }
}
