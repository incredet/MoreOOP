package lotr;

import kick.KingKick;

import java.util.Random;
public class King extends Character{
    Random random = new Random();
    public King() {
        super(10, 10, new KingKick());
        this.setHp(random.nextInt(10)+5);
        this.setPower(random.nextInt(10)+5);
    }
}