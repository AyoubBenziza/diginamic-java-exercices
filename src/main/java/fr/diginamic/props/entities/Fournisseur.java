package fr.diginamic.props.entities;

public record Fournisseur(int id, String nom) {

    @Override
    public String toString() {
        return "Fournisseur [id=" + id + ", nom=" + nom + "]";
    }
}
