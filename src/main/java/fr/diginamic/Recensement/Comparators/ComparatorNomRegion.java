package fr.diginamic.Recensement.Comparators;

import fr.diginamic.Recensement.Entities.City;

import java.util.Comparator;

public class ComparatorNomRegion implements Comparator<City> {
    @Override
    public int compare(City o1, City o2) {
        // Compare the population of the regions
        return o1.getNomRegion().compareTo(o2.getNomRegion());
    }
}
