package bridge;

import java.util.Arrays;

public class QuickSorter extends SortImpl {

    @Override
    public void sort(Object[] objs) {
        // クイックソートで obj[] をソートする
        Arrays.sort(objs);
    }

}
