package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class TestCity {
    public static void main(String[] args) {
        System.out.println("------ TestCity ------");
        ArrayList<City> cities = new ArrayList<City>();
        Collections.addAll(cities,
                new City("Nice", 343_000),
                new City("Carcassonne", 47_800),
                new City("Narbonne", 53_400),
                new City("Lyon", 48_4000),
                new City("Foix", 9_700),
                new City("Paux", 77200),
                new City("Marseille", 850_700),
                new City("Tarbes", 40_600));
        System.out.println("Cities: " + cities);

        System.out.println("--- Max population ---");
        Comparator<City> cityPopulationComparator = Comparator.comparing(city -> city.population);
        City maxCity = Collections.max(cities, cityPopulationComparator);
        System.out.println("Max population: " + maxCity.name + " (" + maxCity.population + ")");
        System.out.println("--- Max population ---");

        System.out.println("--- Remove min population ---");
        // Remove element with the minimum population
        cities.remove(Collections.min(cities, cityPopulationComparator));
        System.out.println("Cities: " + cities);
        System.out.println("--- Remove min population ---");

        System.out.println("--- Uppercase name with population > 100000 ---");
        // Uppercase all names with population > 100000
        Iterator<City> iterator = cities.iterator();
        while (iterator.hasNext()) {
            City city = iterator.next();
            if (city.population > 100_000) {
                city.name = city.name.toUpperCase();
            }
        }
        System.out.println("Cities: " + cities);
        System.out.println("--- Uppercase name with population > 100000 ---");

        System.out.println("------ TestCity ------");
    }
}
