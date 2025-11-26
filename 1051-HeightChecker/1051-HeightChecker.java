// Last updated: 11/26/2025, 11:56:48 PM
1class Solution {
2    public int heightChecker(int[] heights) {
3        int[] expected=new int[heights.length];
4        for(int i=0;i<expected.length;i++){
5            expected[i]=heights[i];
6        }
7        int c=0;
8        Arrays.sort(expected);
9        for(int i=0;i<expected.length;i++){
10            if(expected[i]!=heights[i]){
11                c++;
12            }
13        }
14        return c;
15    }
16}