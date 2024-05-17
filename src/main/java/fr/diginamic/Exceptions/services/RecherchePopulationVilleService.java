package fr.diginamic.Exceptions.services;

import java.util.List;
import java.util.Scanner;

import fr.diginamic.Exceptions.entites.Recensement;
import fr.diginamic.Exceptions.entites.Ville;

/**
 * Recherche et affichage de la population d'une ville
 *
 * @author DIGINAMIC
 */
public class RecherchePopulationVilleService extends MenuService {

    @Override
    public void traiter(Recensement rec, Scanner scanner) throws IllegalArgumentException, NullPointerException, IllegalStateException {

        System.out.println("Quel est le nom de la ville recherchée ? ");
        String choix = scanner.nextLine();

        if (choix.isEmpty()) {
            throw new NullPointerException("Le nom de la ville est obligatoire.");
        }

        if (choix.length() < 3) {
            throw new IllegalArgumentException("Le nom de la ville doit contenir au moins 3 caractères.");
        }

        if (choix.matches(".*\\d.*")) {
            throw new IllegalStateException("Le nom de la ville ne doit pas contenir de chiffres.");
        }


        List<Ville> villes = rec.getVilles();
        boolean cityFound = false;
        for (Ville ville : villes) {
            if (ville.getNom().equalsIgnoreCase(choix)
                    || ville.getNom().toLowerCase().startsWith(choix.toLowerCase())) {
                cityFound = true;
                System.out.println(ville);
            }
        }

        // Existe
        if (!cityFound) {
            throw new ArrayIndexOutOfBoundsException("La ville " + choix + " n'existe pas.");
        }
    }

}
