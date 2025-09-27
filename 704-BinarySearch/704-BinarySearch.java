// Last updated: 9/27/2025, 1:10:43 PM
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int c=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        int d=nums[0]*nums[1]*nums[nums.length-1];
        return Math.max(c,d);
    }
}