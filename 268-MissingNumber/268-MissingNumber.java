// Last updated: 9/17/2025, 3:49:46 PM
class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int actual_sum=0;
        actual_sum=nums.length*(nums.length+1)/2;
        return actual_sum-sum;
    }
}