// Last updated: 8/27/2025, 12:20:40 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return Search(matrix,target);
    }
    public static boolean Search(int[][] arr,int item){
        int row=arr.length-1;
        int col=0;
        while(row>=0 && col<arr[0].length){
            if(arr[row][col]==item){
                return true;
            }
            else if(arr[row][col]>item){
                row--;
            }
            else{
                col++;
            }
        }
        return false;
    }
}
