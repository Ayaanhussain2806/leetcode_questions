// Last updated: 9/3/2025, 11:35:22 AM
class Solution {
    public int rob(int[] nums) {
        int l=nums.length;
        if(l==0) return 0;
        if(l==1) return nums[0];
        int dp[]=new int[l];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<l;i++){
            int max=nums[i]+dp[i-2];
            dp[i]=Math.max(max,dp[i-1]);
        }
        return dp[l-1];
    }
}