// Last updated: 8/7/2025, 11:37:54 AM
class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int actual_sum=(nums.length*(nums.length+1))/2;
        int n=actual_sum-sum;
        return n;
    }
    
}