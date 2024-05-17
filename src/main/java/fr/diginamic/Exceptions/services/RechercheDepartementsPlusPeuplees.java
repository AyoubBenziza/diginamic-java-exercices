package fr.diginamic.Exceptions.services;

import java.util.*;

import fr.diginamic.Exceptions.entites.Departement;
import fr.diginamic.Exceptions.entites.Recensement;
import fr.diginamic.Exceptions.entites.Ville;
import fr.diginamic.Exceptions.services.comparators.EnsemblePopComparateur;
import org.apache.commons.lang3.math.NumberUtils;

/**
 * Affichage des N départements les plus peuplés
 *
 * @author DIGINAMIC
 */
public class RechercheDepartementsPlusPeuplees extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) throws IllegalArgumentException {

        System.out.println("Veuillez saisir un nombre de départements:");
        String nbDeptsStr = scanner.nextLine();
        if (!NumberUtils.isDigits(nbDeptsStr)) {
            throw new NumberFormatException("Le nombre de départements doit être un entier.");
        }

        if (Integer.parseInt(nbDeptsStr) == 0) {
            throw new IllegalArgumentException("Le nombre de départements doit être supérieur à 0.");
        }

        int nbDepts = Integer.parseInt(nbDeptsStr);

        List<Ville> villes = recensement.getVilles();

        Map<String, Departement> mapDepts = new HashMap<>();

        for (Ville ville : villes) {

            Departement departement = mapDepts.get(ville.getCodeDepartement());
            if (departement == null) {
                departement = new Departement(ville.getCodeDepartement());
                mapDepts.put(ville.getCodeDepartement(), departement);
            }
            departement.addVille(ville);
        }

        if (nbDepts > mapDepts.size()) {
            throw new IllegalArgumentException("Le nombre de départements ne peut pas être supérieur au nombre de départements.");
        }

        List<Departement> departements = new ArrayList<>(mapDepts.values());

        departements.sort(new EnsemblePopComparateur(false));

        for (int i = 0; i < nbDepts; i++) {
            Departement departement = departements.get(i);
            System.out.println(
                    "Département " + departement.getCode() + " : " + departement.getPopulation() + " habitants.");
        }

    }

}
