// Last updated: 10/13/2025, 9:48:00 PM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i=0;
        int j=0;
        int p=1;
        int ans=0;
        while(j<nums.length){
            p*=nums[j];
            while(p>=k && i<=j){
                p/=nums[i];
                i++;
            }
            ans=ans+(j-i+1);
            j++;
        }
        return ans;
    }
}