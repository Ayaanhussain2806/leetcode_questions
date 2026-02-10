// Last updated: 2/10/2026, 3:15:55 PM
class Solution {
    public int lastRemaining(int n) {
        if(n==1) return 1;
        return 2*(1+n/2-lastRemaining(n/2));
    }
}