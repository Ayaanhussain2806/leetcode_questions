// Last updated: 12/2/2025, 3:39:20 AM
1class Solution {
2    public int trap(int[] height) {
3        return trapping(height);
4    }public static int trapping(int[] height){
5        int n=height.length;
6        int[] left=new int[n];
7        int[] right=new int[n];
8        left[0]=height[0];
9        for(int i=1;i<n;i++){
10            left[i]=Math.max(left[i-1],height[i]);
11        }
12        right[n-1]=height[n-1];
13        for(int i=n-2;i>=0;i--){
14            right[i]=Math.max(right[i+1],height[i]);
15        }
16        int sum=0;
17        for(int i=0;i<n;i++){
18            sum+=Math.min(left[i],right[i])-height[i];
19        }
20        return sum;
21    }
22}