package strategy;

public class MyClass {

    private Comparator comparator;

    public MyClass(Comparator comparator){
        this.comparator = comparator;
    }

    public int compare(Human a, Human b){
        return comparator.compare(a, b);
    }

}
