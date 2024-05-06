package Tests;

import Automates.GameOfTheLife;

import java.util.Scanner;

public class TestGameOfTheLife {
    public static void main(String[] args) {
        config();
    }

    public static void config() {
        System.out.println("Choose a model:");
        System.out.println("1. Model 1");
        System.out.println("2. Model 2");
        System.out.println("3. Model 3");
        // Read input
        int input = new Scanner(System.in).nextInt();
        switch (input) {
            case 1:
                model();
                break;
            case 2:
                model2();
                break;
            case 3:
                model3();
                break;
            default:
                System.out.println("Invalid input");
        }
    }

    public static void model() {
        GameOfTheLife game = new GameOfTheLife(5);
        game.setCell(1, 2);
        game.setCell(2, 2);
        game.setCell(3, 2);
        game.setCell(2, 1);
        game.printGrid();
        game.nextGeneration();
        game.printGrid();
        game.nextGeneration();
        game.printGrid();
        game.nextGeneration();
        game.printGrid();
    }

    public static void model2() {
        GameOfTheLife game = new GameOfTheLife(5);
        game.setCell(1, 1);
        game.setCell(2, 2);
        game.setCell(3, 3);
        game.printGrid();
        game.nextGeneration();
        game.printGrid();
        game.nextGeneration();
        game.printGrid();
        game.nextGeneration();
        game.printGrid();
    }

    public static void model3() {
        GameOfTheLife game = new GameOfTheLife(5);
        game.setCell(1, 1);
        game.setCell(2, 2);
        game.setCell(3, 3);
        game.setCell(2, 3);
        game.setCell(3, 2);
        game.printGrid();
        game.nextGeneration();
        game.printGrid();
        game.nextGeneration();
        game.printGrid();
        game.nextGeneration();
        game.printGrid();
    }
}
