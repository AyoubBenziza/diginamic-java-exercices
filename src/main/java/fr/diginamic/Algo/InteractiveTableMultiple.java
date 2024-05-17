package fr.diginamic.Algo;

import static fr.diginamic.Algo.InteractiveWhile.inputNumber10;

public class InteractiveTableMultiple {
    public static void main(String[] args) {
        System.out.println("---- Interactive Table Multiple ----");
        int nb = inputNumber10();
        displayTableMultiple(nb);
        System.out.println("-----------------------");
    }

    public static void displayTableMultiple(int nb) {
        System.out.println("Table de Multiplication de " + nb);
        for (int i = 0; i <= 10; i++) {
            System.out.println(nb + " * " + i + " = " + nb * i);
        }
    }
}
