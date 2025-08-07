// Last updated: 8/7/2025, 11:39:24 AM
class Solution {
    public int removeElement(int[] nums, int val) {
                int k = 0;
        for (int x : nums) {
            if (x != val) {
                nums[k++] = x;
            }
        }
        return k;
    
    }
}