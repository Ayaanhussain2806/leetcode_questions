// Last updated: 2/10/2026, 3:14:02 PM
class Solution {
    public String alphabetBoardPath(String target) {
        int cC=0;
        int cR=0;
        StringBuilder sb=new StringBuilder();
        for(char ch:target.toCharArray()){
            int tC=(ch-'a')%5;
            int tR=(ch-'a')/5;
            while(cR>tR){
                sb.append('U');
                cR--;
            }
            while(cC>tC){
                sb.append('L');
                cC--;
            }
            while(cR<tR){
                sb.append('D');
                cR++;
            }
            while(cC<tC){
                sb.append('R');
                cC++;
            }
            sb.append('!');
        }
        return sb.toString();
    }
}