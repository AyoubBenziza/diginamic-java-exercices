package fr.diginamic.Algo;

public class FirstLast6 {
    public static void main(String[] args) {
        System.out.println("---- First Last 6 ----");
        int[] array = {6, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        boolean result = false;

        // true si le tableau a au moins 1 élément et si le premier élément ou le dernier élément vaut 6
        result = (array.length >= 1 && (array[0] == 6 || array[array.length - 1] == 6));

        System.out.println(result);
        System.out.println("-----------------------");
    }
}
