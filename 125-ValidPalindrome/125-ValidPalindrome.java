// Last updated: 8/7/2025, 11:38:31 AM
class Solution {
    public boolean isPalindrome(String s) {
        String f=s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int i=0;
        int j=f.length()-1;
        while(i<j){
            if(f.charAt(i)!=f.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}