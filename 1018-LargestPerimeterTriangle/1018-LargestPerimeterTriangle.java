// Last updated: 2/10/2026, 3:14:22 PM
class Solution {
    public int largestPerimeter(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        int max=0;
        for(int i=nums.length-1;i>=2;i--){
            if(nums[i]<nums[i-1]+nums[i-2]){
                ans=nums[i]+nums[i-1]+nums[i-2];
                max=Math.max(ans,max);
            }
        }
        return max;
    }
}