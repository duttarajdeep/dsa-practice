package leetcode.java.nov30;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(nums));
    }

    public static int maxArea(int[] height) {
        int start = 0, maxArea = 0;
        int end = height.length - 1;
        while (start < end) {
            if (height[start] < height[end]) {
                maxArea = Math.max(maxArea, height[start] * (end - start));
                start++;
            } else {
                maxArea = Math.max(maxArea, height[end] * (end - start));
                end--;
            }
        }
        return maxArea;
    }
}
