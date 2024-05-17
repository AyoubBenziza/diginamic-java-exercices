package fr.diginamic.JDR;

import java.util.Random;

abstract public class Character {
    protected String name;
    protected int strength;
    protected int hp;

    public Character(String name, int strength, int hp) {
        this.name = name;
        this.strength = strength;
        this.hp = hp;
    }

    protected int attack() {
        return this.strength + new Random().nextInt(10 - 1 + 1) + 1;
    }
}
