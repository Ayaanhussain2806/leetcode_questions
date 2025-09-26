// Last updated: 9/26/2025, 8:46:35 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean ans=false;
        for(int i=1;i<nums.length;i++){
                if(nums[i]==nums[i-1]){
                    ans = true;
                }
            }
        return ans;
    }
}