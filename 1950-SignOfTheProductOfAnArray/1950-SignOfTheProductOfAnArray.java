// Last updated: 2/10/2026, 3:12:47 PM
class Solution {
    public int arraySign(int[] nums) {
        int sign=1;
        for(int n:nums){
            if(n==0){
                return 0;
            }
            if(n<0){
                sign=-sign;
            }
        }
        return sign;
    }
}