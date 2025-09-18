// Last updated: 9/19/2025, 2:57:09 AM
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int max=nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]==max){
                break;
            }
            else{
                max=nums[i];
            }
        }
        return max;
    }
}