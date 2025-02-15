package fr.diginamic.Recensement.Services;

import fr.diginamic.Recensement.Entities.Recensement;

import java.util.Scanner;

import static fr.diginamic.Recensement.ApplicationRecensement.menu;

public class RecherchePopulationRegion extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("--- Population d'une région donnée ---");
        System.out.println("Entrez le nom de la région:");
        String nomRegion = scanner.next();
        System.out.println("Population de " + nomRegion + ": " + recensement.getPopulationByRegion(nomRegion));
        menu(recensement);
    }
}
