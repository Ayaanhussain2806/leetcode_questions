// Last updated: 10/4/2025, 1:41:19 PM
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ll=new ArrayList<>();
        solve(n,0,0,"",ll);
        return ll;

    }
    public static void solve(int n,int open,int close, String ans,List<String> ll){
        if(open==n && close==n){
            ll.add(ans);
            return ;
        }
        if(open>n || close>open){
            return ;
        }
        solve(n,open+1,close,ans+"(",ll);
        solve(n,open,close+1,ans+")",ll);
    }
}