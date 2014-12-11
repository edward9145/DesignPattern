package builder;

public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void constract(){
        // 「100g の溶媒に 40g の溶質を溶かし、うち 70g を捨てた後、溶媒を 100g 追加し、最後に溶質を 15g 加える」
        builder.addSolvent(100);
        builder.addSolute(40);
        builder.abandonSolution(70);
        builder.addSolvent(100);
        builder.addSolute(15);
    }

}
