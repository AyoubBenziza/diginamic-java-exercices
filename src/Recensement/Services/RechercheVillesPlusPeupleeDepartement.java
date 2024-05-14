package Recensement.Services;

import Recensement.Entities.Recensement;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import static Recensement.ApplicationRecensement.menu;

public class RechercheVillesPlusPeupleeDepartement extends MenuService {
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("--- Villes plus peuplées par Département ---");
        System.out.println("Entrez le département souhaité:");
        String departement = scanner.nextLine();
        System.out.println("Entrez le nombre de villes à afficher:");
        int nbCities = scanner.nextInt();
        AtomicInteger position = new AtomicInteger(1);
        System.out.println("Les " + nbCities + " villes les plus peuplées du département " + departement + ":");
        recensement.getMostPopulatedCitiesByDepartment(departement, nbCities).forEach(city -> {
            System.out.println(position.get() + ": " + city.getNomCommune() + " - " + city.getPopulationTotale());
            position.getAndIncrement();
        });
        System.out.println("--- Villes plus peuplées par Département ---");
        menu(recensement);
    }
}
