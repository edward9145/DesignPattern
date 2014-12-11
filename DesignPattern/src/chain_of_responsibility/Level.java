package chainofresponsibility;

public class Level {

    public int level;

    public Level(int i) {
        this.level = i;
    }

    public boolean lessThan(Level l){
        return this.level < l.level;
    }

}
