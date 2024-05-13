package Enumeration;

public class City {
    private String name;
    private int population;
    private Continent continent;

    public City(String name, int population, Continent continent) {
        this.name = name;
        this.population = population;
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    @Override
    public String toString() {
        return name + " (" + population + "), " + continent.label;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof City city) {
            return name.equals(city.name) && population == city.population;
        }
        return false;
    }

}
