// Last updated: 12/2/2025, 5:14:30 AM
1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3        int oldcolor=image[sr][sc];
4        if(oldcolor==color){
5            return image;
6        }
7        dfs(image,sr,sc,oldcolor,color);
8        return image;
9    }
10    public static void dfs(int[][] image,int i,int j,int oldcolor,int color){
11        if(i<0 || j<0 || i>=image.length || j>=image[0].length || image[i][j]!=oldcolor){
12            return ;
13        }
14        image[i][j]=color;
15        dfs(image,i-1,j,oldcolor,color);
16        dfs(image,i+1,j,oldcolor,color);
17        dfs(image,i,j-1,oldcolor,color);
18        dfs(image,i,j+1,oldcolor,color);
19    }
20}