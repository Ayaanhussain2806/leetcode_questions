// Last updated: 10/2/2025, 4:32:25 PM
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