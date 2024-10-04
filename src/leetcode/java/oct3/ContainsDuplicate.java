package leetcode.java.oct3;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4, 5, 5}));
    }

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (counts.containsKey(nums[i])) {
                int count = counts.get(nums[i]);
                counts.put(nums[i], ++count);
            } else {
                counts.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > 1) return true;
        }
        return false;
    }

}
