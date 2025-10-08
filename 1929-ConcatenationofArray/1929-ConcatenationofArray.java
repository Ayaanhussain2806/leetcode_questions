// Last updated: 10/8/2025, 10:26:23 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int l=nums.length;
        int nl=l+l;
        int[] ans = new int[nl];
        for (int i=0;i<l;i++){
            ans[i]=nums[i];   
        }
        for(int i=nums.length;i<nl;i++){
            ans[i] = nums[i-l];
        }
        return ans;
    }
    
}
