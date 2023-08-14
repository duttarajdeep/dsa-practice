package leetCode;

public class Patterns {

    public static void main(String[] args) {
//        pattern1(4);
//        pattern2(4);
//        pattern3(4);
//        pattern4(4);
//        pattern5(5);
        pattern6(5);
    }

    static void pattern1(int n) {
//        *
//        **
//        ***
//        ****
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        /*
         ****
         ***
         **
         *
         */
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        /*
        *   1
            1 2
            1 2 3
            1 2 3 4
        * */
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        /*
         *
         **
         ***
         ****
         *****
         ****
         ***
         **
         *
         */

        for (int row = 1; row <= 2 * n - 1; row++) {
            if (row <= n) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
                System.out.println();

            } else {
                for (int col = 1; col <= 2 * n - row; col++) {
                    System.out.print("* ");
                }
                System.out.println();

            }
        }

    }

    static void pattern5(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {

            int totalColsInRow = row > n ? 2 * n - row : row;
            int totalSpacesInRow = row < n ? n - row : row - n;

            for (int sp = 1; sp <= totalSpacesInRow; sp++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for (int row = 1; row <= n; row++) {
            int spaces = n - row;
            for(int sp = 1; sp <= spaces; sp++){
                System.out.print(" ");
            }
            for(int col = row; col >= 1; col--){
                System.out.print(col + " ");
            }
            for(int col = 2; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

}
