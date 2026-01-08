// Last updated: 1/8/2026, 10:14:25 PM
1class Solution {
2    public boolean rotateString(String s, String goal) {
3        String fina = s+s;
4        if(fina.contains(goal) && s.length()==goal.length()){
5            return true;
6        }
7        return false;
8    }
9}