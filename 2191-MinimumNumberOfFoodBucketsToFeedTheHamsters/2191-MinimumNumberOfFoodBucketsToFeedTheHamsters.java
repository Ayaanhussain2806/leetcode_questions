// Last updated: 2/10/2026, 3:12:19 PM
class Solution {
    public int minimumBuckets(String hamsters) {
        char[] s = hamsters.toCharArray();
        int buckets = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == 'H') {
                if (i > 0 && s[i - 1] == 'B') continue;
                if (i + 1 < s.length && s[i + 1] == '.') {
                    s[i + 1] = 'B';
                    buckets++;
                } 
                else if (i > 0 && s[i - 1] == '.') {
                    s[i - 1] = 'B';
                    buckets++;
                } 
                else {
                    return -1;
                }
            }
        }
        return buckets;
    }
}