// Last updated: 10/23/2025, 9:53:23 PM
class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] result=new int[digits.length+1];
        result[0]=1;
        return result;
    }
}