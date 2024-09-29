package lotr;

public class KickStrategy extends Character{
    public int min;
    public int max;

    public KickStrategy(int min, int max){
        super((int) ((Math.random() * (max - min)) + min), (int) ((Math.random() * (max - min)) + min));
        this.min = min;
        this.max = max;
    }

    @Override
    public void kick(Character c){
        c.setHp(c.getHp() - (int) (Math.random() * (this.max - this.min) + this.min));
        
    }
}
