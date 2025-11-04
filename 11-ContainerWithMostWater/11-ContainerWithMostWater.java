// Last updated: 11/4/2025, 10:41:52 PM
class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int ans=0;
        while(i<j){
            int t=Math.min(height[i],height[j])*(j-i);
            ans=Math.max(t,ans);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
    }
}