// Last updated: 10/31/2025, 3:24:57 PM
class Solution {
    public String smallestNumber(String pattern) {
        return construct(pattern);
    }
    public static String construct(String s){
        int n=s.length();
        int[] ans=new int[n+1];
        int c=1;
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