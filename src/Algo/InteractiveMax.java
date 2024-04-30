package Algo;

import java.util.Arrays;
import java.util.Scanner;

import static Algo.SearchMax.searchMax;

public class InteractiveMax {
    public static void main(String[] args) {
        System.out.println("---- Interactive Max ----");
        int[] array = arrayNumbers10();
        System.out.println("Le maximum dans le tableau " + Arrays.toString(array) + " :\n" + searchMax(array));
        System.out.println("-----------------------");
    }

    public static int[] arrayNumbers10() {
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Veuillez saisir un nombre:");
            int nb = new Scanner(System.in).nextInt();
            numbers[i] = nb;
        }
        return numbers;
    }
}
