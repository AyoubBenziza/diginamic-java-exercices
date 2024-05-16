package Recensement.Entities;

import java.util.Objects;

public class Departement implements Comparable<Departement> {
    private String codeDepartement;
    private int populationTotale;

    public Departement(String codeDepartement, int populationTotale) {
        this.codeDepartement = codeDepartement;
        this.populationTotale = populationTotale;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public int getPopulationTotale() {
        return populationTotale;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public void setPopulationTotale(int populationTotale) {
        this.populationTotale = populationTotale;
    }

    @Override
    public int compareTo(Departement departement) {
        return 0;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "codeDepartement='" + codeDepartement + '\'' +
                ", populationTotale=" + populationTotale +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departement departement)) return false;
        return Objects.equals(codeDepartement, departement.codeDepartement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeDepartement);
    }
}
