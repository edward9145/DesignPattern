package decorator;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Icecream ice1 = new CashewNutsToppingIcecream(new VanillaIcecream());
        Icecream ice2 = new CashewNutsToppingIcecream(new GreenTeaIcecream());
        Icecream ice3 = new SliceAlmondToppingIcecream(new CashewNutsToppingIcecream(new VanillaIcecream()));

        System.out.println(ice1.getName() + " " + ice1.howSweet());
        System.out.println(ice2.getName() + " " + ice2.howSweet());
        System.out.println(ice3.getName() + " " + ice3.howSweet());
    }

}
