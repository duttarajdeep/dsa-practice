package leetcode.java.sept21;

/**
 * https://leetcode.com/problems/backspace-string-compare/
 */

public class BackspaceStringCompare {

    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c##", "a#d#c#"));
    }

    public static boolean backspaceCompare(String s, String t) {
        return getActual(s).equals(getActual(t));
    }

    private static String getActual(String s) {
        StringBuilder sb = new StringBuilder();
        int hashCount = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '#') {
                hashCount++;
                continue;
            }

            if (hashCount > 0) {
                hashCount--;
            } else {
                sb.insert(0, c);
            }
        }
        return sb.toString();
    }

}
