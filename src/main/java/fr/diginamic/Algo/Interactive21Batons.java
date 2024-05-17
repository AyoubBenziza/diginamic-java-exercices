package fr.diginamic.Algo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Interactive21Batons {
    public static void main(String[] args) {
        System.out.println("---- Interactive 21 Batons Game ----");
        game();
        System.out.println("-----------------------");
    }

    static void game() {
        System.out.println("-- Jeu des Bâtons --");
        int[] batons = new int[13];
        do {
            int inputPlayer = saisieBatons();
            batons = Arrays.copyOf(batons, batons.length - inputPlayer);
            if (batons.length <= 1) {
                System.out.println("Gagné");
                break;
            } else {
                int random = new Random().nextInt(3 - 1 + 1) + 1;
                batons = Arrays.copyOf(batons, batons.length - random);
                if (batons.length <= 1) {
                    System.out.println("Perdu");
                    break;
                }
            }
        } while (batons.length > 1);
    }

    static int saisieBatons() {
        int nb = 0;
        do {
            System.out.println("Veuillez saisir le nombre de batons entre 1 et 3");
            nb = new Scanner(System.in).nextInt();
        } while (nb < 1 || nb > 3);

        return nb;
    }
}
