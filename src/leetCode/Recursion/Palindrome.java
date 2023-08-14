package leetCode.Recursion;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(palindrome(123221));
    }

    static boolean palindrome(int num) {
        int digits = (int) Math.log10(num) + 1;
        return helper(num, digits);
    }

    private static boolean helper(int num, int digits) {
        if (num % 10 == num || digits == 1) {
            return true;
        }
        if(num / (int) Math.pow(10, digits - 1) != num % 10){
            return false;
        }
        return helper((num / 10) % (int) Math.pow(10, digits - 2), digits - 2);
    }

}
