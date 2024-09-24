package lotr;

public abstract class Noble extends Character{
    public int min;
    public int max;
    public Noble(int min, int max){
        super((int) ((Math.random() * 10) + 5), (int) ((Math.random() * 10) + 5));
        this.min = min;
        this.max = max;
    }
    @Override
    public void kick(Character c){
        c.setHp(c.getHp() - (int) (Math.random() * (this.max - this.min) + this.min));
        
    }
}
