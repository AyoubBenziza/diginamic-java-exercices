package Recensement.Services;

import Recensement.Entities.Recensement;

import java.util.Scanner;

public class RechercheDepartementPlusPeuplee extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("--- Départements les plus peuplées ---");
        System.out.println("Entrez le nombre de départements à afficher:");
        int nbDepartements = scanner.nextInt();
        recensement.getMostPopulatedDepartments(nbDepartements).forEach(departement ->
                System.out.println(departement.getCodeDepartement() + " - " + departement.getPopulationTotale())
        );
        System.out.println("--- Départements les plus peuplées ---");
    }
}
