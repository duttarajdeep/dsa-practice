package algorithms.recursion;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1,0};
        sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] nums, int low, int high) {
        if (low >= high) return;

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = nums[mid];

        while (start <= end) {
            // if element < pivot, we skip it
            while (nums[start] < pivot) {
                start++;
            }
            // if element > pivot, we skip it
            while (nums[end] > pivot) {
                end--;
            }
            // At this point, there is a violation, so we swap the both elements at start and end
            if (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

        // At this point, pivot is put at its correct position
        // Now we make recursive call to sort the left part and the right part of the pivot element

        // Left part
        sort(nums, low, end);

        // Right part
        sort(nums, start, high);

    }

}
