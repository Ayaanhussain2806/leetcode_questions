// Last updated: 2/10/2026, 3:11:58 PM
class Solution {
    public int countAsterisks(String s) {
        boolean flag=false;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='|'){
                flag=!flag;
            }
            if(flag==false && s.charAt(i)=='*'){
                 count++;
            }
        }
        return count;
    }
}