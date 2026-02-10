// Last updated: 2/10/2026, 3:14:33 PM
class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr=s.toCharArray();
        StringBuilder ans=new StringBuilder();
        for(char c:arr){
            if(Character.isLetter(c)){
                ans.append(c);
            }
        }
        ans.reverse();
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(Character.isLetter(arr[i])){
                arr[i]=ans.charAt(idx);
                idx++;
            }
        }
        return new String(arr);
    }
}