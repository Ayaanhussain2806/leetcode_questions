// Last updated: 8/7/2025, 11:38:57 AM
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=n-1;
        int num=1;
        while(top<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                matrix[left][i]=num++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                matrix[i][right]=num++;
            }
            right--;
            for(int i=right;i>=left;i--){
                matrix[bottom][i]=num++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                matrix[i][left]=num++;
            }
            left++;
        }
        return matrix;
    }
}