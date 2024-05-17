package fr.diginamic.JDR;

import java.util.Random;

public class Wolf extends Enemy {

    public Wolf(String name) {
        super(name, new Random().nextInt(8 - 3 + 1) + 3, new Random().nextInt(10 - 5 + 1) + 5, 1);
    }
}
