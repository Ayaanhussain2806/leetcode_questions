// Last updated: 11/27/2025, 12:02:26 AM
1class Solution {
2    public int alternatingSum(int[] nums) {
3        // if(nums.length==1){
4        //     return nums;
5        // }
6        int sumE=0,sumO=0;
7        for(int i=0;i<nums.length;i++){
8            if(i%2==0){
9                sumE+=nums[i];
10            }else{
11                sumO+=nums[i];
12            }
13        }
14        return sumE-sumO;
15    }
16}