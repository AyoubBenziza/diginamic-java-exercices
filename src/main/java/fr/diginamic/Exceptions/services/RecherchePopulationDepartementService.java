package fr.diginamic.Exceptions.services;

import java.util.List;
import java.util.Scanner;

import fr.diginamic.Exceptions.entites.Recensement;
import fr.diginamic.Exceptions.entites.Ville;

/**
 * Recherche et affichage de la population d'un département
 *
 * @author DIGINAMIC
 */
public class RecherchePopulationDepartementService extends MenuService {

    @Override
    public void traiter(Recensement rec, Scanner scanner) throws IllegalArgumentException {

        System.out.println("Quel est le code du département recherché ? ");
        String choix = scanner.nextLine();

        if (choix.length() < 2) {
            throw new IllegalArgumentException("Le code du département doit être composé minimum de 2 caractères.");
        }

        List<Ville> villes = rec.getVilles();
        int somme = 0;
        for (Ville ville : villes) {
            if (ville.getCodeDepartement().equalsIgnoreCase(choix)) {
                somme += ville.getPopulation();
            }
        }
        if (somme > 0) {
            System.out.println("Population du département " + choix + " : " + somme);
        } else {
            System.out.println("Département " + choix + " non trouvé.");
        }
    }

}
