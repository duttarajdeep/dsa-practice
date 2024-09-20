package dsa.main.array.backtracking;

public class Maze {
    public static void main(String[] args) {
        // System.out.println(noOfPaths(3, 4));
        boolean[][] maze = {{true, true, true}, {true, true, true}, {true, true, true}};
        allPaths("", maze, 0, 0);
    }

    static int noOfPaths(int r, int c) {
        if (r == 1 || c == 1) return 1;

        int left = noOfPaths(r - 1, c);
        int right = noOfPaths(r, c - 1);

        return left + right;
    }

    // Printing possible paths when we can only go DOWN OR RIGHT
    static void printPaths(String currentPath, int r, int c) {

        if (r == 1 && c == 1) {
            System.out.println(currentPath);
            return;
        }
        if (r > 1) {
            // move down
            printPaths(currentPath + 'V', r - 1, c);
        }

        if (c > 1) {
            // move right
            printPaths(currentPath + 'H', r, c - 1);
        }
        if (r > 1 && c > 1) {
            // move diagonally
            printPaths(currentPath + "D", r - 1, c - 1);
        }
    }

    // 1 of the cells in the maze is marked as false, so we cant go there
    static void pathWithRestrictions(String currentPath, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(currentPath);
        }
        // Skip the river (false)
        if (!maze[r][c]) {
            return;
        }
        if (r < maze.length - 1) {
            pathWithRestrictions(currentPath + "D", maze, r + 1, c);
        }

        if (c < maze.length - 1) {
            pathWithRestrictions(currentPath + "R", maze, r, c + 1);
        }
    }

    static void allPaths(String currentPath, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(currentPath);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // As we have visited this cell, we mark it as visited / false
        maze[r][c] = false;

        if (r < maze.length - 1) {
            allPaths(currentPath + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            allPaths(currentPath + "R", maze, r, c + 1);
        }
        if (r > 0) {
            allPaths(currentPath + "U", maze, r - 1, c);
        }
        if (c > 0) {
            allPaths(currentPath + "L", maze, r, c - 1);
        }

        // At this point, the function is being returned to previous caller,
        // so we revert back the changes to the cell, that we made during this function call
        maze[r][c] = true;
    }
}
