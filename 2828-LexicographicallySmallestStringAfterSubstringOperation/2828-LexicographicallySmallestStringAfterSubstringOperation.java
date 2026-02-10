// Last updated: 2/10/2026, 3:11:19 PM
class Solution {
    public String smallestString(String s) {
        char[] arr=s.toCharArray();
        int n=s.length();
        int i=0;
        while(i<n && s.charAt(i)=='a'){
            i++;
        }
        if(i==n){
            arr[n-1]='z';
            return String.valueOf(arr);
        }
        while(i<n && s.charAt(i)!='a'){
            arr[i]--;
            i++;
        }
        return String.valueOf(arr);
    }
}