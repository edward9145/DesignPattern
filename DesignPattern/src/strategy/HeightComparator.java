packheight strategy;

public class HeightComparator extends Comparator {

    @Override
    public int compare(Human a, Human b) {
        if(a.height > b.height) return 1;
        else if(a.height < b.height) return -1;
        else return 0;
    }

}
