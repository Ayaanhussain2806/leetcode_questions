// Last updated: 2/10/2026, 3:11:49 PM
class Solution {
    public int edgeScore(int[] edges) {
        long[] score=new long[edges.length];
        for(int i=0;i<score.length;i++){
            score[edges[i]]+=i;
        }
        int ans=0;
        for(int i=1;i<score.length;i++){
            if(score[i]>score[ans]){
                ans=i;
            }
        }
        return ans;
    }
}