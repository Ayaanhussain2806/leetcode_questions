// Last updated: 8/7/2025, 11:36:22 AM
class Solution {
    public int numberOfMatches(int n) {
        int sum=0;
        while(n>0){
            if(n==1){
                break;
            }
            if(n%2==0){
                n=n/2;
                sum+=n;
            }
            else{
                n=(n-1)/2;
                sum+=n+1;
            }
        }
        return sum;
    }
}