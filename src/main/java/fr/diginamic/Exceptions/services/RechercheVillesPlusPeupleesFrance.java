package fr.diginamic.Exceptions.services;

import java.util.List;
import java.util.Scanner;

import fr.diginamic.Exceptions.entites.Recensement;
import fr.diginamic.Exceptions.entites.Ville;
import fr.diginamic.Exceptions.services.comparators.EnsemblePopComparateur;
import org.apache.commons.lang3.math.NumberUtils;

/**
 * Cas d'utilisation: affichage des N villes les plus peuplées de France
 *
 * @author DIGINAMIC
 */
public class RechercheVillesPlusPeupleesFrance extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) throws IllegalArgumentException {

        System.out.println("Veuillez saisir un nombre de villes:");
        String nbVillesStr = scanner.nextLine();

        if (!NumberUtils.isDigits(nbVillesStr)) {
            throw new NumberFormatException("Le nombre de villes doit être un entier.");
        }

        int nbVilles = Integer.parseInt(nbVillesStr);

        List<Ville> villes = recensement.getVilles();

        if (nbVilles < 1 || nbVilles > villes.size()) {
            throw new IllegalArgumentException("Le nombre de villes doit être compris entre 1 et " + villes.size() + ".");
        }

        System.out.println("Les " + nbVilles + " villes les plus peuplées de France sont :");
        villes.sort(new EnsemblePopComparateur(false));
        for (int i = 0; i < nbVilles; i++) {
            Ville ville = villes.get(i);
            System.out.println(ville.getNom() + " : " + ville.getPopulation() + " habitants.");
        }
    }

}
