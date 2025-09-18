// Last updated: 9/18/2025, 11:13:14 PM
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int max=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]!=max){
                count++;
                max=nums[i];
            }
            if(count==3){
                return max;
            }
        }
        return nums[nums.length-1];
    }
}