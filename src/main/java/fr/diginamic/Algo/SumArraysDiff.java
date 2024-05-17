package fr.diginamic.Algo;

import java.util.Arrays;

public class SumArraysDiff {
    public static void main(String[] args) {
        System.out.println("---- Sum Arrays Diff ----");
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18};
        int[] sumArray = Arrays.copyOf(array1, array1.length);

        // Afficher la somme des tableaux de longueur différente
        System.out.println("-- Afficher la somme des tableaux de longueur différente --");
        for (int i = array2.length; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                sumArray[j] = array1[j] + array2[j];
            }
            sumArray[i] = array1[i];
        }

        System.out.println("La somme des tableaux: " + Arrays.toString(sumArray));
        System.out.println("-----------------------");
    }
}
