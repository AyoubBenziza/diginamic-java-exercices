package fr.diginamic.Algo;

import java.util.Scanner;

public class InteractiveFibonacci {
    public static void main(String[] args) {
        System.out.println("---- Interactive Fibonacci ----");
        TestFibonacci.test();
        System.out.println("-----------------------");
    }

    public

    static class TestFibonacci {
        public static void test() {
            System.out.println("Veuillez saisir un rang N");
            int nb = new Scanner(System.in).nextInt();
            System.out.println("Résultat Fibonnaci au rang " + nb + " : " + Fibonacci(nb));
        }

        static int Fibonacci(int n) {
            if (n <= 1) {
                return n;
            } else {
                return n + Fibonacci(n - 2);
            }
        }
    }
}
