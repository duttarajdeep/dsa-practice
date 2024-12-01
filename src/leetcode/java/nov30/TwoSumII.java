package leetcode.java.nov30;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(numbers, target)));

    }

    public static int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int sum = numbers[start] + numbers[end];
            if (sum < target) start++;
            else if (sum > target) end--;
            else return new int[]{start + 1, end + 1};
        }
        return new int[]{-1, -1};
    }
}
