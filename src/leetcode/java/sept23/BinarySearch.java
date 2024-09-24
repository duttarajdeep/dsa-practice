package leetcode.java.sept23;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int key = 6;
        System.out.println("Element " + key + " found at Postion: " + binarySearch(nums, key));
    }

    private static int binarySearch(int[] nums, int key) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == key) return mid;
            if (nums[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
