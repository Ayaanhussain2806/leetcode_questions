// Last updated: 2/10/2026, 3:11:40 PM
class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] oner= new int[m];
        int[] onec=new int[n];
        for(int i = 0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    oner[i]++;
                    onec[j]++;
                }
            }
        }
        int[][] diff=new int[m][n];
        for(int i =0;i<m;i++){
            int zeror=n-oner[i];
            for(int j=0;j<n;j++){
                int zeroc=m-onec[j];
                diff[i][j]=oner[i]+onec[j]-zeror-zeroc;
            }
        }
        return diff;
    }
}