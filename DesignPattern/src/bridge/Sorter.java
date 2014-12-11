package bridge;

public class Sorter {

    private SortImpl sortImpl;

    public Sorter(SortImpl sortImpl){
        this.sortImpl = sortImpl;
    }

    public void sort(Object[] objs){
        sortImpl.sort(objs);
    }

}
