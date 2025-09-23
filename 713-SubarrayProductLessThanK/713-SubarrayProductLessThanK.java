// Last updated: 9/23/2025, 3:36:16 PM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        return max_pro(nums,k);
    }
    public static int max_pro(int[] arr,int k){
        int si=0;
        int ei=0;
        int p=1;
        int ans=0;
        while(ei<arr.length){
            p*=arr[ei];
            while(p>=k && si<=ei){
                p/=arr[si];
                si++;
            }
            ans= ans+(ei-si+1);
            ei++;
        }
        return ans;
    }
}