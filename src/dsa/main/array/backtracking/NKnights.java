package dsa.main.array.backtracking;

public class NKnights {

    // Place N knights in an N X N Maze

    // Approach -
    /*
     * Start by placing a knight at 0,0
     * Then we will check if we can place the remaining knights at the next cells
     * If we reach the last col, we move on to the place in the next row
     * Before placing, we should check, if its safe to place the knight at this r,c
     * For checking if its safe - we will have 4 conditions
     *   - Knights should not be at r,c if there is already a knight at below positions
     *   - (r - 1, c - 2)
     *   - (r - 1, c + 2)
     *   - (r - 2, c - 1)
     *   - (r - 2, c + 1)
     * */

    public static void main(String[] args) {
        int n = 4;
        System.out.println(nknights(new boolean[n][n], 0, 0, n));
    }

    static int nknights(boolean[][] board, int row, int col, int knights) {

        if (knights == 0) {
            display(board);
            System.out.println();
            return 1;
        }

        if (row == board.length - 1 && col == board.length) {
            return 0;
        }

        if (col == board.length) {
            nknights(board, row + 1, 0, knights);
            return 0;
        }
        int count = 0;
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            count += nknights(board, row, col + 1, knights - 1);
            // backtracking
            board[row][col] = false;
        }

        return count + nknights(board, row, col + 1, knights);
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        // check if the indices are valid - check the four conditions for placing
        if (isValidIndex(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }
        if (isValidIndex(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }
        if (isValidIndex(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }
        if (isValidIndex(board, row - 2, col + 2)) {
            return !board[row - 2][col + 1];
        }

        return true;
    }

    private static boolean isValidIndex(boolean[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board[0].length;
    }

    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("K ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }

}
