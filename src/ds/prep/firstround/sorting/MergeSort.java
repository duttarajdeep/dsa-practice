package ds.prep.firstround.sorting;

public class MergeSort {
    public void sort(int[] arr, int[] temp, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            sort(arr, temp, low, mid);
            sort(arr, temp, mid + 1, high);
            merge(arr, temp, low, mid, high);
        }
    }

    private void merge(int[] arr, int[] temp, int low, int mid, int high) {
        // copy the values in range low, mid to temp array
        if (high + 1 - low >= 0) System.arraycopy(arr, low, temp, low, high + 1 - low);
        int i = low; // traverse left sorted subarray
        int j = mid + 1; // traverse right sorted subarray
        int k = low; // will merge both arrays into original array (arr)

        while (i <= mid && j <= high) {
            if (temp[i] < temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
        // once right array get exhausted, we need to put the remaining elements of the left sub-array in the correct
        // place
        while (i <= mid) {
            arr[k] = temp[i];
            k++;
            i++;
        }

    }
}
