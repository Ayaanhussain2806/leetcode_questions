// Last updated: 2/10/2026, 3:12:43 PM
class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int x1=XO(arr1);
        int x2=XO(arr2);
        int ans= x1 & x2;
        return ans;
    }
    public static int XO(int[] arr){
        int s=0;
        for(int v:arr){
            s^=v;
        }
        return s;
    }
}