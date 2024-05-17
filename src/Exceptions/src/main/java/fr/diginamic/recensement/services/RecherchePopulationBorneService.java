package fr.diginamic.recensement.services;

import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;
import org.apache.commons.lang3.math.NumberUtils;

/**
 * Recherche et affichage de toutes les villes d'un département dont la
 * population est comprise entre une valeur min et une valeur max renseignées
 * par l'utilisateur.
 * 
 * @author DIGINAMIC
 *
 */
public class RecherchePopulationBorneService extends MenuService {

	@Override
	public void traiter(Recensement rec, Scanner scanner) throws IllegalArgumentException, ArrayIndexOutOfBoundsException{

		System.out.println("Quel est le code du département recherché ? ");
		String choix = scanner.nextLine();

		if (choix.length() < 2) {
			throw new IllegalArgumentException("Le code du département doit être composé minimum de 2 caractères.");
		}

		// On vérifie si le département existe
		if(rec.getVilles().stream().noneMatch(ville -> ville.getCodeDepartement().equalsIgnoreCase(choix))){
			throw new ArrayIndexOutOfBoundsException("Le département " + choix + " n'existe pas.");
		}

		System.out.println("Choississez une population minimum (en milliers d'habitants): ");
		String saisieMin = scanner.nextLine();

		if (!NumberUtils.isDigits(saisieMin)) {
			throw new NumberFormatException("La population minimum doit être un entier.");
		}
		
		System.out.println("Choississez une population maximum (en milliers d'habitants): ");
		String saisieMax = scanner.nextLine();

		if (!NumberUtils.isDigits(saisieMax)) {
			throw new NumberFormatException("La population max doit être un entier.");
		}

		if(Integer.parseInt(saisieMin) > Integer.parseInt(saisieMax)){
			throw new IllegalArgumentException("La population minimum doit être inférieure à la population maximum.");
		}

		int min = Integer.parseInt(saisieMin) * 1000;
		int max = Integer.parseInt(saisieMax) * 1000;
		
		List<Ville> villes = rec.getVilles();
		for (Ville ville : villes) {
			if (ville.getCodeDepartement().equalsIgnoreCase(choix)) {
				if (ville.getPopulation() >= min && ville.getPopulation() <= max) {
					System.out.println(ville);
				}
			}
		}
	}

}
