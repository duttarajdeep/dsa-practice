package dsa.main.array.backtracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }

    static int queens(boolean[][] board, int row) {
        // base condition -> if the end of board is reached, display the current board
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }
        // keep track of the number of ways to arrange the queens
        int count = 0;

        // iterate through cols of the row
        for (int col = 0; col < board.length; col++) {
            // if its safe to place here, then place
            if (isSafe(board, row, col)) {
                // place the queen
                board[row][col] = true;

                // make a recursive call to r + 1
                count += queens(board, row + 1);

                // revert back the change on the original array (backtracking)
                board[row][col] = false;
            }
        }

        return count;
    }

    // display function
    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    // isSafe function -> will check if its safe to place the Q at r,c
    static boolean isSafe(boolean[][] board, int r, int c) {
        // will check current column -> [0,r]
        for (int i = 0; i < r; i++) {
            if (board[i][c]) {
                return false;
            }
        }
        // left upper diagonal -> [r--, c--] till min(r,c)
        int maxLeft = Math.min(r, c);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[r - i][c - i]) {
                return false;
            }
        }

        // right upper diagonal -> [r--, c++] till min(r,c)
        int maxRight = Math.min(r, board.length - c - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[r - i][c + i]) {
                return false;
            }
        }

        return true;
    }
}
