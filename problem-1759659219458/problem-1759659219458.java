// Last updated: 10/5/2025, 3:43:39 PM
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int max=Integer.MAX_VALUE;
        for(int k=0;k<=nums.length-3;k++){
            int i=k+1;
            int j=nums.length-1;
            while(i<j){
                int sum=nums[k]+nums[i]+nums[j];
                if(Math.abs(target-sum)<Math.abs(target-max)){
                    max=sum;
                }
                if(sum<target){
                    i++;
                }else{
                    j--;
                }
            }
        }
        return max;
    }
}