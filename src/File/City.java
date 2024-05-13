package File;

import Annotations.CSV;

public class City {
    @CSV(column = "Ville", order = 2, separator = ";")
    private final String name;

    @CSV(column = "Departement", order = 1, separator = ";")
    private final String department;

    @CSV(column = "Region", order = 4, separator = ";")
    private final String region;

    @CSV(column = "Population", order = 3, separator = ";")
    private final int population;

    public City(String name, String department, String region, int population) {
        this.name = name;
        this.department = department;
        this.region = region;
        this.population = population;
    }

    @Override
    public String toString() {
        return department + " " + name + " (" + population + "), " + region;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getRegion() {
        return region;
    }

    public int getPopulation() {
        return population;
    }
}
