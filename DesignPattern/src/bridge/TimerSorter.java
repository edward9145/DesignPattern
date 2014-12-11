package bridge;

public class TimerSorter extends Sorter {

    public TimerSorter(SortImpl sortImpl) {
        super(sortImpl);
    }

    public void timeSort(Object[] objs){
        long start = System.currentTimeMillis();
        this.sort(objs);
        long end = System.currentTimeMillis();
        System.out.println("time:"+(end - start));
    }



}
