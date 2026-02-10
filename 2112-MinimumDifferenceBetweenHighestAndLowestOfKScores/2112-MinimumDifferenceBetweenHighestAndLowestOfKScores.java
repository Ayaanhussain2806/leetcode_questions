// Last updated: 2/10/2026, 3:12:31 PM
class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        if(nums.length==1) return 0;
        for(int i=0;i<nums.length-k+1;i++){
            min=Math.min(min,nums[i+k-1]-nums[i]);
        }
        return min;
    }
}