package fr.diginamic.Exceptions.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.Exceptions.entites.Recensement;
import fr.diginamic.Exceptions.entites.Ville;
import fr.diginamic.Exceptions.services.comparators.EnsemblePopComparateur;
import org.apache.commons.lang3.math.NumberUtils;

/**
 * Cas d'utilisation: affichage des N villes les plus peuplées d'une région
 * donnée
 *
 * @author DIGINAMIC
 */
public class RechercheVillesPlusPeupleesRegion extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) throws IllegalArgumentException, ArrayIndexOutOfBoundsException {

        System.out.println("Veuillez saisir un nom de région:");
        String nomRegion = scanner.nextLine();

        if (nomRegion.isEmpty()) {
            throw new NumberFormatException("Le nom de la région ne doit pas être vide.");
        }

        if (recensement.getVilles().stream().noneMatch(ville -> ville.getNomRegion().equalsIgnoreCase(nomRegion))) {
            throw new ArrayIndexOutOfBoundsException("La région " + nomRegion + " n'existe pas.");
        }

        if (nomRegion.length() < 2) {
            throw new IllegalArgumentException("Le nom de la région doit contenir au moins 2 caractères.");
        }

        if (nomRegion.length() > 50) {
            throw new IllegalArgumentException("Le nom de la région doit contenir au maximum 50 caractères.");
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

        List<Ville> villesRegions = new ArrayList<>();
        for (Ville ville : villes) {
            if (ville.getNomRegion().toLowerCase().startsWith(nomRegion.toLowerCase())) {
                villesRegions.add(ville);
            }
        }

        villesRegions.sort(new EnsemblePopComparateur(false));
        System.out.println("Les " + nbVilles + " villes les plus peuplées de la région " + nomRegion + " sont :");
        if (!villesRegions.isEmpty()) {
            for (int i = 0; i < nbVilles; i++) {
                Ville ville = villesRegions.get(i);
                System.out.println(ville.getNom() + " : " + ville.getPopulation() + " habitants.");
            }
        }

    }

}
