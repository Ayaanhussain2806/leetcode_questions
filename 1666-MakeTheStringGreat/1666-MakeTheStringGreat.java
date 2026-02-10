// Last updated: 2/10/2026, 3:13:15 PM
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