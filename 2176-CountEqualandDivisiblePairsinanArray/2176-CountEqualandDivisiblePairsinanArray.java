// Last updated: 11/29/2025, 10:07:08 PM
1class Solution {
2    public int countPairs(int[] nums, int k) {
3        int count=0;
4        for(int i=0;i<nums.length-1;i++){
5            for(int j=i+1;j<nums.length;j++){
6                if(nums[i]==nums[j] && (i*j)%k==0){
7                    count++;
8                }
9            }
10        }
11        return count;
12    }
13}