package Recensement.Services;

import Recensement.Entities.Recensement;

import java.util.Scanner;

public class RechercheVillesPlusPeuplee extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("--- Villes les plus peuplées ---");
        System.out.println("Entrez le nombre de villes à afficher:");
        int nbCities = scanner.nextInt();
        recensement.getMostPopulatedCities(nbCities).forEach(city ->
                System.out.println(city.getNomCommune() + " - " + city.getPopulationTotale())
        );
        System.out.println("--- Villes les plus peuplées ---");
    }
}
