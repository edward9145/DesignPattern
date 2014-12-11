package strategy;

public class AgeComparator extends Comparator {

    @Override
    public int compare(Human a, Human b) {
        if(a.age > b.age) return 1;
        else if(a.age < b.age) return -1;
        else return 0;
    }

}
