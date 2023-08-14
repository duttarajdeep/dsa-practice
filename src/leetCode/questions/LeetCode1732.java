package leetCode.questions;

public class LeetCode1732 {
    public static void main(String[] args) {
        int[] gain = new int[] { -5, 1, 5, 0, -7 };
        System.out.println(largestAltitude(gain));
    }

    public static int largestAltitude(int[] gain) {
        int[] sumArray = new int[gain.length + 1];
        sumArray[0] = 0;
        int sum = 0;
        int max = 0;
        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];
            sumArray[i] = sum;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
