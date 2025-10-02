// Last updated: 10/2/2025, 10:25:13 PM
class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] f1=new int[26];
        int[] f2=new int[26];
        for(int i=0;i<word1.length();i++){
            int ch=word1.charAt(i)-'a';
            f1[ch]++;
        }
        for(int i=0;i<word2.length();i++){
            int ci=word2.charAt(i)-'a';
            f2[ci]++;
        }
        for(int i=0;i<26;i++){
            if(Math.abs(f1[i]-f2[i])>3){
                return false;
            }
        }
        return true;
    }
}