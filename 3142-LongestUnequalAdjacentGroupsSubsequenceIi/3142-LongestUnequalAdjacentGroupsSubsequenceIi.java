// Last updated: 2/10/2026, 3:11:14 PM
import java.util.*;

class Solution {
    public List<String> getWordsInLongestSubsequence(String[] words, int[] groups) {
        int n = words.length;
        int[] dp = new int[n];
        int[] parent = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(parent, -1);

        int bestLen = 1;
        int bestEnd = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {

                if (groups[i] == groups[j]) continue;

                if (!diffByOne(words[i], words[j])) continue;

                if (dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    parent[i] = j;
                }
            }

            if (dp[i] > bestLen) {
                bestLen = dp[i];
                bestEnd = i;
            }
        }

        LinkedList<String> ans = new LinkedList<>();
        int cur = bestEnd;
        while (cur != -1) {
            ans.addFirst(words[cur]);
            cur = parent[cur];
        }

        return ans;
    }

    private boolean diffByOne(String a, String b) {
        if (a.length() != b.length()) return false;
        int diff = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) diff++;
            if (diff > 1) return false;
        }
        return diff == 1;
    }
}
