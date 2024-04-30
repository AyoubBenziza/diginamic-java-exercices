package Algo;

import java.util.Arrays;
import java.util.Scanner;

public class InteractiveStockNumbers {
    public static void main(String[] args) {
        System.out.println("---- Interactive Stock Numbers ----");
        menu();
        System.out.println("-----------------------");
    }

    static void menu() {
        int input = 0;
        int[] numbers = new int[0];

        do {
            System.out.println("-- Menu --");
            System.out.println("1: Ajouter un nombre au tableau");
            System.out.println("2: Afficher le tableau");
            System.out.println("3: Quitter");
            System.out.println("----------");
            System.out.println("Veuillez saisir une option");
            input = new Scanner(System.in).nextInt();
            if (input == 1) {
                System.out.println("Veuillez saisir un nombre à ajouter");
                int nb = new Scanner(System.in).nextInt();
                numbers = Arrays.copyOf(numbers, numbers.length + 1);
                numbers[numbers.length - 1] = nb;
            }
            if (input == 2) {
                System.out.println("Affichage du tableau: " + Arrays.toString(numbers));
            }

        } while (input != 3);
    }
}
