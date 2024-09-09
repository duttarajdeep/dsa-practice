package ds.prep.firstround.sorting;

public class SelectionSort {
    /**
     * In selection sort algorithm, we sort the array in following steps:
     * <p>
     * 1. Logically, have a sorted and an unsorted part of the array. Initially the complete array is unsorted part and
     * the sorted part is empty
     * 2. Start from left and on every pass find the min element in the unsorted part and place it from left to
     * right in the sorted part
     * 3. Once, the array is iterated from 0 to n - 1, the sorting is complete
     */
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) min = j;
            }
            // swap the min element with ith element
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
