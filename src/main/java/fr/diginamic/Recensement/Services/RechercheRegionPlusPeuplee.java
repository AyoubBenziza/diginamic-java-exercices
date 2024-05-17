package fr.diginamic.Recensement.Services;

import fr.diginamic.Recensement.Entities.Recensement;

import java.util.Scanner;

public class RechercheRegionPlusPeuplee extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("--- Régions les plus peuplées ---");
        System.out.println("Entrez le nombre de régions à afficher:");
        int nbRegions = scanner.nextInt();
        recensement.getMostPopulatedRegion(nbRegions).forEach(region ->
                System.out.println(region.getNomRegion() + " - " + region.getPopulationTotale())
        );
        System.out.println("--- Régions les plus peuplées ---");
    }
}
