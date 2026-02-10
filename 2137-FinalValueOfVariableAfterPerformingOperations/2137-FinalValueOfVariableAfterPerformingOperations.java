// Last updated: 2/10/2026, 3:12:23 PM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X=0;
        for(String op:operations){
            if(op.equals("--X") || op.equals("X--")){
                X--;
            }else{
                X++;
            }
        }
        return X;
    }
}