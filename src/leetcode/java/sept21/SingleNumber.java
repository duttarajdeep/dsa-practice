package leetcode.java.sept21;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/single-number/description/
 */
public class SingleNumber {
    public static void main(String[] args) {
        SingleNumber q = new SingleNumber();
        System.out.println(q.solution2(new int[]{2, 2, 1, 1, 4, -1, -1, 4, 5}));
    }

    public int solution1(int[] nums) {
        Map<Integer, Integer> lookup = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!lookup.containsKey(nums[i])) {
                lookup.put(nums[i], 1);
            } else {
                int count = lookup.get(nums[i]);
                lookup.put(nums[i], ++count);
            }
        }
        for (Map.Entry<Integer, Integer> entry : lookup.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
        }
        return Integer.MIN_VALUE;
    }

    public int solution2(int[] nums) {
        // use XOR operator to eliminate same elements
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res = res ^ nums[i];
        }
        return res;
    }
}
