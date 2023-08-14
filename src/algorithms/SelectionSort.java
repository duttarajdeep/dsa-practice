package algorithms;

import java.util.Arrays;

public class SelectionSort {
    /*
     * Algorithm:
     *  - In this algorithm, we follow below steps -
     *      - At every step, select the max element in the given array
     *      - Put the max element at the correct postion, i.e the last position
     *      - At next step, exclude the last element and repeat
     *
     * Time Comp:
     *      - We take N - 1 steps to completely sort the array
     *      - At every step, we find the max element, so we iterate the array N - 1 at each step again
     *   - Best Case - O(n^2)
     *   - Worst Case - O(n^2)

     * Considerations:
     *      - Ignore the last element at each step, because after each iteration of i, array starting from
     *          the (N - i)th element to the end becomes sorted
     * * */

    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 9, 6, 5, 1, 2, 3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        if (arr.length > 1) {
            for (int i = 0; i < arr.length; i++) {
                int last = arr.length - i - 1;
                int maxIndex = findMax(arr, 0, last);
                swap(arr, maxIndex, last);
            }
        }
    }

    private static int findMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
