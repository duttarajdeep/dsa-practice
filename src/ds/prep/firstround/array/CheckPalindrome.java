package ds.prep.firstround.array;

public class CheckPalindrome {

    static boolean check(String input) {
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "madami";
        System.out.println(check(input));
    }
}
