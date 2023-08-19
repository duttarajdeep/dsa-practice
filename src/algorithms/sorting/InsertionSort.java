package algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {
    /*
     * Algorithm:
     *  - In this algorithm, at each step, we make sure that the arr is sorted till that index
     *  - At each step, we maintain an inner counter
     *  - We compare current element with previous element and swap them if current element is less
     *      than the previous element
     *  - If not, we break the loop and increase the outer counter
     *
     * Time Comp:
     *   - Best Case - O(n) (Array is already sorted)
     *   - Worst Case - O(n^2)

     * Considerations:
     *  - Works well on small values
     *  - Used in hybrid sorting algorithms, in pair with quick sort / merge sort etc
     * * */

    public static void main(String[] args) {
        int[] arr = {6, 4, 8, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        // We run the outer loop till N - 2, because, for each iteration of i, we are comparing i + 1 th element
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
