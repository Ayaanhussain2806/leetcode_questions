// Last updated: 2/10/2026, 3:13:10 PM
class Solution {
    public int numSpecial(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int[] oner=new int[m];
        int[] onec=new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    oner[i]++;
                    onec[j]++;
                }
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1 && oner[i]==1 && onec[j]==1){
                    count++;
                }
            }
        }
        return count;
    }
}