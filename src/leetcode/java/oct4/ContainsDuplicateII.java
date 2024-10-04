package leetcode.java.oct4;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (counts.containsKey(nums[i])) {
                int index = counts.get(nums[i]);
                if (Math.abs(i - index) <= k) return true;
                else {
                    counts.put(nums[i], i);
                }
            } else {
                counts.put(nums[i], i);
            }
        }
        return false;
    }
}
