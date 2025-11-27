// Last updated: 11/27/2025, 11:29:26 AM
1class Solution {
2    public int countGoodTriplets(int[] arr, int a, int b, int c) {
3        int count=0;
4        for(int i=0;i<arr.length-2;i++){
5            for(int j=i+1;j<arr.length-1;j++){
6                if(Math.abs(arr[i]-arr[j])>a){
7                    continue;
8                }
9                for(int k=j+1;k<arr.length;k++){
10                    if(Math.abs(arr[j]-arr[k])>b){
11                    continue;
12                }
13                if(Math.abs(arr[i]-arr[k])>c){
14                    continue;
15                }
16                count++;
17                }
18            }
19        }
20        return count;
21    }
22}