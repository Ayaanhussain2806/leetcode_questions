// Last updated: 10/8/2025, 11:11:52 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            arr[i]=sum;
        }
        return arr;
    }
}