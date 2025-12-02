// Last updated: 12/2/2025, 7:12:02 PM
1class Solution {
2    public int maxAreaOfIsland(int[][] grid) {
3        int max=0;
4        for(int i=0;i<grid.length;i++){
5            for(int j=0;j<grid[0].length;j++){
6                if(grid[i][j]==1){
7                    int ans=dfs(grid,i,j);
8                    max=Math.max(max,ans);
9                }
10            }
11        }
12        return max;
13    }
14    private int dfs(int[][] grid,int i,int j){
15        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0){
16            return 0;
17        }
18        grid[i][j]=0;
19        return 1 + dfs(grid,i-1,j)
20                + dfs(grid,i+1,j)
21         + dfs(grid,i,j-1)
22         + dfs(grid,i,j+1);
23    }
24}