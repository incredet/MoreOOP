package kick;

import lotr.Character;

public class ElfKick implements KickStrategy{
    public void kick(Character attacker, Character victim) {
        if (attacker.getPower() > victim.getPower()) {
            victim.setHp(0);
        }
        else {
            victim.setPower(victim.getPower()-1);
        }
    }
}
