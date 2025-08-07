// Last updated: 8/7/2025, 11:37:40 AM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1){
            return true;
        }
        if(n==0 || n<0){
            return false;
        }
        while(n!=1){
            if(n%3!=0){
                return false;
            }
            else{
                n=n/3;
            }
        }
        return true;
    }
}