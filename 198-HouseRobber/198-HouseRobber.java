// Last updated: 10/31/2025, 3:10:47 PM
class Solution {
    public int rob(int[] arr) {
      int n=arr.length;
     if(n==1){
        return arr[0];
     }
      int [] dp=new int[n];
      Arrays.fill(dp,-1);
      int a= Robber(arr,0,n-1,dp);
      Arrays.fill(dp,-1);
      int b= Robber(arr,1,n,dp);
      return Math.max(a,b);
	}
	public static int Robber(int [] arr,int i,int length,int[] dp) {
		if(i>=length) {
			return 0;
		}
		if(dp[i]!=-1) {
			return dp[i];
		}
		int rob=arr[i]+Robber(arr,i+2,length,dp);
		int Dont_rob=Robber(arr,i+1,length,dp);
		return dp[i]=Math.max(rob, Dont_rob);
    }
}