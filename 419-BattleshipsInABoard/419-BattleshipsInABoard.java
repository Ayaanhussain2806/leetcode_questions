// Last updated: 2/10/2026, 3:15:43 PM
class Solution {
    public int countBattleships(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='X'){
                    boolean top = (i>0 && board[i-1][j]=='X');
                    boolean left = (j>0 && board[i][j-1]=='X');
                    if(!top && !left ){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}