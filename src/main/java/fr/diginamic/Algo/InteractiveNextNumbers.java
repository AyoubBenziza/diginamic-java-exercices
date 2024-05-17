package fr.diginamic.Algo;

import java.util.Arrays;
import java.util.Scanner;

public class InteractiveNextNumbers {
    public static void main(String[] args) {
        System.out.println("---- Interactive Next Numbers ----");
        System.out.println("Veuillez saisir un nombre:");
        int nb = new Scanner(System.in).nextInt();
        displayNextNumbers10(nb);
        System.out.println("-----------------------");
    }

    public static void displayNextNumbers10(int nb) {
        int[] numbers = new int[10];
        for (int i = nb; i < nb + 10; i++) {
            numbers[i - nb] = i + 1;
        }
        System.out.println("Les 10 chiffres suivants sont " + Arrays.toString(numbers));
    }
}
