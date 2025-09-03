// Last updated: 9/4/2025, 12:04:47 AM
class Solution {
    public String reverseWords(String s) {
        return reverse(s);
     }
     public static String reverse(String s){
        s=s.trim();
        String[] arr=s.split("\s+");
        String ans="";
        for(int i=arr.length-1;i>=0;i--){
            ans=ans+arr[i]+" ";
        }
        return ans.trim();
     }
}