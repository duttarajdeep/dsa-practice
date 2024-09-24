package leetcode.java.sept22;

public class Anagram {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {

        // convert inputs to lowercase
        s = s.toLowerCase();
        t = t.toLowerCase();

        // remove spaces from string
        s = s.replace(" ", "");
        t = t.replace(" ", "");

        int[] counts = new int[26];

        // iterate through 1st string and increment the respective letter counts
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
        }

        // iterate throught the 2nd string and empty the buckets
        for (int i = 0; i < t.length(); i++) {
            counts[t.charAt(i) - 'a']--;
        }

        // iterate through counts array, if any element has non-zero count, then its not an anagram
        for (int c : counts) {
            if (c != 0) return false;
        }

        return true;

    }

}
