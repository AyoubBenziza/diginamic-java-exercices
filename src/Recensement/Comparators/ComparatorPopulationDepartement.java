package Recensement.Comparators;

import Recensement.Entities.Departement;

import java.util.Comparator;

public class ComparatorPopulationDepartement implements Comparator<Departement> {
    @Override
    public int compare(Departement o1, Departement o2) {
        // Compare the population of the departements
        return o1.getPopulationTotale() - o2.getPopulationTotale();
    }
}
