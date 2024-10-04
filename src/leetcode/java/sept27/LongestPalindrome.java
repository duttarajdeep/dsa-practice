package leetcode.java.sept27;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "aabc";
        System.out.println(longestPalindrome(s));
    }

    public static int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        int longestLength = 0;
        int singleOccurenceCount = 0;

        for (int i : count) {
            if (i == 0) {
                continue;
            } else if (i == 1) {
                singleOccurenceCount++;
            } else {
                int pairsInCount = i / 2;
                int remainderInCount = i % 2;
                longestLength = longestLength + pairsInCount * 2;
                singleOccurenceCount = singleOccurenceCount + remainderInCount;
            }
        }
        if (singleOccurenceCount > 0) longestLength += 1;
        return longestLength;
    }
}
