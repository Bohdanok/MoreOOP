package lotr;

import java.util.Random;

public class CharacterFactory {
    public Character createCharacter(){
        Random rand = new Random();
        
        int number = rand.nextInt(4) + 1;
        if(number == 1){

            return new Elf();
        }
        else if(number == 2){

            return new Hobbit();
        }
        else if(number == 3){

            return new King();
        }
        else{
            return new Knight();
        }
    }
}
