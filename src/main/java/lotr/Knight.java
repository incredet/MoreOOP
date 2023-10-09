package lotr;

import kick.KnightKick;
import java.util.Random;

public class Knight extends Character{
    Random rand = new Random();
    public Knight() {
        super(0, 0, new KnightKick());
        this.setHp(rand.nextInt(10)+2);
        this.setPower(rand.nextInt(10)+2);
    }

}
