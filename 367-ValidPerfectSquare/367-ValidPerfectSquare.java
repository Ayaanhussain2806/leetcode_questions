// Last updated: 9/27/2025, 11:08:56 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        int a =(int) Math.sqrt(num);
        if(a*a==num) {
            return true;
        }
        return false;
        
    }
}