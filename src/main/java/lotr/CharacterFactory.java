package lotr;

import java.util.Random;

public class CharacterFactory {
    private final Class<?>[] CHARACTER_CLASSES = {
        Elf.class, 
        Hobbit.class, 
        King.class, 
        Knight.class
    };
    public Character createCharacter(){
        Random rand = new Random();

        int index = rand.nextInt(4);
        try{
        return (Character) CHARACTER_CLASSES[index].getDeclaredConstructor().newInstance();
        } catch(Exception exception){
            exception.printStackTrace();
            return null;
        }
    }
}
