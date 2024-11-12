package leetcode.java.nov11;

public class MajorityElement {
    public static void main(String[] args) {
//        int[] nums = {2, 2, 1, 1, 1, 2, 2};
//        int[] nums = {6, 5, 5};
        int[] nums = {3, 4, 4};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        if (nums.length == 0) throw new IllegalArgumentException("Input array cant be empty");
        int winner = nums[0];
        int votes = 1;
        int i = 1;
        while (i < nums.length) {
            if (nums[i] == winner) votes++;
            else if (votes == 0) winner = nums[i];
            else votes--;
            i++;
        }
        return winner;
    }
}
