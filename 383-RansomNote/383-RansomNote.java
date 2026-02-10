// Last updated: 2/10/2026, 3:15:53 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq=new int[26];
        for(char c:magazine.toCharArray()){
            freq[c-'a']++;
        }
        for(char c:ransomNote.toCharArray()){
            if(freq[c-'a']==0) return false;
            freq[c-'a']--;
        }
        return true;
    }
}