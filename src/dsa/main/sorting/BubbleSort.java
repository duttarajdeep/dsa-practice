package dsa.main.sorting;

public class BubbleSort {
    public void sort(int[] nums) {
        // In bubble sort, with every iteration, the largest element is put to end of the array at its correct position
        // As the first element would be automatically sorted, we run the loop length - 1 times
        for (int i = 0; i < nums.length - 1; i++) {
            // boolean flag to keep track if any swapping happened during current iteration
            boolean isSwapped = false;
            // inner loop will compare adjacent elements, and swap if required
            // inner loop we always
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                    isSwapped = true;
                }
            }
            if (!isSwapped) break;
        }
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
