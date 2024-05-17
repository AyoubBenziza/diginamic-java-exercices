package fr.diginamic.Recensement.Services;

import fr.diginamic.Recensement.Entities.Recensement;

import java.util.Scanner;

import static fr.diginamic.Recensement.ApplicationRecensement.menu;

public class RecherchePopulationVille extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("--- Population d'une ville donnée ---");
        System.out.println("Entrez le nom de la ville:");
        String nomVille = scanner.next();
        System.out.println("Population de " + nomVille + ": " + recensement.getCityByName(nomVille).getPopulationTotale());
        menu(recensement);
    }
}
