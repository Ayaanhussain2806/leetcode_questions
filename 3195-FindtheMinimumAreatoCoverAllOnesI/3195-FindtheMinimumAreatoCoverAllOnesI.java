// Last updated: 11/24/2025, 8:43:25 PM
class Solution {
    public int minimumArea(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int rmin = m; 
        int cmin = n; 
        int rmax = -1;
        int cmax = -1;

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (grid[i][j] == 1) {
                    rmin=Math.min(rmin,i);
                    rmax=Math.max(rmax,i);
                    cmin=Math.min(cmin,j);
                    cmax=Math.max(cmax,j);
                }
            }
        }
        return (rmax - rmin + 1) * (cmax - cmin + 1);
    }
}
