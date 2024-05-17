package fr.diginamic.Recensement.Services;

import fr.diginamic.Recensement.Entities.Recensement;

import java.util.Scanner;

import static fr.diginamic.Recensement.ApplicationRecensement.menu;

public class RecherchePopulationDepartement extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("--- Population d'un département donné ---");
        System.out.println("Entrez le code du département:");
        String codeDepartement = scanner.next();
        System.out.println("Population du département " + codeDepartement + ": " + recensement.getPopulationByDepartement(codeDepartement));
        menu(recensement);
    }
}
