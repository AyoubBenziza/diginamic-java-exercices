package Algo;

public class CalculAverage {
    public static void main(String[] args) {
        System.out.println("---- Calcul Average ----");
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        // Afficher l'élément le plus grand du tableau
        System.out.println("-- Afficher la moyenne du tableau --");
        int sum = 0;
        for (int j : array) {
            sum = sum + j;
        }
        int average = sum / array.length;
        System.out.println("La moyenne du tableau array: " + average);
        System.out.println("-----------------------");
    }
}
