package fr.diginamic.JDR;

import java.util.Random;

public class Troll extends Enemy {

    public Troll(String name) {
        super(name, new Random().nextInt(15 - 10 + 1) + 10, new Random().nextInt(30 - 20 + 1) + 20, 5);
    }
}
