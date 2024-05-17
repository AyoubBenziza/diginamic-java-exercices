package fr.diginamic.Algo;

public class CompareArray {
    public static void main(String[] args) {
        System.out.println("---- Compare Lessons.Array ----");

        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
        int occ = 0;

        // Afficher le nombres d'occurences entre les 2 tableaux
        System.out.println("-- Afficher le nombres d'occurences entre les 2 tableaux --");
        for (int k : array1) {
            for (int i : array2) {
                if (k == i) {
                    occ++;
                }
            }
        }
        System.out.println("Le nombre d'occurence est: " + occ);

        System.out.println("-----------------------");
    }
}
