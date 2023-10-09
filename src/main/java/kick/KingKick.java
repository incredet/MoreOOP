package kick;

import lotr.Character;

import java.util.Random;

public class KingKick implements KickStrategy {

    public void kick(Character attacker, Character victim) {
        Random random = new Random();
        victim.setHp(victim.getHp()-attacker.getPower());
    }
}
