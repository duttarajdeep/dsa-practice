package leetcode.java.sept22;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoNumberSum(nums, target)));
    }

    public static int[] twoNumberSum(int[] nums, int target) {
        // map to store the diff and the index
        Map<Integer, Integer> diffMap = new HashMap<>();

        // iterate through the array and store each target -  element in a HashMap as (difference, index)
        for (int i = 0; i < nums.length; i++) {
            if (diffMap.containsKey(nums[i])) {
                return new int[]{diffMap.get(nums[i]), i};
            } else {
                int diff = target - nums[i];
                diffMap.put(diff, i);
            }
        }
        // not found any index pair whose sum == target
        return new int[]{-1, -1};
    }


}
