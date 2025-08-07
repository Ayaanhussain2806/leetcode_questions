// Last updated: 8/7/2025, 11:37:08 AM
class Solution {
    public boolean checkPerfectNumber(int n) {
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            return true;
        }
        else{
            return false;
        }
    }
}