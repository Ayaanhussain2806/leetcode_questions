// Last updated: 2/10/2026, 3:14:10 PM
class Solution {
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            if(grid[i][0]==1){
                q.offer(new int[]{i,0});
                grid[i][0]=0;
            }
            if(grid[i][n-1]==1){
                q.offer(new int[]{i,n-1});
                grid[i][n-1]=0;
            }
        }
        for(int i=0;i<n;i++){
            if(grid[0][i]==1){
                q.offer(new int[]{0,i});
                grid[0][i]=0;
            }
            if(grid[m-1][i]==1){
                q.offer(new int[]{m-1,i});
                grid[m-1][i]=0;
            }
        }
        int[] dx={-1,1,0,0};
        int[] dy={0,0,-1,1};
        while(!q.isEmpty()){
            int[] curr=q.poll();
            for(int k=0;k<4;k++){
                int nx=curr[0]+dx[k];
                int ny=curr[1]+dy[k];
                if(nx>=0 && ny>=0 && nx<m && ny<n && grid[nx][ny]==1){
                    q.offer(new int[]{nx,ny});
                    grid[nx][ny]=0;
                }
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }
}