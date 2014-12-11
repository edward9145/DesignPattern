package builder;

public class Main {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Builder builder = new SaltWaterBuilder();
        Director director = new Director(builder);
        director.constract();
        builder.abandonSolution(200);
        SaltWater saltWater = (SaltWater) builder.getResult();
        System.out.println(saltWater.salt + "/" + saltWater.water);
    }

}
