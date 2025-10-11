// Last updated: 10/11/2025, 9:13:29 PM
class Solution {
    public double minimumAverage(int[] nums) {
        int n=nums.length/2;
        double[] arr=new double[n];
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            arr[i]=(nums[i]+nums[nums.length-i-1])/2.0;
            
            
        }
        Arrays.sort(arr);
        return arr[0];
    }
}