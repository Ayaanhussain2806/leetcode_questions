// Last updated: 8/7/2025, 11:38:22 AM
class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String [] arr=s.split("\s+");   
        String ans="";
        for(int i=arr.length-1;i>=0;i--){
            ans=ans+arr[i]+" ";
        }  
        return ans.trim();
     }
}