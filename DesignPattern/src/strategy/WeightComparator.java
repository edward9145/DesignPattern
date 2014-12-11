package strategy;

public class WeightComparator extends Comparator {

    @Override
    public int compare(Human a, Human b) {
        if(a.weight > b.weight) return 1;
        else if(a.weight < b.weight) return -1;
        else return 0;
    }

}
