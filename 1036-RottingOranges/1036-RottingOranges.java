// Last updated: 2/10/2026, 3:14:15 PM
class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        int fresh=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0) return 0;
        int minutes=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int s=0;s<size;s++){

            int[] curr=q.poll();
            int[] dx={-1,1,0,0};
            int[] dy={0,0,-1,1};
            for(int k=0;k<4;k++){
                int nx=curr[0]+dx[k];
                int ny=curr[1]+dy[k];
                if(nx>=0 && ny>=0 && nx<m && ny<n && grid[nx][ny]==1){
                    grid[nx][ny]=2;
                    q.offer(new int[]{nx,ny});
                    fresh--;
                }
                }
            }
            minutes++;
        }
        return fresh==0 ? minutes-1 : -1;
    }
}