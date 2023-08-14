package leetCode.Sorting;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

public class AllDuplicates {

    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }

    static List<Integer> findDuplicates(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        //sort the list
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }

        // iterate through the sorted array and whenever we encounter an element where nums[i] != i + 1, we add
        // the element to ans list
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j + 1){
                ans.add(nums[j]);
            }
        }

        return ans;
    }

    static void swap(int[] nums, int from, int to) {
        int temp = nums[from];
        nums[from] = nums[to];
        nums[to] = temp;
    }

}
