// Last updated: 11/11/2025, 9:37:29 PM
class Solution {
    public boolean isPalindrome(int x) {
        String h=Integer.toString(x);
        int i=0;
        int j=h.length()-1;
        while(i<j){
            if(h.charAt(i)!=h.charAt(j)){
                return false;
            }
            i++;
            j--;
        }       
        return true; 
    }
}