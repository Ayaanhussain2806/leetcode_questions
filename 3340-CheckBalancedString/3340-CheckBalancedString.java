// Last updated: 10/1/2025, 3:27:43 PM
class Solution {
    public boolean isBalanced(String num) {
        int s1=0;
        int s2=0;
        for(int i=0;i<num.length();i++){
            if(i%2!=0){
                int c=num.charAt(i);
                s1+=c-'0';
            }else{
                int d=num.charAt(i);
                s2+=d-'0';
            }
        }
        if(s1==s2){
            return true;
        }
        return false;
    }
}