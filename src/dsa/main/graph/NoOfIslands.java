package dsa.main.graph;

/**
 * Given an m x n 2D binary grid which represents a map of '1's (land) and '0's (water), return the number of islands.
 * <p>
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: grid = [
 * ["1","1","1","1","0"],
 * ["1","1","0","1","0"],
 * ["1","1","0","0","0"],
 * ["0","0","0","0","0"]
 * ]
 * Output: 1
 * Example 2:
 * <p>
 * Input: grid = [
 * ["1","1","0","0","0"],
 * ["1","1","0","0","0"],
 * ["0","0","1","0","0"],
 * ["0","0","0","1","1"]
 * ]
 * Output: 3
 * <p>
 * <p>
 * Constraints:
 * <p>
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 300
 * grid[i][j] is '0' or '1'.
 */

public class NoOfIslands {
    public int noOfIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];

        int noOfIslands = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    dfs(grid, i, j, visited);
                    noOfIslands++;
                }
            }
        }
        return noOfIslands;
    }

    private void dfs(char[][] grid, int row, int col, boolean[][] visited) {
        /**
         * base conditions
         * 1. row should be within range
         * 2. cols should be withing range
         * 3. land should not be already visited
         * 4. it should be land i.e '1' and not water i.e '0'
         */

        if (row < 0 || col < 0 ||
                row > grid.length || col > grid[0].length ||
                visited[row][col] ||
                grid[row][col] == 0
        ) {
            return;
        }

        // Mark current land as visited
        visited[row][col] = true;

        // starting from the current land, start dfs in four directions, to find connected lands
        // go up
        dfs(grid, row - 1, col, visited);
        // go right
        dfs(grid, row, col + 1, visited);
        // go down
        dfs(grid, row + 1, col, visited);
        // go left
        dfs(grid, row, col - 1, visited);
    }
}


