// Last updated: 10/8/2025, 9:44:36 PM
class Solution {
    public int[] buildArray(int[] nums) {
         int l=nums.length;
         int[] arr = new int[l];
         for (int i=0;i<l;i++){
            arr[i] = nums[nums[i]];
         }
         return arr;
    }
}