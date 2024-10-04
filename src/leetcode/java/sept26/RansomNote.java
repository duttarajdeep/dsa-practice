package leetcode.java.sept26;

public class RansomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] counts = new int[26];
        for (char c : ransomNote.toCharArray()) {
            counts[c - 'a']++;
        }
        for (char c : magazine.toCharArray()) {
            if (counts[c - 'a'] > 0) counts[c - 'a']--;
        }
        for (int c : counts) {
            if (c != 0) return false;
        }
        return true;
    }
}
