// Last updated: 9/24/2025, 2:07:15 AM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double ans=sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[i-k];
            ans=Math.max(ans,sum);
        }
        return ans/k;
    }
}