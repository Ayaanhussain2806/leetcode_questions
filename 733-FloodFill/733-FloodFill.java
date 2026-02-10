// Last updated: 2/10/2026, 3:14:59 PM
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldcolor=image[sr][sc];
        if(oldcolor==color){
            return image;
        }
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{sr,sc});
        image[sr][sc]=color;
        while(!q.isEmpty()){
            int[] curr=q.poll();
            int[] dx={-1,1,0,0};
            int[] dy={0,0,-1,1};
            for(int k=0;k<4;k++){
                int nr=curr[0]+dx[k];
                int nc=curr[1]+dy[k];
                if(nr>=0 && nc>=0 && nr<image.length && nc<image[0].length && image[nr][nc]==oldcolor){
                    image[nr][nc]=color;
                    q.offer(new int[]{nr,nc});
                }
            }
        }
        return image;
    }
}