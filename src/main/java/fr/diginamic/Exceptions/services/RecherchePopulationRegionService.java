package fr.diginamic.Exceptions.services;

import java.util.List;
import java.util.Scanner;

import fr.diginamic.Exceptions.entites.Recensement;
import fr.diginamic.Exceptions.entites.Ville;

/**
 * Recherche et affichage de la population d'une région
 *
 * @author DIGINAMIC
 */
public class RecherchePopulationRegionService extends MenuService {

    @Override
    public void traiter(Recensement rec, Scanner scanner) throws IllegalArgumentException {

        System.out.println("Quel est le nom (ou le début de nom) de la région recherchée ? ");
        String choix = scanner.nextLine();

        if (choix.length() < 3) {
            throw new IllegalArgumentException("Le nom de la région doit contenir au moins 3 caractères.");
        }

        if (choix.length() > 50) {
            throw new IllegalArgumentException("Le nom de la région doit contenir au maximum 50 caractères.");
        }

        List<Ville> villes = rec.getVilles();
        int somme = 0;
        String nom = null;
        for (Ville ville : villes) {
            if (ville.getNomRegion().equalsIgnoreCase(choix)
                    || ville.getCodeRegion().equalsIgnoreCase(choix)) {
                somme += ville.getPopulation();
                nom = ville.getNomRegion();
            }
        }
        if (somme > 0) {
            System.out.println("Population de la région " + nom + " : " + somme);
        } else {
            System.out.println("Région " + choix + " non trouvée.");
        }
    }

}
