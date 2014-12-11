package builder;

public class SaltWaterBuilder implements Builder {

    private SaltWater saltWater;

    public SaltWaterBuilder(){
        this.saltWater = new SaltWater(0,0);
    }

    @Override
    public void addSolute(double soluteAmount) {
        this.saltWater.salt += soluteAmount;
    }

    @Override
    public void addSolvent(double solventAmount) {
        this.saltWater.water += solventAmount;
    }

    @Override
    public void abandonSolution(double saltWaterAmount) throws Exception {
        double saltDelta = saltWaterAmount * (this.saltWater.salt / (this.saltWater.getWeight()));
        double waterDelta = saltWaterAmount * (this.saltWater.water / (this.saltWater.getWeight()));
        this.saltWater.salt -= saltDelta;
        this.saltWater.water -= waterDelta;

        if(this.saltWater.salt < 0 || this.saltWater.water < 0){
            throw new Exception("溶質あるいは溶媒が足りない");
        }
    }

    @Override
    public Object getResult() {
        return this.getResult();
    }

}
