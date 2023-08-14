package leetCode.Sorting;

import java.util.ArrayList;
import java.util.List;

public class AllMissingNumbers {

    public static void main(String[] args) {
        // int [] nums = {4,3,2,7,8,2,3,1};
        int[] nums = {1, 2};
        // int[] nums = {3,11,8,16,4,15,4,17,14,14,6,6,2,8,3,12,15,20,20,5};
        System.out.println(findDisappearedNumbers(nums));
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1 ) {
                result.add(i + 1);
            }
        }
        return result;
    }

    static void sort(int[] nums) {
        // Apply cyclic sort
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] nums, int from, int to) {
        int temp = nums[from];
        nums[from] = nums[to];
        nums[to] = temp;
    }

}
