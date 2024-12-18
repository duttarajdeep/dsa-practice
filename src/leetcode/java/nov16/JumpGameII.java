package leetcode.java.nov16;

public class JumpGameII {
    public static void main(String[] args) {
        int[] nums = {2, 4, 1, 2, 3, 1, 1, 2};
        System.out.println(jump(nums));
    }

    public static int jump(int[] nums) {
        int totalJumps = 0;
        int destination = nums.length - 1;
        int coverage = 0;
        int farthestJumpIdx = 0;

        if (nums.length == 1) return 0;

        for (int i = 0; i < nums.length; i++) {
            coverage = Math.max(coverage, i + nums[i]);
            if (i == farthestJumpIdx) {
                farthestJumpIdx = coverage;
                totalJumps++;
                if (coverage >= destination) {
                    return totalJumps;
                }
            }
        }
        return totalJumps;
    }
}
