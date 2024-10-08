package leetcode.java.sept21;

/**
 * https://leetcode.com/problems/majority-element/description/
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {

        // use boyer moore vote algorithm
        int majority = nums[0];
        int votes = 1;
        for (int i = 1; i < nums.length; i++) {
            if (votes == 0) {
                majority = nums[i];
                votes++;
            } else if (majority == nums[i]) {
                votes++;
            } else {
                votes--;
            }
        }
        return majority;
    }
}
