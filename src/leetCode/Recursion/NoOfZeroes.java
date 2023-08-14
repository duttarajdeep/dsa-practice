package leetCode.Recursion;

public class NoOfZeroes {

    public static void main(String[] args) {
        System.out.println(countZeroes(3020400));
    }

    static int countZeroes(int num) {
        int count = 0;
        return helper(num, count);
    }

    static int helper(int num, int count) {
        if (num % 10 == 0) {
            count++;
        }
        if (num % 10 == num) {
            return count;
        }
        return helper(num / 10, count);
    }
}
