// Last updated: 2/10/2026, 3:10:49 PM
class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int min=Integer.MAX_VALUE;
        int ans=0,x=1;
        while(num1>0 || num2>0 || num3>0){
            int mind=Math.min(num1%10,num2%10);
            min=Math.min(mind,num3%10);
            ans+=x*min;
            x=x*10;
            num1/=10;
            num2/=10;
            num3/=10;
        }
        return ans;
    }
}