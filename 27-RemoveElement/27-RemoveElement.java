// Last updated: 11/18/2025, 11:37:04 PM
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