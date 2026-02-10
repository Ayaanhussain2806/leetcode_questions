// Last updated: 2/10/2026, 3:15:19 PM
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int[][] dist=new int[m][n];
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    dist[i][j]=0;
                    q.offer(new int[]{i,j});
                }else{
                    dist[i][j]=Integer.MAX_VALUE;
                }
            }
        }
        while(!q.isEmpty()){
            int[] curr=q.poll();
            int[] dx={-1,1,0,0};
            int[] dy={0,0,-1,1};
            for(int k=0;k<4;k++){
                int nr=curr[0]+dx[k];
                int nc=curr[1]+dy[k];
                if(nr>=0 && nc>=0 && nr<m && nc<n){
                    if(dist[nr][nc]>dist[curr[0]][curr[1]]+1){
                        dist[nr][nc]=dist[curr[0]][curr[1]]+1;
                        q.offer(new int[]{nr,nc});
                    }
                }
            }
        }
        return dist;
    }
}