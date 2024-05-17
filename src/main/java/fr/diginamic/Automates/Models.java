package fr.diginamic.Automates;

import static java.lang.Thread.sleep;

public class Models {

    public static void model1() throws InterruptedException {
        int width = 10;
        int height = 5;
        GameOfTheLife game = new GameOfTheLife(width, height);
        game.setCell(1, 2);
        game.setCell(2, 2);
        game.setCell(3, 2);
        game.setCell(2, 1);
        animation(game, width);
    }

    public static void model2() throws InterruptedException {
        int width = 20;
        int height = 10;
        GameOfTheLife game = new GameOfTheLife(width, height);
        game.setCell(1, 1);
        game.setCell(2, 2);
        game.setCell(3, 3);
        animation(game, width);
    }

    public static void model3() throws InterruptedException {
        int width = 30;
        int height = 8;
        GameOfTheLife game = new GameOfTheLife(width, height);
        game.setCell(1, 1);
        game.setCell(2, 2);
        game.setCell(3, 3);
        game.setCell(4, 4);
        game.setCell(5, 5);
        animation(game, width);
    }

    public static void movingModel() throws InterruptedException {
        int width = 30;
        int height = 8;
        GameOfTheLife game = new GameOfTheLife(width, height);
        game.setCell(1, 1);
        game.setCell(2, 1);
        game.setCell(3, 1);
        game.setCell(4, 1);
        game.setCell(5, 1);
        animation(game, width);
    }

    public static void animation(GameOfTheLife game, int width) throws InterruptedException {
        game.printGrid();
        System.out.println("-".repeat(width * 2 + 1));
        for (int i = 0; i < 10; i++) {
            sleep(1000);
            game.nextGeneration();
            game.printGrid();
        }
    }
}
