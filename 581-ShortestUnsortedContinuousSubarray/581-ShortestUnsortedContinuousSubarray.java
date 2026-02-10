// Last updated: 2/10/2026, 3:15:12 PM
class Solution {
    public int findUnsortedSubarray(int[] nums) {
         int left=-1;
         int right=-1;
         int minseen=nums[nums.length-1];
         int maxseen=nums[0];
         for(int i=1;i<nums.length;i++){
            maxseen=Math.max(nums[i],maxseen);
            if(nums[i]<maxseen){
                right=i;
            }
         }
         for(int i=nums.length-2;i>=0;i--){
            minseen=Math.min(minseen,nums[i]);
            if(nums[i]>minseen){
                left=i;
            }
         }
         if(right==-1) return 0;
         return right-left+1;
    }
}