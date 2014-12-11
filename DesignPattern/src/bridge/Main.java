package bridge;

import java.util.Arrays;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Object[] arr = {41,34,14,55,7,83,30};
        TimerSorter ts = new TimerSorter(new BubbleSortImpl());
        ts.timeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
