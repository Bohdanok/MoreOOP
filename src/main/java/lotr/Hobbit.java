package lotr;


public class Hobbit extends Character{
    public Hobbit(){
        super(0, 3);
    }

    public void kick(Character c){
        toCry();
    }

    public void toCry(){
        System.out.println("Crying...");
    }


    public String toString(){
        return "Hobbit{hp=" + this.hp + ", " + "power=" + this.power + "}";
    }
}
