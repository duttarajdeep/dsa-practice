package leetCode.Sorting;

//https://leetcode.com/problems/find-the-duplicate-number/description/

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        System.out.println(findDuplicate(nums));
    }

    static int findDuplicate(int[] nums) {
        // sort the array
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else {
                return nums[i];
            }
        }

        // find the element where nums[i] == i
//        for (int j = 0; j < nums.length; j++) {
//            if(nums[j] != j + 1){
//                return nums[j];
//            }
//        }

        return -1;
    }

    static void swap(int[] nums, int from, int to) {
        int temp = nums[from];
        nums[from] = nums[to];
        nums[to] = temp;
    }

}
