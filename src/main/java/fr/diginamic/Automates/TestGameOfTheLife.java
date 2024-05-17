package fr.diginamic.Automates;

import java.util.Scanner;

public class TestGameOfTheLife {
    public static boolean running = true;

    public static void main(String[] args) throws InterruptedException {
        do {
            config();
        } while (running);
        System.exit(0);
    }

    public static void config() throws InterruptedException {
        System.out.println("Choose a model:");
        System.out.println("1. Model 1");
        System.out.println("2. Model 2");
        System.out.println("3. Model 3");
        System.out.println("4. Moving Model");
        System.out.println("5. Exit");

        // Read input
        int input = new Scanner(System.in).nextInt();
        switch (input) {
            case 1:
                Models.model1();
                break;
            case 2:
                Models.model2();
                break;
            case 3:
                Models.model3();
                break;
            case 4:
                Models.movingModel();
                break;
            case 5:
                running = false;
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
