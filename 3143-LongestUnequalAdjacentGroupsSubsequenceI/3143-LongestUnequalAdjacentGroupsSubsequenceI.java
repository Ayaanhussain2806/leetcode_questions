// Last updated: 2/10/2026, 3:11:12 PM
class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> ans = new ArrayList<>();
        int prevGroup = -1;
        for (int i = 0; i < words.length; i++) {
            if (groups[i] != prevGroup) {
                ans.add(words[i]);
                prevGroup = groups[i];
            }
        }
        return ans;
    }
}