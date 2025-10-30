// Last updated: 10/30/2025, 11:37:50 PM
class Solution {
    public String smallestNumber(String pattern) {
        return Construct(pattern);
    }
    public static String Construct(String s){
        int c=1;
        int n=s.length();
        int[] ans=new int[n+1];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<=n;i++){
            if(i==n || s.charAt(i)=='I'){
                ans[i]=c;
                c++;
                while(!st.isEmpty()){
                    ans[st.pop()]=c;
                    c++;
                }
            }else{
                st.push(i);
            }
        }
        String str="";
        for(int i=0;i<ans.length;i++){
            str+=ans[i];
        }
        return str;
    }
}