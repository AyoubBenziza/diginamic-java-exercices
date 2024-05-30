package fr.diginamic.props.entities;

public class Fournisseur {

    private final int id;
    private final String nom;

    public Fournisseur(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Fournisseur [id=" + id + ", nom=" + nom + "]";
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }
}
