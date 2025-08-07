// Last updated: 8/7/2025, 11:37:27 AM
class Solution {
    public int firstUniqChar(String s) {
            int [] count=new int[26];
            for(int i=0;i<s.length();i++){
                count[s.charAt(i)-'a']++;
            }
            for(int i=0;i<s.length();i++){
                if(count[s.charAt(i)-'a']==1){
                    return i;
                }
            }
            return -1;
    }
}