// Last updated: 2/10/2026, 3:11:10 PM
class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int minL=Math.min(s1.length(),s2.length());
        int minLen=Math.min(minL,s3.length());
        int count=0;
        for(int i=0;i<minLen;i++){
            if(s1.charAt(i)==s2.charAt(i) && s2.charAt(i)==s3.charAt(i)){
                count++;
            }else{
                break;
            }
        }
        if(count==0){
            return -1;
        }
        return (s1.length()-count)+(s2.length()-count)+(s3.length()-count);
    }
}