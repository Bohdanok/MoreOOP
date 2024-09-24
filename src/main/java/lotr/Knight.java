package lotr;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Knight extends Noble{
    public Knight(){
        super(2, 12);
    }
    public String toString(){
        return "Knight{hp=" + this.hp + ", " + "power=" + this.power + "}";
    }
}
