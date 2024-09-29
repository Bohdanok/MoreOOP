package lotr;

public abstract class Noble extends KickStrategy{
    public int min;
    public int max;
    public Noble(int min, int max){
        super(min, max);
    }
    // @Override
    // public void kick(Character c){
    //     c.setHp(c.getHp() - (int) (Math.random() * (this.max - this.min) + this.min));
        
    // }
}
