// Last updated: 10/2/2025, 3:47:42 PM
class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int[] arr=new int[26];
        Arrays.fill(arr,-1);
            for(int i=0;i<s.length();i++){
                int ch=s.charAt(i)-'a';
                if(arr[ch]==-1){
                    arr[ch]=i;
                }else{
                    int dist=i-arr[ch]-1;
                    if(dist!=distance[ch]){
                        return false;
                    }
                }
            }
        return true;
    }
}