package JDR;

import java.util.Random;

public class Goblin extends Enemy {

    public Goblin(String name) {
        super(name, new Random().nextInt(10 - 5 + 1) + 5, new Random().nextInt(15 - 10 + 1) + 10, 2);
    }
}
