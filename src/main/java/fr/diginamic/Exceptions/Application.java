package fr.diginamic.Exceptions;

import java.util.Objects;
import java.util.Scanner;

import fr.diginamic.Exceptions.entites.Recensement;
import fr.diginamic.Exceptions.services.RechercheDepartementsPlusPeuplees;
import fr.diginamic.Exceptions.services.RecherchePopulationBorneService;
import fr.diginamic.Exceptions.services.RecherchePopulationDepartementService;
import fr.diginamic.Exceptions.services.RecherchePopulationRegionService;
import fr.diginamic.Exceptions.services.RecherchePopulationVilleService;
import fr.diginamic.Exceptions.services.RechercheRegionsPlusPeuplees;
import fr.diginamic.Exceptions.services.RechercheVillesPlusPeupleesDepartement;
import fr.diginamic.Exceptions.services.RechercheVillesPlusPeupleesFrance;
import fr.diginamic.Exceptions.services.RechercheVillesPlusPeupleesRegion;
import fr.diginamic.Exceptions.utils.RecensementUtils;

/**
 * Application de traitement des données de recensement de population
 */
public class Application {

    /**
     * Point d'entrée
     *
     * @param args arguments (non utilisés ici)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filePath = Objects.requireNonNull(ClassLoader.getSystemClassLoader().getResource("recensement.csv")).getFile();
        Recensement recensement = RecensementUtils.lire(filePath);

        if (recensement == null) {
            System.out.println("L'application doit s'arrétée en raison d'une erreur d'exécution.");
            System.exit(-1);
        }

        // Menu
        int choix;
        do {

            // Affichage du menu
            afficherMenu();

            // Poser une question à l'utilisateur
            String choixMenu = scanner.nextLine();

            // Conversion du choix utilisateur en int
            choix = Integer.parseInt(choixMenu);

            // On exécute l'option correspondant au choix de l'utilisateur
            switch (choix) {
                case 1:
                    try {
                        RecherchePopulationVilleService rechercheVille = new RecherchePopulationVilleService();
                        rechercheVille.traiter(recensement, scanner);
                    } catch (Exception e) {
                        System.err.println("Erreur: " + e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        RecherchePopulationDepartementService rechercheDept = new RecherchePopulationDepartementService();
                        rechercheDept.traiter(recensement, scanner);
                    } catch (Exception e) {
                        System.err.println("Erreur: " + e.getMessage());
                    }
                    break;
                case 3:
                    RecherchePopulationRegionService rechercheRegion = new RecherchePopulationRegionService();
                    rechercheRegion.traiter(recensement, scanner);
                    break;
                case 4:
                    try {
                        RecherchePopulationBorneService recherchePopBorne = new RecherchePopulationBorneService();
                        recherchePopBorne.traiter(recensement, scanner);
                    } catch (Exception e) {
                        System.err.println("Erreur: " + e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        RechercheVillesPlusPeupleesDepartement rechercheVillesPlusPeupleesDepartement = new RechercheVillesPlusPeupleesDepartement();
                        rechercheVillesPlusPeupleesDepartement.traiter(recensement, scanner);
                    } catch (Exception e) {
                        System.err.println("Erreur: " + e.getMessage());
                    }
                    break;
                case 6:
                    try {
                        RechercheVillesPlusPeupleesRegion rechercheVillesPlusPeupleesRegion = new RechercheVillesPlusPeupleesRegion();
                        rechercheVillesPlusPeupleesRegion.traiter(recensement, scanner);
                    } catch (Exception e) {
                        System.err.println("Erreur: " + e.getMessage());
                    }
                    break;
                case 7:
                    try {
                        RechercheDepartementsPlusPeuplees rechercherDepartementsPlusPeuplees = new RechercheDepartementsPlusPeuplees();
                        rechercherDepartementsPlusPeuplees.traiter(recensement, scanner);
                    } catch (Exception e) {
                        System.err.println("Erreur: " + e.getMessage());
                    }
                    break;
                case 8:
                    try {
                        RechercheRegionsPlusPeuplees rechercheRegionsPlusPeuplees = new RechercheRegionsPlusPeuplees();
                        rechercheRegionsPlusPeuplees.traiter(recensement, scanner);
                    } catch (Exception e) {
                        System.err.println("Erreur: " + e.getMessage());
                    }
                    break;
                case 9:
                    try {
                        RechercheVillesPlusPeupleesFrance rechercheVillesPlusPeupleesFrance = new RechercheVillesPlusPeupleesFrance();
                        rechercheVillesPlusPeupleesFrance.traiter(recensement, scanner);
                    } catch (Exception e) {
                        System.err.println("Erreur: " + e.getMessage());
                    }
                    break;
            }

        } while (choix != 99);

        scanner.close();

    }

    /**
     * Affichage du menu
     */
    private static void afficherMenu() {
        System.out.println("***** Recensement population *****");
        System.out.println("1. Rechercher la population d'une ville");
        System.out.println("2. Rechercher la population d'un département");
        System.out.println("3. Rechercher la population d'une région");
        System.out.println("4. Rechercher la population des villes d'un dept entre min et max");
        System.out.println("5. Rechercher les N plus grandes villes d'un département.");
        System.out.println("6. Rechercher les N plus grandes villes d'une région.");
        System.out.println("7. Rechercher les N plus grands départements de France.");
        System.out.println("8. Rechercher les N plus grandes régions de France.");
        System.out.println("9. Rechercher les N plus grandes villes de France.");
        System.out.println("99. Sortir");
    }
}
