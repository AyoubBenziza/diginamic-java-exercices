package fr.diginamic.Algo;

import java.util.Arrays;

public class DisplayReverse {
    public static void main(String[] args) {
        System.out.println("---- Display Reverse ----");

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Afficher l'ensemble des éléments du tableau
        System.out.println("-- Afficher l'ensemble des éléments du tableau --");
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
        // or
        for (int j : array) {
            System.out.println(j);
        }
        System.out.println("-----------------------");

        // Afficher l'ensemble des éléments du tableau dans l'ordre inverse
        System.out.println("-- Afficher l'ensemble des éléments du tableau dans l'ordre inverse --");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
        System.out.println("-----------------------");

        // Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy
        System.out.println("-- Copier l'ensemble des éléments du tableau array dans arrayCopy --");
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        System.out.println("arrayCopy: " + Arrays.toString(arrayCopy));
        System.out.println("-----------------------");
    }
}
