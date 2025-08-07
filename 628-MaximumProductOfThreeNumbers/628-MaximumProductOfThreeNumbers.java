// Last updated: 8/7/2025, 11:37:01 AM
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int c= nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        int d= nums[0]*nums[1]*nums[nums.length-1];
        return Math.max(c,d);
    }
}