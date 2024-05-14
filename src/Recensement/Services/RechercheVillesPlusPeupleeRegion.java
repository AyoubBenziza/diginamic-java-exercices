package Recensement.Services;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import Recensement.Entities.Recensement;

import static Recensement.ApplicationRecensement.menu;

public class RechercheVillesPlusPeupleeRegion extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("--- Villes plus peuplées par Région ---");
        System.out.println("Entrez la région souhaitée:");
        String region = scanner.nextLine();
        System.out.println("Entrez le nombre de villes à afficher:");
        int nbCities = scanner.nextInt();
        AtomicInteger position = new AtomicInteger(1);
        System.out.println("Les " + nbCities + " villes les plus peuplées de la région " + region + ":");
        recensement.getMostPopulatedCitiesByRegion(region, nbCities).forEach(city -> {
            System.out.println(position.get() + ": " + city.getNomCommune() + " - " + city.getPopulationTotale());
            position.getAndIncrement();
        });
        System.out.println("--- Villes plus peuplées par Région ---");
        menu(recensement);
    }
}
