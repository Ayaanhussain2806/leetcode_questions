// Last updated: 2/10/2026, 3:14:52 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        String fina = s+s;
        if(fina.contains(goal) && s.length()==goal.length()){
            return true;
        }
        return false;
    }
}