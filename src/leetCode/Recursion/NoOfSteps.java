package leetCode.Recursion;

public class NoOfSteps {

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

    static int numberOfSteps(int num) {
        int count = 0;
        return step(num, count);
    }

    private static int step(int num, int count) {
        if (num == 0) {
            return count;
        }
        if (num % 2 == 0) {
            return step(num / 2, ++count);
        } else {
            return step(num - 1, ++count);
        }
    }

}
