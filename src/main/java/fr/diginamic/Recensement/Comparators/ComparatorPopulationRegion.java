package fr.diginamic.Recensement.Comparators;

import fr.diginamic.Recensement.Entities.Region;

import java.util.Comparator;

public class ComparatorPopulationRegion implements Comparator<Region> {

    @Override
    public int compare(Region city1, Region city2) {
        // Compare the population of the cities
        return city1.getPopulationTotale() - city2.getPopulationTotale();
    }
}
