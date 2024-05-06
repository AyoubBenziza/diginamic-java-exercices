package JDR;

public class Enemy extends Character {
    private final int difficulty;

    public Enemy(String name, int strength, int hp, int difficulty) {
        super(name, strength, hp);
        this.difficulty = difficulty;
    }

    public int getDifficulty() {
        return difficulty;
    }
}
