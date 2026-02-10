// Last updated: 2/10/2026, 3:14:20 PM
class Solution {
    int result = 0;
    int emptyCount = 1;

    public int uniquePathsIII(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int startX = 0, startY = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    startX = i;
                    startY = j;
                } else if (grid[i][j] == 0) {
                    emptyCount++;
                }
            }
        }

        dfs(grid, startX, startY);
        return result;
    }

    public void dfs(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == -1) {
            return;
        }

        if (grid[i][j] == 2) {
            if (emptyCount == 0) result++;
            return;
        }

        grid[i][j] = -1;
        emptyCount--;

        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);

        grid[i][j] = 0;
        emptyCount++;
    }
}
