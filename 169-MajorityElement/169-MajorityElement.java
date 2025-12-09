// Last updated: 12/9/2025, 6:45:33 PM
1class Solution {
2    public int majorityElement(int[] nums) {
3        Arrays.sort(nums);
4        return nums[nums.length/2];
5    }
6}