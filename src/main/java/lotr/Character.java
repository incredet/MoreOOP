package lotr;

import kick.KickStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public abstract class Character {
    private int hp;
    private int power;

    private KickStrategy kickStrategy;

    public boolean isAlive(){

        return hp > 0;
    }

    public void setHp(int hp){

        this.hp = Math.max(hp, 0);
    }

    public String toString(){

        return this.getClass().getSimpleName()+"{hp="+hp+", power="+power+"}";
    }

    public void kick(Character attacker){
        kickStrategy.kick(this, attacker);
    }
    
}
