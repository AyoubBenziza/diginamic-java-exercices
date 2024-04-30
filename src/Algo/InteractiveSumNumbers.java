package Algo;

import java.util.Scanner;

public class InteractiveSumNumbers {
    public static void main(String[] args) {
        System.out.println("---- Interactive Sum Numbers ----");
        System.out.println("Veuillez saisir un nombre:");
        int nb = new Scanner(System.in).nextInt();
        System.out.println("La somme des chiffres entre 1 et " + nb + " : " + sumBetweenNumbers(1, nb));
        System.out.println("-----------------------");
    }

    public static int sumBetweenNumbers(int a, int b) {
        if (b < a) {
            return b;
        } else {
            int sum = 0;
            for (int i = a; i <= b; i++) {
                sum = sum + i;
            }
            return sum;
        }
    }
}
