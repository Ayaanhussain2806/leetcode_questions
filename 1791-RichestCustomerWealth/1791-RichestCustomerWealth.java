// Last updated: 2/10/2026, 3:13:02 PM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[0].length;j++){
                sum+=accounts[i][j];
            }
            ans=Math.max(sum,ans);
            sum=0;
        }
        return ans;
    }
}