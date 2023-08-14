package leetCode.Recursion;

public class NumberReverse {
    public static void main(String[] args) {
        System.out.println(reverseNum(100123));
    }

    static int reverseNum(int num) {
        int digits = (int) Math.log10(num) + 1;
        return helper(num, digits);
    }

    static int helper(int num, int digits) {
        if (num % 10 == num) {
            return num;
        }
        return num % 10 * (int) Math.pow(10, digits - 1) + helper(num / 10, digits - 1);
    }

}
