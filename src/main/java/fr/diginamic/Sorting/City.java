package fr.diginamic.Sorting;

public class City implements Comparable<City> {
    private final String name;
    private final int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public int compareTo(City city) {
//        return this.name.compareTo(city.getName());
        return -(this.population - city.getPopulation());
    }

    @Override
    public String toString() {
        return name + " (" + population + ")";
    }

}
