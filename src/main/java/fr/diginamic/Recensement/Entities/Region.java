package fr.diginamic.Recensement.Entities;

import java.util.Objects;

public class Region implements Comparable<Region> {
    private int codeRegion;
    private String nomRegion;
    private int populationTotale;

    public Region(int codeRegion, String nomRegion) {
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public int getPopulationTotale() {
        return populationTotale;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    public void setPopulationTotale(int populationTotale) {
        this.populationTotale = populationTotale;
    }

    public int getCodeRegion() {
        return codeRegion;
    }

    public void setCodeRegion(int codeRegion) {
        this.codeRegion = codeRegion;
    }

    public void addPopulation(int population) {
        this.populationTotale += population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Region region)) return false;
        return Objects.equals(codeRegion, region.codeRegion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeRegion);
    }

    @Override
    public String toString() {
        return "Region{" +
                "codeRegion=" + codeRegion +
                ", nomRegion='" + nomRegion + '\'' +
                ", populationTotale=" + populationTotale +
                '}';
    }

    @Override
    public int compareTo(Region region) {
        return 0;
    }
}
