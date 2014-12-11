package bridge;

public class Sorter {

    private SortImpl sortImpl;


    public void sort(Object[] objs){
        sortImpl.sort(objs);
    }

}
