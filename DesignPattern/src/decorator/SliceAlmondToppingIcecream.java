package decorator;

public class SliceAlmondToppingIcecream implements Icecream {

    private Icecream icecream;

    public SliceAlmondToppingIcecream(Icecream icecream){
        this.icecream = icecream;
    }

    @Override
    public String getName() {
        // Decorator
        return "カシューナッツ" + icecream.getName();
    }

    @Override
    public String howSweet() {
        return icecream.howSweet();
    }

}
