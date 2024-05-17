package fr.diginamic.JDR;

import java.util.Scanner;

public class Game {

    public void start() {
        System.out.println("Welcome to the JDR game!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your character name:");
        String input = sc.nextLine();
        menu(new Player(input));
    }

    public static void menu(Player player) {
        // Scanner to get user input selection enemy
        System.out.println("--- Menu ---");
        System.out.println("Choose an option: ");
        System.out.println("1. Create a new player");
        System.out.println("2. Fight");
        System.out.println("3. Score");
        System.out.println("4. Exit");
        System.out.println("--- Menu ---");
        int input = new Scanner(System.in).nextInt();
        switch (input) {
            case 1:
                System.out.println("Enter your name:");
                String name = new Scanner(System.in).next();
                System.out.println("Welcome " + name + "!");
                menu(new Player(name));
                break;
            case 2:
                selectionEnemy(player);
                break;
            case 3:
                displayScore(player);
                break;
            case 4:
                System.out.println("Goodbye " + player.name + "!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid selection. Please select an option.");
                break;
        }
    }

    public static void selectionEnemy(Player player) {
        // Scanner to get user input selection enemy
        System.out.println("--- Versus ---");
        System.out.println("Choose an option: ");
        System.out.println("1. Wolf");
        System.out.println("2. Goblin");
        System.out.println("3. Troll");
        System.out.println("4. Cancel");
        System.out.println("--- Versus ---");
        int input = new Scanner(System.in).nextInt();
        switch (input) {
            case 1:
                Wolf wolf = new Wolf("Wolf");
                System.out.println("You are fighting against a " + wolf.name);
                player.fight(wolf);
                break;
            case 2:
                Goblin goblin = new Goblin("Goblin");
                System.out.println("You are fighting against a " + goblin.name);
                player.fight(goblin);
                break;
            case 3:
                Troll troll = new Troll("Troll");
                System.out.println("You are fighting against a " + troll.name);
                player.fight(troll);
                break;
            case 4:
                menu(player);
                break;
            default:
                System.out.println("Invalid selection. Please select an option.");
                break;
        }

        menu(player);
    }

    public static void displayScore(Player player) {
        System.out.println("--- Score ---");
        System.out.println("Player: " + player.name);
        System.out.println("Score: " + player.score);
        System.out.println("--- Score ---");
        menu(player);
    }
}
