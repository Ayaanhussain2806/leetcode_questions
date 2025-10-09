// Last updated: 10/9/2025, 11:59:03 PM
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