// Last updated: 8/7/2025, 11:38:07 AM
class Solution {
    public boolean isPowerOfTwo(int n) {

        if(n==1){
            return true;
        }
        if(n==0){
            return false;
        }
        while(n!=1){
            if(n%2!=0){
                return false;
            }
            else{
                n=n/2;
            }
        }
        return true;
    }
}