// Last updated: 8/7/2025, 11:36:02 AM
class Solution {
    public int sumOfSquares(int[] nums) {
        int sum=0;
        int y=nums.length;
        for(int i=1;i<=nums.length;i++){
            if(y%i==0){
                sum+=nums[i-1]*nums[i-1];
            }
        }
        return sum;
    }
}