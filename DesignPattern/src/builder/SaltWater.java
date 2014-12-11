package builder;

public class SaltWater {

    public double salt;
    public double water;

    public SaltWater(double salt, double water){
        this.salt = salt;
        this.water = water;
    }

    public double getWeight() {
        return salt + water;
    }
}
