// Last updated: 2/10/2026, 3:14:48 PM
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                if(!st.isEmpty()) st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        Stack<Character> stx=new Stack<>();
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#'){
                if(!stx.isEmpty()) stx.pop();
            }else{
                stx.push(t.charAt(i));
            }
        }
        return st.equals(stx);
    }
}