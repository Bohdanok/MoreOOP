package lotr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter@Getter@AllArgsConstructor
public abstract class Character {
    public int power;
    public int hp;
    public abstract void kick(Character c);
    public boolean isAlive(){
        return this.hp > 0;
    }
    public void setHp(int newhp){
        if(newhp < 0){
            this.hp = 0;
        }
        if(hp > 0){
            this.hp = newhp;
        }

    }

}
