package decorator;

public class CashewNutsToppingIcecream implements Icecream {

    private Icecream icecream;

    public CashewNutsToppingIcecream(Icecream icecream){
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
