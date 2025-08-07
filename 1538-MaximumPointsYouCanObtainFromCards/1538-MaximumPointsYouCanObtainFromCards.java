// Last updated: 8/7/2025, 11:36:32 AM
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0;
        int rsum=0;
        int maxsum=0;
        for(int i=0;i<=k-1;i++){
            lsum+=cardPoints[i];
        }
        maxsum=lsum;
        int rightindex=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            lsum-=cardPoints[i];
            rsum+=cardPoints[rightindex];
            maxsum=Math.max(maxsum,lsum+rsum);
            rightindex--;
        }
        return maxsum;
    }
}