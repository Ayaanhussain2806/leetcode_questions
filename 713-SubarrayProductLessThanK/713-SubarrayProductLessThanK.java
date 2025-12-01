// Last updated: 12/2/2025, 4:56:09 AM
1class Solution {
2    public int numIslands(char[][] grid) {
3        int count=0;
4        for(int i=0;i<grid.length;i++){
5            for(int j=0;j<grid[0].length;j++){
6                if(grid[i][j]=='1'){
7                    count++;
8                    dfs(grid,i,j);
9                }
10            }
11        }
12        return count;
13    }
14    public static void dfs(char[][] grid,int i,int j){
15        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]=='0'){
16            return ;
17        }
18        grid[i][j]='0';
19        dfs(grid,i-1,j);
20        dfs(grid,i+1,j);
21        dfs(grid,i,j-1);
22        dfs(grid,i,j+1);
23    }
24}