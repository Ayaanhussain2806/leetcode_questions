// Last updated: 12/6/2025, 10:46:14 PM
1class Solution {
2    public int threeSumClosest(int[] nums, int target) {
3        Arrays.sort(nums);
4        int min=Integer.MAX_VALUE;
5        for(int k=0;k<nums.length;k++){
6            int i=k+1;
7            int j=nums.length-1;
8            while(i<j){
9                int sum=nums[i]+nums[j]+nums[k];
10                if(Math.abs(target-sum)<Math.abs(target-min)){
11                    min=sum;
12                }
13                if(target>sum){
14                    i++;
15                }else{
16                    j--;
17                }
18            }
19        }
20        return min;
21    }
22}