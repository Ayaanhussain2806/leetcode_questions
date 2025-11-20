// Last updated: 11/20/2025, 2:57:24 PM
class Solution {
    public int minimumArea(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int rMin = m; 
        int cMin = n; 
        int rMax = -1;
        int cMax = -1;

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (grid[i][j] == 1) {
                    if (i < rMin) rMin = i;
                    if (j < cMin) cMin = j;
                    if (i > rMax) rMax = i;
                    if (j > cMax) cMax = j;
                }
            }
        }

        if (rMax == -1) return 0;

        return (rMax - rMin + 1) * (cMax - cMin + 1);
    }
}
