package leetcode.java.nov24;

public class RainWaterTrapping {

    public static void main(String[] args) {
//        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] height = {4, 2, 0, 3, 2, 5};
        System.out.println(trap(height));
    }

    static int trap(int[] height) {
        int trappedWater = 0;
        if (height.length == 0) throw new IllegalArgumentException("Height cannot be zero");

        // Go from left to right, to store the max left height at every index
        int[] left = new int[height.length];
        left[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            left[i] = Math.max(height[i], left[i - 1]);
        }

        // Go from right to left, to store the max right height at every index
        int[] right = new int[height.length];
        right[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            right[i] = Math.max(height[i], right[i + 1]);
        }

        // Iterate through the heights, and for each index, the possible storage is minimum of left and right
        // heights minus the current height
        for (int i = 0; i < height.length; i++) {
            int possibleStorage = Math.min(left[i], right[i]) - height[i];
            trappedWater += possibleStorage;
        }
        return trappedWater;
    }
}
