package ds.prep.firstround.sorting;

public class QuickSort {

    public void sort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            sort(arr, low, p - 1);
            sort(arr, p + 1, high);
        }
    }

    /**
     * Partitioning Logic:
     * low TO j - 1: Contains elements that are less than and equal to the pivot
     * j TO i -1: Contains elements that are greater than the pivot
     * i TO high: Contains elements that are yet to be traversed
     */
    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        int j = low;
        while (i <= high) {
            if (arr[i] <= pivot) {
                swap(arr, i, j);
                j++;
            }
            i++;
        }
        return j - 1;
    }

    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
