// Last updated: 8/7/2025, 11:39:27 AM
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ll = new ArrayList<>();
        GeneratePar(n, 0, 0, "", ll);
        return ll;
    }
     public static void GeneratePar(int n, int open, int close, String ans, List<String> ll) {
        if (open == n && close == n) {
            ll.add(ans);
            return;
        }
        if(open<n){
        GeneratePar(n, open + 1, close, ans + "(",ll);
        }
        if(close<open){
        GeneratePar(n, open, close + 1, ans + ")",ll);
        }
    }
}