package Algo;

public class DisplaySuite {
    public static void main(String[] args) {
        System.out.println("---- Display Suite ----");

        // For

        // Afficher tous les nombres de 1 à 10
        System.out.println("-- Nombres de 1 à 10 --");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("-----------------------");

        // Afficher tous les nombres pairs de 0 à 10 inclus
        System.out.println("-- Nombres Pairs de 0 à 10 --");
//        for (int i = 0; i <= 10; i = i + 2) {
//            System.out.println(i);
//        }
        // or
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("-----------------------");

        // Afficher tous les nombres impairs de 0 à 9 inclus
        System.out.println("-- Nombres impairs de 0 à 9 --");
        for (int i = 0; i <= 9; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        System.out.println("-----------------------");

        // While

        // Afficher tous les nombres de 1 à 10
        System.out.println("-- Nombres de 1 à 10 --");
        int j = 0;
        while (j <= 10) {
            System.out.println(j);
            j++;
        }
        System.out.println("-----------------------");

        // Afficher tous les nombres pairs de 0 à 10 inclus
        System.out.println("-- Nombres Pairs de 0 à 10 --");
        int k = 0;
        while (k <= 10) {
            if (k % 2 == 0) {
                System.out.println(k);
            }
            k++;
        }
        System.out.println("-----------------------");

        // Afficher tous les nombres impairs de 0 à 9 inclus
        System.out.println("-- Nombres impairs de 0 à 9 --");
        int l = 0;
        while (l <= 9) {
            if (l % 2 == 1) {
                System.out.println(l);
            }
            l++;
        }
        System.out.println("-----------------------");
    }
}
