package leetcode.java.nov28;

public class ValidPalindrome {

    public static void main(String[] args) {
//        String s = "A man, a plan, a canal: Panama";
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }

    public static boolean isValidChar(char c) {
        return (c >= '0' && c <= '9') || (c >= 'a' && c <= 'z');
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if (!isValidChar(c1)) {
                i++;
                continue;
            }
            if (!isValidChar(c2)) {
                j--;
                continue;
            }
            if (c1 == c2) {
                i++;
                j--;
            } else return false;
        }
        return true;
    }
}
