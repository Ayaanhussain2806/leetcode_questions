// Last updated: 2/10/2026, 3:12:44 PM
class Solution {
    public boolean checkIfPangram(String sentence) {
        
        int[] freq=new int[26];
        Arrays.fill(freq,0);
        for(int i=0;i<sentence.length();i++){
            int ch=sentence.charAt(i)-'a';
            freq[ch]++;
        }
        for(int count:freq){
            if(count==0){
                return false;
            }
        }
        return true;
    }
}