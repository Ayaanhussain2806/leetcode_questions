// Last updated: 2/10/2026, 3:10:23 PM
class Solution {
    public int alternatingSum(int[] nums) {
        // if(nums.length==1){
        //     return nums;
        // }
        int sumE=0,sumO=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                sumE+=nums[i];
            }else{
                sumO+=nums[i];
            }
        }
        return sumE-sumO;
    }
}