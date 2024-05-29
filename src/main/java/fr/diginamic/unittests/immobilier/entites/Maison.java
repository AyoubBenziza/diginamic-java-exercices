package fr.diginamic.unittests.immobilier.entites;

/**
 * Représente une maison avec toutes ses pièces
 *
 * @author DIGINAMIC
 */
public class Maison {

    /**
     * Pieces : tableau de pièces de la maison
     */
    private Piece[] pieces;

    /**
     * Constructeur
     */
    public Maison() {
        // Initialisation du tableau de pièces
        pieces = new Piece[0];
    }

    /**
     * Ajoute une pièce à la maison
     *
     * @param nvPiece nouvelle pièce à ajouter
     */
    public void ajouterPiece(Piece nvPiece) {

        // On vérifie que la pièce n'est pas nulle
        if (nvPiece == null) {
            throw new IllegalArgumentException("La pièce ne peut pas être nulle");
        }

        // On est obligé d'agrandir le tableau initial de 1 à chaque ajout
        // d'une nouvelle pièce

        // On commence donc par créer un tableau temporaire appelé newTab
        // qui a une taille égale à la longueur du tableau pieces+1
        Piece[] newTab = new Piece[pieces.length + 1];

        // On déverse toutes les pièces du tableau pieces dans newTab
        System.arraycopy(pieces, 0, newTab, 0, pieces.length);

        // On place en dernière position dans le nouveau tableau la nouvelle
        // pièce
        newTab[newTab.length - 1] = nvPiece;

        // Enfin on affecte newTab à pieces
        this.pieces = newTab;
    }

    public int nbPieces() {
        return pieces.length;
    }

    /**
     * Retourne la superficie d'un étage
     *
     * @param choixEtage choix de l'étage
     * @return double
     */
    public double superficieEtage(int choixEtage) {
        if (choixEtage < 0) {
            throw new IllegalArgumentException("L'étage doit être positif");
        }
        double superficieEtage = 0;

        for (Piece piece : pieces) {
            if (choixEtage == piece.getNumEtage()) {
                superficieEtage = superficieEtage + piece.getSuperficie();
            }
        }

        return superficieEtage;
    }

    /**
     * Retourne la superficie totale pour un type de pièce donné
     *
     * @param typePiece type de pièce
     * @return double
     */
    public double superficieTypePiece(String typePiece) {
        if (typePiece == null || typePiece.isEmpty()) {
            throw new IllegalArgumentException("Le type de pièce ne peut pas être null ou vide");
        }
        double superficie = 0;

        for (Piece piece : pieces) {
            if (typePiece.equals(piece.getType())) {
                superficie = superficie + piece.getSuperficie();
            }
        }

        return superficie;
    }

    /**
     * Retourne la surface totale
     *
     * @return double
     */
    public double calculerSurface() {
        double superficieTot = 0;

        for (Piece piece : pieces) {
            superficieTot = superficieTot + piece.getSuperficie();
        }

        return superficieTot;
    }

    /**
     * Getter pour l'attribut pieces
     *
     * @return the pieces
     */
    public Piece[] getPieces() {
        return pieces;
    }

}