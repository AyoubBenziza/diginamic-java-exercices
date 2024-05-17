package fr.diginamic.Algo;

import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        System.out.println("---- Rotate ----");
        int[] array = {6, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, 9};
        System.out.println("Avant Permutation: " + Arrays.toString(array));

        int permut = array[array.length - 1];
        // Permuter les éléments d'un index à droite
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = permut;


        System.out.println("Après Permutation: " + Arrays.toString(array));
        System.out.println("-----------------------");
    }
}
