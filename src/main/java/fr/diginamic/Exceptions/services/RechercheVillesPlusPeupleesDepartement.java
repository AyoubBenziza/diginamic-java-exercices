package fr.diginamic.Exceptions.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.Exceptions.entites.Recensement;
import fr.diginamic.Exceptions.entites.Ville;
import fr.diginamic.Exceptions.services.comparators.EnsemblePopComparateur;
import org.apache.commons.lang3.math.NumberUtils;

/**
 * Cas d'utilisation: affichage des N villes les plus peuplées d'une département
 * donné
 *
 * @author DIGINAMIC
 */
public class RechercheVillesPlusPeupleesDepartement extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) throws IllegalArgumentException, ArrayIndexOutOfBoundsException {

        System.out.println("Veuillez saisir un numéro de département:");
        String nomDept = scanner.nextLine();

        if (recensement.getVilles().stream().noneMatch(ville -> ville.getCodeDepartement().equalsIgnoreCase(nomDept))) {
            throw new ArrayIndexOutOfBoundsException("Le département " + nomDept + " n'existe pas.");
        }


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

        List<Ville> villesDept = new ArrayList<>();

        for (Ville ville : villes) {
            if (ville.getCodeDepartement().equalsIgnoreCase(nomDept)) {
                villesDept.add(ville);
            }
        }

        villesDept.sort(new EnsemblePopComparateur(false));

        if (!villesDept.isEmpty()) {
            System.out.println("Les " + nbVilles + " villes les plus peuplées du département " + nomDept + " :");
            for (int i = 0; i < nbVilles; i++) {
                Ville ville = villesDept.get(i);
                System.out.println(ville.getNom() + " : " + ville.getPopulation() + " habitants.");
            }
        }
    }

}
