package kick;

import lotr.Character;

public class KnightKick implements KickStrategy{
    public void kick(Character attacker, Character victim) {

        victim.setHp(victim.getHp()-attacker.getPower()
        );
    }
}
