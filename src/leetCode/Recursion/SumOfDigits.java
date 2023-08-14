package leetCode.Recursion;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(sumOfDigits(153));
    }

    static int sumOfDigits(int num) {
        if (num == 0) {
            return num;
        }
        return num % 10 + sumOfDigits(num / 10);
    }
}
