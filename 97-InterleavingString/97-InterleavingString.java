// Last updated: 8/7/2025, 11:38:39 AM
public class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() == 0 || s1 == null) {
            return s2.equals(s3);
        }

        if (s2.length() == 0 || s2 == null) {
            return s1.equals(s3);
        }

        // @note: missed this simple check
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }

        // 1-to-i of s1, and 1-to-j of s2, can for 1-to-(i+j) of s3
        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1]; // +1 for empty string

        dp[0][0] = true;

        // pre-process for empty string case
        for (int i = 1; i < s1.length() + 1; i++) {
            dp[i][0] = (s1.charAt(i - 1) == s3.charAt(i - 1))
                && dp[i - 1][0];
        }
        for (int i = 1; i < s2.length() + 1; i++) {
            dp[0][i] = (s2.charAt(i - 1) == s3.charAt(i - 1))
                && dp[0][i - 1];
        }

        for (int i = 1; i < s1.length() + 1; i++) {
            for (int j = 1; j < s2.length() + 1; j++) {

                boolean withS1 = s1.charAt(i - 1) == s3.charAt(i - 1 + j) && dp[i - 1][j];
                boolean withS2 = s2.charAt(j - 1) == s3.charAt(i - 1 + j) && dp[i][j - 1];

                dp[i][j] = withS1 || withS2;
            }
        }

        return dp[s1.length()][s2.length()];
    }
}