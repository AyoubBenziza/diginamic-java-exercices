package fr.diginamic.Enumeration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestContinentEnumeration {
    public static void main(String[] args) {
        System.out.println("------ Test Continent Enumeration ------");
        List<City> cities = new ArrayList<>();
        Collections.addAll(cities,
                new City("New York", 8_336_817, Continent.AMERICA),
                new City("Paris", 2_148_271, Continent.EUROPE),
                new City("Pekin", 21_516_000, Continent.ASIA),
                new City("Moscow", 11_503_501, Continent.EUROPE),
                new City("Berlin", 3_562_166, Continent.EUROPE),
                new City("Sydney", 4_627_345, Continent.OCEANIA),
                new City("Sao Paulo", 12_176_866, Continent.AMERICA),
                new City("Dakar", 1_146_053, Continent.AFRICA)
        );

        for (City city : cities) {
            System.out.println(city);
        }

        System.out.println("------ Test Continent Enumeration ------");
    }
}
