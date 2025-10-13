// Last updated: 10/13/2025, 9:32:44 PM
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        for(int k=0;k<nums.length;k++){
            int i=k+1;
            int j=nums.length-1;
            while(i<j){
                int sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(target-sum)<Math.abs(target-min)){
                    min=sum;
                }
                if(target>sum){
                    i++;
                }else{
                    j--;
                }
            }
        }
        return min;
    }
}