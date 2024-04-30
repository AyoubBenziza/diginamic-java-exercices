package Algo;

import java.util.Arrays;

public class ReverseContent {
    public static void main(String[] args) {
        System.out.println("---- Reverse Content ----");

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Copier l'ensemble des éléments du tableau array dans arrayCopy dans l'ordre inverse
        System.out.println("-- Copier l'ensemble des éléments du tableau array dans arrayCopy dans l'ordre inverse --");
        int length = array.length;
        int[] arrayCopy = Arrays.copyOf(array, length);

        for (int i = 0; i < length; i++) {
            arrayCopy[i] = array[length - 1 - i];
        }
        System.out.println("array: " + Arrays.toString(array));
        System.out.println("arrayCopy: " + Arrays.toString(arrayCopy));
        System.out.println("-----------------------");
    }
}
