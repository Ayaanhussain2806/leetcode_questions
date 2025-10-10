// Last updated: 10/10/2025, 9:00:39 PM
class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i+1;j<nums.length;j++){
                sum=(nums[i]-1)*(nums[j]-1);
                max=Math.max(sum,max);
            }
        }
        return max;
    }
}