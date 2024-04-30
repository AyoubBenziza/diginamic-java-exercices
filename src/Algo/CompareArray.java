package Algo;

public class CompareArray {
    public static void main(String[] args) {
        System.out.println("---- Compare Array ----");

        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
        int occ = 0;

        // Afficher le nombres d'occurences entre les 2 tableaux
        System.out.println("-- Afficher le nombres d'occurences entre les 2 tableaux --");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    occ++;
                }
            }
        }
        System.out.println("Le nombre d'occurence est: " + occ);

        System.out.println("-----------------------");
    }
}
