package leetcode.java.nov16;

public class HIndex {
    public static void main(String[] args) {
//        int[] citations = {3, 0, 6, 1, 5};
        int[] citations = {1, 3, 1};
        System.out.println(hIndex(citations));
    }

    public static int hIndex(int[] citations) {
        int[] counts = new int[max(citations) + 1];
        for (int i = 0; i < citations.length; i++) {
            counts[citations[i]]++;
        }
        int paperCount = 0;
        for (int i = counts.length - 1; i >= 0; i--) {
            paperCount += counts[i];
            if (paperCount >= i) return i;
        }
        return -1;
    }

    public static int max(int[] nums) {
        int max = 0;
        for (int n : nums) {
            if (n > max) max = n;
        }
        return max;
    }
}
