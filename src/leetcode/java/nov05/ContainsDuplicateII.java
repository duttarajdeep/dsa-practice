package leetcode.java.nov05;

public class ContainsDuplicateII {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        
    }

    /**
     * nums -> non-decreasing order
     * each unique element appears twice
     * relative order maintain
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;

        while (k < m + n) {
            if (nums1[i] < nums2[j]) {
                result[k] = nums1[i];
                i++;
            } else {
                result[k] = nums2[j];
                j++;
            }
            k++;
        }

        if (i < m) {
            while (i < m) {
                result[k] = nums1[i];
                i++;
                k++;
            }
        }

        if (j < n) {
            while (i < n) {
                result[k] = nums2[j];
                j++;
                k++;
            }
        }
    }
}
