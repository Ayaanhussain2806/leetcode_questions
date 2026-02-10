// Last updated: 2/10/2026, 3:14:07 PM
class Solution {
    public int heightChecker(int[] heights) {
        int[] expected=new int[heights.length];
        for(int i=0;i<expected.length;i++){
            expected[i]=heights[i];
        }
        int c=0;
        Arrays.sort(expected);
        for(int i=0;i<expected.length;i++){
            if(expected[i]!=heights[i]){
                c++;
            }
        }
        return c;
    }
}