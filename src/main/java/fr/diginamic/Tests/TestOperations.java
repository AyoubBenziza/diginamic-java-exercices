package fr.diginamic.Tests;

import fr.diginamic.Operations.Operations;

public class TestOperations {
    public static void main(String[] args) {
        System.out.println("------- Test Operations ------");
        System.out.println("5 + 5 = " + Operations.calcul(5, 5, '+'));
        System.out.println("5 - 5 = " + Operations.calcul(5, 5, '-'));
        System.out.println("5 * 5 = " + Operations.calcul(5, 5, '*'));
        System.out.println("5 / 5 = " + Operations.calcul(5, 5, '/'));
        System.out.println("------- Test Operations ------");
    }
}
