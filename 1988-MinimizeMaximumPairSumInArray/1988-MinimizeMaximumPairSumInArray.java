// Last updated: 2/10/2026, 3:12:39 PM
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length/2;i++){
            sum+=nums[i]+nums[nums.length-1-i];
            max=Math.max(sum,max);
            sum=0;
        }
        return max;
    }
}