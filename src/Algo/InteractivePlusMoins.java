package Algo;

import java.util.Random;
import java.util.Scanner;

public class InteractivePlusMoins {
    public static void main(String[] args) {
        System.out.println("---- Interactive PlusMoins ----");
        int result = guessNumber();
        System.out.println("Vous avez le juste PRIX après " + result + " tentatives.");
        System.out.println("-----------------------");
    }

    public static int guessNumber() {
        int random = new Random().nextInt(100 - 1 + 1) + 1;
        int essais = 0;
        int input = 0;
        do {
            System.out.println("Veuillez saisir un nombre:");
            input = new Scanner(System.in).nextInt();
            if (input < random) {
                System.out.println("C'est PLUS");
            }
            if (input > random) {
                System.out.println("C'est MOINS");
            }
            essais++;
        } while (essais < 1 || input != random);
        return essais;
    }
}
