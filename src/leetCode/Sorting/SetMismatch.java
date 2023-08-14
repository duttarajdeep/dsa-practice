package leetCode.Sorting;

//https://leetcode.com/problems/set-mismatch/

import java.util.Arrays;

public class SetMismatch {

    public static void main(String[] args) {
        int[] nums = {5,6,3,1,2,3};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    public static int[] findErrorNums(int[] nums) {
        //sort the array
        int i = 0;
        while( i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i , correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j + 1){
                return new int[]{nums[j], j + 1};
            }
        }

        return new int[]{-1,-1};
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
