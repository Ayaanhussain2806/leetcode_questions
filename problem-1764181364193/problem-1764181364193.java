// Last updated: 11/26/2025, 11:52:44 PM
1class Solution {
2    public int finalValueAfterOperations(String[] operations) {
3        int X=0;
4        for(String op:operations){
5            if(op.equals("--X") || op.equals("X--")){
6                X--;
7            }else{
8                X++;
9            }
10        }
11        return X;
12    }
13}