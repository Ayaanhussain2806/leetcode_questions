// Last updated: 9/27/2025, 12:03:28 AM
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int max=Integer.MAX_VALUE;
        for(int k=0;k<=nums.length-3;k++){
            int i=k+1;
            int j=nums.length-1;
            while(i<j){
                int sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(target-sum)<Math.abs(target-max)){
                    max=sum;
                }
                if(target>sum){
                    i++;
                }else{
                    j--;
                }
            }
        }
        return max;
    }
}