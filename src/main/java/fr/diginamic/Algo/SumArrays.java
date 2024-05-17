package fr.diginamic.Algo;

import java.util.Arrays;

public class SumArrays {
    public static void main(String[] args) {
        System.out.println("---- Sum Arrays ----");
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
        int[] sumArray = new int[array1.length];

        // Afficher la somme des tableaux
        System.out.println("-- Afficher la somme des tableaux --");
        for (int i = 0; i < array1.length; i++) {
            sumArray[i] = array1[i] + array2[i];
        }

        System.out.println("La somme des tableaux: " + Arrays.toString(sumArray));
        System.out.println("-----------------------");
    }
}
