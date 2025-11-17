// Last updated: 11/18/2025, 12:04:27 AM
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