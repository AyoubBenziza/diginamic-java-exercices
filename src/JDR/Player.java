package JDR;

import java.util.Scanner;
import java.util.Random;

public class Player extends Character {
    int score = 0;

    public Player(String name) {
        super(name, new Random().nextInt(18 - 12 + 1) + 12, new Random().nextInt(50 - 20 + 1) + 20);
        menu();
    }

    public void menu() {
        // Scanner to get user input selection enemy
        System.out.println("Choose an option: ");
        System.out.println("1. Wolf");
        System.out.println("2. Goblin");
        System.out.println("3. Troll");
        System.out.println("4. Score");
        System.out.println("5. Exit");
        int input = new Scanner(System.in).nextInt();
        switch (input) {
            case 1:
                Wolf wolf = new Wolf("Wolf");
                System.out.println("You are fighting against a " + wolf.name);
                fight(wolf);
                break;
            case 2:
                Goblin goblin = new Goblin("Goblin");
                System.out.println("You are fighting against a " + goblin.name);
                fight(goblin);
                break;
            case 3:
                Troll troll = new Troll("Troll");
                System.out.println("You are fighting against a " + troll.name);
                fight(troll);
                break;
            case 4:
                System.out.println("Score: " + this.score);
                break;
            case 5:
                System.out.println("Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid selection. Please select an option.");
                break;
        }

        menu();
    }

    public void fight(Enemy enemy) {
        do {
            System.out.println("Your HP: " + super.hp);
            System.out.println(enemy.name + " HP: " + enemy.hp);
            int damagePlayer = attack();
            int damageEnemy = enemy.attack();

            if (damagePlayer > damageEnemy) {
                enemy.hp -= damagePlayer - damageEnemy;
                System.out.println("You hit " + enemy.name + " with " + (damagePlayer - damageEnemy) + " damage.");
                if (enemy.hp <= 0) {
                    enemy.hp = 0;
                    System.out.println(enemy.name + " HP: " + enemy.hp);
                    this.score += enemy.getDifficulty();
                    System.out.println("Enemy " + enemy.name + " is dead. - You Win - Score: " + this.score);
                    break;
                } else {
                    System.out.println(enemy.name + " HP: " + enemy.hp);
                }
            } else {
                super.hp -= damageEnemy - damagePlayer;

                System.out.println(enemy.name + " hit you with " + (damageEnemy - damagePlayer) + " damage.");
                if (super.hp <= 0) {
                    super.hp = 0;
                    System.out.println("Your HP: " + super.hp);
                    System.out.println("Your character is dead. You can't fight anymore.");
                    System.out.println("- Game Over -");
                    System.out.println("Score: " + this.score);
                    System.out.println("Please create a new character.");
                    System.exit(0);
                    break;
                } else {
                    System.out.println("Your HP: " + super.hp);
                }
            }
        } while (super.hp > 0 || enemy.hp > 0);
    }
}
