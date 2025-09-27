// Last updated: 9/27/2025, 10:58:02 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        int odd=1;
        while(num>0){
            num-=odd;
            odd+=2;
        }
        return num==0;
    }
}