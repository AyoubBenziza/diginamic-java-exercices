package fr.diginamic.Algo;

public class FirstLast {
    public static void main(String[] args) {
        System.out.println("---- First Last ----");
        int[] array = {6, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, 6};
        boolean result = false;

        // true si le tableau a au moins 1 élément et si le premier élément et dernier élément sont égaux
        result = (array.length >= 1 && array[0] == array[array.length - 1]);

        System.out.println(result);
        System.out.println("-----------------------");
    }
}
