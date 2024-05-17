package fr.diginamic.Lists;

public class City {
    public String name;
    public int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public String toString() {
        return name + " (" + population + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof City) {
            City city = (City) obj;
            return name.equals(city.name) && population == city.population;
        }
        return false;
    }

}
