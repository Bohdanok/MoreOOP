package lotr;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class King extends Noble{
    public King(){
        super(5, 15);

    }

    public String toString(){
        return "King{hp=" + this.hp + ", " + "power=" + this.power + "}";
    }
}
