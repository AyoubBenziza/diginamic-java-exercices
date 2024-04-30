package Algo;

public class DisplayPartial {
    public static void main(String[] args) {
        System.out.println("---- Display Partial ----");
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Afficher que les éléments du tableau supérieurs à 3
        System.out.println("-- Afficher que les éléments du tableau d'entiers supérieurs à 3 --");
        int i = 0;
        while (i < array.length) {
            if (array[i] > 3) {
                System.out.println(array[i]);
            }
            i++;
        }
        System.out.println("-----------------------");

        // Afficher que les éléments pairs du tableau
        System.out.println("-- Afficher que les éléments pairs du tableau --");
        int j = 0;
        while (j < array.length) {
            if (array[j] % 2 == 0) {
                System.out.println(array[j]);
            }
            j++;
        }
        System.out.println("-----------------------");

        // Afficher que les éléments d'index pair du tableau
        System.out.println("-- Afficher que les éléments d'index pair du tableau --");
        int k = 0;
        while (k < array.length) {
            if (k % 2 == 0) {
                System.out.println(array[k]);
            }
            k++;
        }
        System.out.println("-----------------------");

        // Afficher que les éléments impairs du tableau
        System.out.println("-- Afficher que les éléments impairs du tableau --");
        int l = 0;
        while (l < array.length) {
            if (array[l] % 2 == 1) {
                System.out.println(array[l]);
            }
            l++;
        }
        System.out.println("-----------------------");
    }
}
