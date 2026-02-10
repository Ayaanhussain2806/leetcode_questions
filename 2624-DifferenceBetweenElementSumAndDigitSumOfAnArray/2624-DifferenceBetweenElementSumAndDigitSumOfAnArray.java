// Last updated: 2/10/2026, 3:11:37 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int som=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            while(n>0){
                som+=n%10;
                n=n/10;
            }
        }
        return Math.abs(sum-som);
    }
}