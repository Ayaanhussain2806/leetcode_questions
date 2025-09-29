// Last updated: 9/29/2025, 10:31:10 PM
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int minc=0;
        int minr=0;
        int maxc=matrix[0].length-1;
        int maxr=matrix.length-1;
        int te=matrix.length*matrix[0].length;
        int c=0;
        while(c<te){
            for(int i=minc;i<=maxc && c<te;i++){
                ans.add(matrix[minr][i]);
                c++;
            }
            minr++;
            for(int i=minr;i<=maxr && c<te;i++){
                ans.add(matrix[i][maxc]);
                c++;
            }
            maxc--;
            for(int i=maxc;i>=minc && c<te;i--){
                ans.add(matrix[maxr][i]);
                c++;
            }
            maxr--;
            for(int i=maxr;i>=minr&& c<te;i--){
                ans.add(matrix[i][minc]);
                c++;
            }
            minc++;
        }
        return ans;
    }
}