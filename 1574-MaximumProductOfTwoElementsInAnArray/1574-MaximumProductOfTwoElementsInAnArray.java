// Last updated: 2/10/2026, 3:13:26 PM
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int i=nums.length-1;
        int j=nums.length-2;
        return (nums[i]-1)*(nums[j]-1);
    }
}