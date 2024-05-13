package Sorting;

import java.util.Comparator;

public class ComparatorName implements Comparator<City> {

    public int compare(City city1, City city2) {
        return city1.getName().compareTo(city2.getName());
    }
}
