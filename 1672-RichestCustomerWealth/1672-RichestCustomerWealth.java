// Last updated: 9/29/2025, 1:39:25 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int left=mat.length;
        int ans=left/2;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
        }
        for(int i=mat.length-1;i>=0;i--){
            sum+=mat[i][(left-1)-i];
        }
        if(left%2!=0){
            sum-=mat[ans][ans];
        }
        return sum;
    }
}