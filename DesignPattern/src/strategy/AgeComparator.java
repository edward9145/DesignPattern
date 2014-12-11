package strategy;

public class AgeComparator extends Comparator {

    @Override
    public int compare(Human a, Human b) {
        if(a.age > b.age) return 1;
        if(a.age < b.age) return -1;
        return 0;
    }

}
