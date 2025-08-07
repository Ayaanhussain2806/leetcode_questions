// Last updated: 8/7/2025, 11:39:39 AM
class Solution {
    public int reverse(int x) {
        int r=0;
        while(x>0 || x<0){
            int d=x%10;
            if((r>Integer.MAX_VALUE/10) || (r<Integer.MIN_VALUE/10)){
                return 0;
            }
            r=r*10+d;
            x=x/10;
        }
        return r;
    }
}