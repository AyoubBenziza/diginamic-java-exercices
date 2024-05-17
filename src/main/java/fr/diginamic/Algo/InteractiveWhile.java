package fr.diginamic.Algo;

import java.util.Scanner;

public class InteractiveWhile {
    public static void main(String[] args) {
        System.out.println("---- Interactive While ----");

        System.out.println("Nombre saisi: " + inputNumber10());
        System.out.println("-----------------------");
    }

    // Demander un nombre à l’utilisateur qui doit être obligatoirement compris entre 1 et 10
    public static int inputNumber10() {
        int nb = 0;
        do {
            System.out.println("Veuillez saisir un nombre entre 1 et 10");
            nb = new Scanner(System.in).nextInt();
        } while (nb < 1 || nb > 10);

        return nb;
    }
}
