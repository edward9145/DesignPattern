package interpreter;

public class Main {

    public static void main(String args[]){
        Ingredient powder = new Ingredient("「粉末スープ」");
        Ingredient noodle = new Ingredient("「麺」");
        Ingredient hotWater = new Ingredient("「お湯」");
        Ingredient soup = new Ingredient("「液体スープ」");

        Operand powderAndNoodle = new Plus(powder, noodle).execute();
        Operand hotWaterAndPowderNoodle = new Plus(powderAndNoodle, hotWater).execute();
        Operand wait = new Wait(3, hotWaterAndPowderNoodle).execute();
        Operand soupAndWait = new Plus(soup, wait).execute();

        System.out.println(soupAndWait.getOperandString());

    }
}
