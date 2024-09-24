package leetcode.java.sept22;

public class ValidPalindromeString {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        s = s.toLowerCase();
        while (i < j) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if (!((c1 >= 'a' && c1 <= 'z') || (c1 >= '0' && c1 <= '9'))) {
                i++;
                continue;
            }
            if (!((c2 >= 'a' && c2 <= 'z') || (c2 >= '0' && c2 <= '9'))) {
                j--;
                continue;
            }
            if (c1 != c2)
                return false;

            i++;
            j--;

        }
        return true;
    }

}
