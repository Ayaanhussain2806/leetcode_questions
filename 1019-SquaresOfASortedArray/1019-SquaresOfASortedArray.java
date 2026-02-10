// Last updated: 2/10/2026, 3:14:21 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans=new int[nums.length];
        int n=nums.length;
        int l=0;
        int r=nums.length-1;
        int idx=n-1;
        while(l<=r){
            int left=nums[l]*nums[l];
            int right=nums[r]*nums[r];
            if(left>right){
                ans[idx]=left;
                idx--;
                l++;
            }
            else{
                ans[idx]=right;
                idx--;
                r--;
            }
        }
        return ans;
    }
}