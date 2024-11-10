package leetcode.java.nov10;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {1};
        int val = 1;
        System.out.println(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
