// Last updated: 8/7/2025, 11:36:56 AM
class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        int ans=0,si=0,ei=0,p=1;
        while(ei<arr.length){
            //grow
            p=p*arr[ei];
            //shrink
            while(p>=k && si<=ei){
                p=p/arr[si];
                si++;
            }
            //ans update
            ans=ans+(ei-si+1);
            ei++;
        }
        return ans;
    }
}