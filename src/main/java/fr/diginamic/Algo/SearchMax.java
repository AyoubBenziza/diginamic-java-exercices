package fr.diginamic.Algo;

public class SearchMax {
    public static void main(String[] args) {
        System.out.println("---- Search Max ----");
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        System.out.println("Le maximum du tableau array: " + searchMax(array));
        System.out.println("-----------------------");
    }

    // Afficher l'élément le plus grand du tableau
    public static int searchMax(int[] array) {
        int max = Integer.MIN_VALUE;
        System.out.println("-- Afficher l'élément le plus grand du tableau --");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
