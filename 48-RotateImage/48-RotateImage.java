// Last updated: 9/29/2025, 3:06:26 PM
class Solution {
    public int[] shortestToChar(String s, char c) {
        int count=0;
        int[] answer=new int[s.length()];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                count++;
            }
        }
        int[] ans=new int[count];
        int k=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                ans[k]=i;
                k++;
            }
        }
        int sum=0;
        for(int i=0;i<s.length();i++){
            int ar=Integer.MAX_VALUE;
            for(int j=0;j<count;j++){
                sum=Math.abs(ans[j]-i);
                ar=Math.min(ar,sum);
            }
            answer[i]=ar;
        }
        return answer;
    }
}