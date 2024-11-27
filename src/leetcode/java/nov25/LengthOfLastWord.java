package leetcode.java.nov25;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        int length = 0;
        boolean wordStarted = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                wordStarted = true;
                length++;
            }
            if (s.charAt(i) == ' ' && wordStarted) {
                wordStarted = false;
                return length;
            }
        }
        return length;
    }
}
