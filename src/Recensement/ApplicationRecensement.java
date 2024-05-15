package Recensement;

import Recensement.Entities.Recensement;

import Recensement.Services.*;

import java.util.Scanner;

public class ApplicationRecensement {
    public static void main(String[] args) {
        System.out.println("------ TP Recensement ------");
        Recensement recensement = new Recensement();
        recensement.lireFichier("src/Data/recensement.csv");
        recensement.afficherDonnees();
        do {
            menu(recensement);
        } while (recensement != null);
        System.out.println("------ TP Recensement ------");
    }

    public static void menu(Recensement recensement) {
        System.out.println("--- Menu Recensement ---");
        System.out.println("1. Population d'une ville donnée");
        System.out.println("2. Population d'un département donné");
        System.out.println("3. Population d'une région donnée");
        System.out.println("4. Afficher les régions les plus peuplées");
        System.out.println("5. Afficher les départements les plus peuplés");
        System.out.println("6. Afficher les villes les plus peuplées d'un département");
        System.out.println("7. Afficher les villes les plus peuplées d'une région");
        System.out.println("8. Afficher les villes les plus peuplées de France");
        System.out.println("9. Sortir");
        System.out.println("--- Menu Recensement ---");

        System.out.println("Choisissez une option:");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        Scanner scannerInput = new Scanner(System.in);
        switch (option) {
            case 1:
                RecherchePopulationVille recherchePopulationVille = new RecherchePopulationVille();
                recherchePopulationVille.traiter(recensement, scannerInput);
                break;
            case 2:
                RecherchePopulationDepartement recherchePopulationDepartement = new RecherchePopulationDepartement();
                recherchePopulationDepartement.traiter(recensement, scannerInput);
                break;
            case 3:
                RecherchePopulationRegion recherchePopulationRegion = new RecherchePopulationRegion();
                recherchePopulationRegion.traiter(recensement, scannerInput);
                break;
            case 4:
                RechercheRegionPlusPeuplee rechercheRegionPlusPeuplee = new RechercheRegionPlusPeuplee();
                rechercheRegionPlusPeuplee.traiter(recensement, scannerInput);
                break;
            case 5:
                RechercheDepartementPlusPeuplee rechercheDepartementPlusPeuplee = new RechercheDepartementPlusPeuplee();
                rechercheDepartementPlusPeuplee.traiter(recensement, scannerInput);
                break;
            case 6:
                RechercheVillesPlusPeupleeDepartement rechercheVillesPlusPeupleeDepartement = new RechercheVillesPlusPeupleeDepartement();
                rechercheVillesPlusPeupleeDepartement.traiter(recensement, scannerInput);
                break;
            case 7:
                RechercheVillesPlusPeupleeRegion rechercheVillesPlusPeupleeRegion = new RechercheVillesPlusPeupleeRegion();
                rechercheVillesPlusPeupleeRegion.traiter(recensement, scannerInput);
                break;
            case 8:
                RechercheVillesPlusPeuplee rechercheVillesPlusPeuplee = new RechercheVillesPlusPeuplee();
                rechercheVillesPlusPeuplee.traiter(recensement, scannerInput);
                break;
            case 9:
                System.out.println("Sortir");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Option invalide");
                break;
        }
    }
}
