// Last updated: 10/18/2025, 3:51:19 PM
class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int l=0;
        int r=tokens.length-1;
        int max=0;
        int score=0;
        while(l<=r){
            if(power>=tokens[l]){
                power-=tokens[l];
                score++;
                l++;
                max=Math.max(max,score);
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