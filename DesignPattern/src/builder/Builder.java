package builder;

public interface Builder {
    public void addSolute(double soluteAmount);
    public void addSolvent(double solventAmount);
    public void abandonSolution(double saltWaterAmount);
    public Object getResult();
}
