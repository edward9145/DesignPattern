package abstract_factory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        HotPot hotPot = new HotPot(new Pot());
        Factory factory = new MizutakiFactory();
        hotPot.addSoup(factory.getSoup());
        hotPot.addMain(factory.getMain());
        hotPot.addVegetables(factory.getVegetables());
        hotPot.addOtherIngredients(factory.getOtherIngredients());

//        HotPot hotPot = new HotPot(new Pot());
//        hotPot.addSoup(new ChickenBonesSoup()); // 鶏がらを煮込んだスープ
//        hotPot.addMain(new Chicken());        // Main として鶏肉
//        List<Vegetable> vegetables = new ArrayList<Vegetable>();
//        vegetables.add(new ChineseCabbage()); // 白菜
//        vegetables.add(new Leek());           // ねぎ
//        vegetables.add(new Chrysanthemum());  // 春菊
//        hotPot.addVegetables(vegetables);
//        List<Ingredients> otherIngredients = new ArrayList<Ingredients>();
//        otherIngredients.add(new Tofu());     // 豆腐
//        hotPot.addOtherIngredients(otherIngredients);
    }

}
