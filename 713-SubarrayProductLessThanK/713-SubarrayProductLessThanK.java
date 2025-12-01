// Last updated: 12/2/2025, 4:12:42 AM
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        int i=0;
4        int j=0;
5        int p=1;
6        int ans=0;
7        while(j<nums.length){
8            p*=nums[j];
9            while(p>=k && i<=j){
10                p=p/nums[i];
11                i++;
12            }
13            ans=ans+(j-i+1);
14            j++;
15        }
16        return ans;
17    }
18}