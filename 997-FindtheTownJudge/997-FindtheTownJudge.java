// Last updated: 10/8/2025, 11:32:53 AM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int max=Integer.MAX_VALUE;
        int i=0;
        int j=0;
        int sum=0;
        while(j<nums.length){
            sum+=nums[j];
            while(target<=sum){
                max=Math.min(max,j-i+1);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        return max==Integer.MAX_VALUE ? 0 : max;
    }
}