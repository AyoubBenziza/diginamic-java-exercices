package fr.diginamic.Sets;

public class Country {
    String name;
    int population;
    double GDPPerCapita;

    public Country(String name, int population, double PIBPerCapita) {
        this.name = name;
        this.population = population;
        this.GDPPerCapita = PIBPerCapita;
    }

    @Override
    public String toString() {
        return name + " (" + population + ")";
    }
}
