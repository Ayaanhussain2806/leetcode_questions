// Last updated: 2/10/2026, 3:11:34 PM
class Solution {
    public int distMoney(int money, int children) {
        money=money-children;
        if(money<0){
            return -1;
        }
        int possible=money/7;
        possible=Math.min(possible,children);
        int minM=money-possible*7;
        int minC=children-possible;
        if(minC==1 && minM==3){
            possible--;
        }
        if(minM>0 && children==possible){
            possible--;
        }
        return possible;
    }
}