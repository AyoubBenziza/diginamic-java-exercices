package Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class CountCountriesByContinent {
    public static void main(String[] args) {
        System.out.println("------ CountCountriesByContinent ------");
        ArrayList<Country> countries = new ArrayList<>(Set.of(
                new Country("France", 67_000_000, "Europe"),
                new Country("Germany", 80_000_300, "Europe"),
                new Country("Belgium", 10_000_000, "Europe"),
                new Country("Russia", 150_000_000, "Europe"),
                new Country("China", 1_400_000_000, "Asia"),
                new Country("Indonesia", 220_000_000, "Asia"),
                new Country("Australia", 20_000_000, "Oceania")
        ));

        HashMap<String, Integer> countCountries = new HashMap<>();
        for (Country country : countries) {
            String continent = country.getContinent();
            if (countCountries.containsKey(continent)) {
                countCountries.put(continent, countCountries.get(continent) + 1);
            } else {
                countCountries.put(continent, 1);
            }
        }
        System.out.println("Count countries by continent: " + countCountries);
        
        System.out.println("------ CountCountriesByContinent ------");
    }
}
