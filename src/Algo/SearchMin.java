package Algo;

public class SearchMin {
    public static void main(String[] args) {
        System.out.println("---- Search Min ----");
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int min = Integer.MAX_VALUE;
        // Afficher l'élément le plus grand du tableau
        System.out.println("-- Afficher l'élément le plus petit du tableau --");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Le minimum du tableau array: " + min);
        System.out.println("-----------------------");
    }
}
