// Last updated: 2/10/2026, 3:14:30 PM
class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int l=0;
        int r=tokens.length-1;
        int score=0;
        int max=0;
        while(l<=r){
            if(tokens[l]<=power){
                power-=tokens[l];
                score++;
                l++;
                max=Math.max(score,max);
            }else if(score>=1){
                power+=tokens[r];
                score--;
                r--;
            }else{
                return max;
            }
        }
        return max;
    }
}