package leetcode.java.nov30;

public class CountDigits {
    public static void main(String[] args) {
        int num = 121;
        System.out.println(countDigits(num));
    }

    public static int countDigits(int num) {
        int count = 0;
        int r = 0;
        int res = num;
        while (res > 0) {
            r = res % 10;
            res = res / 10;
            if (num % r == 0) {
                count++;
            }
        }
        return count;
    }
}
