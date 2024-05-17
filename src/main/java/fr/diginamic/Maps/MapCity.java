package fr.diginamic.Maps;

import fr.diginamic.Lists.City;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapCity {
    public static void main(String[] args) {
        System.out.println("------ MapCity ------");
        HashMap<String, City> cities = new HashMap<>(
                Map.of(
                        "Paris", new City("Paris", 2_148_000),
                        "Berlin", new City("Berlin", 3_326_000),
                        "Brussels", new City("Brussels", 1_208_000),
                        "Moscow", new City("Moscow", 12_506_000),
                        "Beijing", new City("Beijing", 21_516_000),
                        "Jakarta", new City("Jakarta", 10_075_000),
                        "Sydney", new City("Sydney", 5_312_000)
                )
        );

        System.out.println("Cities: " + cities);

        System.out.println("--- Remove Min Population ---");
        Comparator<City> byPopulation = Comparator.comparingInt(c -> c.population);
        City minCity = Collections.min(cities.values(), byPopulation);
        System.out.println("City Minimum Population: " + minCity);
        cities.remove(minCity.name);
        System.out.println("Cities: " + cities);
        System.out.println("--- Remove Min Population ---");


        System.out.println("------ MapCity ------");
    }
}
