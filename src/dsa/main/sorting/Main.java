package dsa.main.sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        BubbleSort bs = new BubbleSort();
//        bs.sort(nums);

        InsertionSort is = new InsertionSort();
//        is.sort(nums);

        SelectionSort ss = new SelectionSort();
//        ss.sort(nums);

        MergeSort ms = new MergeSort();
//        ms.sort(nums, new int[nums.length], 0, nums.length - 1);

        QuickSort qs = new QuickSort();
        qs.sort(nums, 0, nums.length - 1);

        System.out.println(Arrays.toString(nums));

    }
}
