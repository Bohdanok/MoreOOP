package lotr;

public class GameManager {
    void fight(Character c1, Character c2){
        while(c1.isAlive() && c2.isAlive()){
            c1.kick(c2);
            c2.kick(c1);
        }
        if (c1.isAlive()){
            System.out.println("Character 1 won");
        }
        else{
            System.out.println("Character 2 won");
        }
    }
}
