package lotr;
import java.util.Random;
class CharacterFactory {
    Random random = new Random();
    public Character factorCharacter() {
        int n=random.nextInt(3);
        if (n==0)
            return new Elf();
        else if (n==1)
            return new Hobbit();
        else if (n==2)
            return new King();
        return new Knight();
    }
}