package lotr;

// import lombok.ToString;

// @ToString
public class Elf extends Character{
    public Elf(){
        super(10, 10);
    }
    @Override
    public void kick(Character c){
        if(this.power > c.getPower()){
            c.setHp(0);
        }
        else{
            c.setPower(c.getPower() - 1);
        }
    }
    public String toString(){
        return "Elf{hp=" + this.hp + ", " + "power=" + this.power + "}";
    }

}
