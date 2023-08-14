package algorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        /*
        * Algorithm:
        *   - Its an in-place and stable sorting algorithm.
        *       In-place - no extra memory required as we are modifying the original array
        *       Stable - the order of element in the input arr is preserved
        *   - Iterate through the elements
        *   - first pointer will keep track of current starting position
        *   - on every iteration, last index of the arr will be sorted
        *   - second pointer will be used to compare current element with previous element
        *   - At the end of N - 1 iterations, array would be sorted
        *
        * Time Comp:
        *   - Best Case - Array is already sorted - O(n) - because we still have to iterate through the array
        *          at least once, to decide if its already sorted on not
        *   - Worst Case - Array is sorted in reverse order - O(n^2) - because for every iteration, we have to make
        *           N - i comparisons to sort

        * Consideration:
        *   - If array is already sorted, we should add a check to ignore further iterations of i. To do this,
        *       we add a boolean to check if swapping is occuring at every step of i. If for some i, swapping didn't
        *       occur, it means that the array is already sorted at this point. So we can break out of the i loop
        *       and skip next iterations of i
        * * */

        boolean swapped;

        // run the steps N - 1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }
        }
    }
}
