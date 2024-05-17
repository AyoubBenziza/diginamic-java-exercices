package fr.diginamic.File;

import fr.diginamic.Annotations.CSV;

public class City {
    @CSV(columnName = "Ville", order = 2)
    private final String name;

    @CSV(columnName = "Departement", order = 1)
    private final String department;

    @CSV(columnName = "Region", order = 4)
    private final String region;

    @CSV(columnName = "Population", order = 3)
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
