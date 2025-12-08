package d_sorting.apps;

import d_sorting.utils.ArrayUtils;

import java.util.Arrays;

public class SortingTestBed {
    public static void main(String[] args) {
        int [] data = {1, 4, 12, 4, 12, 6, 23, -12, 2, 12, 340, 89, -10};
        System.out.println("Original data: " + Arrays.toString(data));

        int mid = data.length/2;
        ArrayUtils.quicksort(data);
        System.out.println("Sorted data: " + Arrays.toString(data));
    }
}
