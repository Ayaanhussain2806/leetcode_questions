// Last updated: 9/24/2025, 3:31:56 PM
class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int si=0;
        int maxL=0;
        int maxV=0;
        for(int ei=0;ei<s.length();ei++){
            freq[s.charAt(ei)-'A']++;
            maxV=Math.max(maxV,freq[s.charAt(ei)-'A']);

            while((ei-si+1)-maxV > k){
                freq[s.charAt(si)-'A']--;
                si++;
            }
            maxL=Math.max(maxL,(ei-si+1));
        }
        return maxL;
    }
}