package leetCode.Recursion;

public class Factorial {

    public static void main(String[] args) {
        //System.out.println(factorial(5));
        fact(20);
    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        return n * factorial(n - 1);
    }

    static void fact(long i) {
        long ans = 1;
        while (i > 0) {
            ans = ans * i;
            --i;
        }
        System.out.println(ans);
    }
}
