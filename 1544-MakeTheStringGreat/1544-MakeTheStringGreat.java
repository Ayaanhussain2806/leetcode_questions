// Last updated: 11/16/2025, 2:42:51 PM
class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(!st.isEmpty() && Math.abs(st.peek()-c)==32){
                st.pop();
            }else{
                st.push(c);
            }
        }
        StringBuilder sc=new StringBuilder();
        for(char c:st){
            sc.append(c);
        }
        return sc.toString();
    }
}