// Last updated: 10/1/2025, 3:34:45 PM
class Solution {
    public boolean isBalanced(String num) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<num.length();i+=2){
            sum1+=num.charAt(i)-'0';
        }
        for(int j=1;j<num.length();j+=2){
            sum2=sum2+(num.charAt(j)-'0');
        }
        return sum1==sum2;
    }
}