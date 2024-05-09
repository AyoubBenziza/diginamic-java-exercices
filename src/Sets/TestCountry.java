package Sets;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class TestCountry {
    public static void main(String[] args) {
        System.out.println("------ TestCountry ------");

        HashSet<Country> countries = new HashSet<>(Set.of(
                new Country("USA", 333_300_000, 76_329.58),
                new Country("France", 67_970_000, 40_886.25),
                new Country("Germany", 83_020_000, 44_680.58),
                new Country("UK", 67_800_000, 42_943.90),
                new Country("Italy", 60_480_000, 34_483.20),
                new Country("Japan", 126_500_000, 40_885.65),
                new Country("China", 1_393_000_000, 10_261.59),
                new Country("Russia", 146_700_000, 11_289.41),
                new Country("Inde", 1_393_000_000, 2_104.09)
        ));
        System.out.println("Countries: " + countries);

        System.out.println("--- GPD Per Capita ---");
        Comparator<Country> countryGDPPerCapitaComparator = Comparator.comparing(country -> country.GDPPerCapita);
        Country maxGPDPerCapitaCountry = Collections.max(countries, countryGDPPerCapitaComparator);
        System.out.println("Max GDP per capita: " + maxGPDPerCapitaCountry.name + " (" + maxGPDPerCapitaCountry.population + ")");
        System.out.println("--- GPD Per Capita ---");

        System.out.println("--- GPD ---");
        Comparator<Country> countryGDPComparator = Comparator.comparing(country -> country.GDPPerCapita / country.population);
        Country maxGDPCountry = Collections.max(countries, countryGDPComparator);
        System.out.println("Max GDP: " + maxGDPCountry.name + " (" + maxGDPCountry.population + ")");

        Country minGDPCountry = Collections.min(countries, countryGDPComparator);
        System.out.println("Min GDP: " + minGDPCountry.name.toUpperCase() + " (" + minGDPCountry.population + ")");
        countries.remove(minGDPCountry);
        System.out.println("Countries: " + countries);
        System.out.println("--- GPD ---");

        System.out.println("------ TestCountry ------");
    }
}
