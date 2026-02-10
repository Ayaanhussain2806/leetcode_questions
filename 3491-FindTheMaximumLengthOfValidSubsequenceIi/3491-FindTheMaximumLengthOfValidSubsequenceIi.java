// Last updated: 2/10/2026, 3:10:52 PM
class Solution {
    public int maximumLength(int[] nums, int k) {
        int[][] dp = new int[k][k];
        int ans = 0;

        for (int x : nums) {
            int r = x % k;

            for (int y = 0; y < k; y++) {
                dp[r][y] = dp[y][r] + 1;
                ans = Math.max(ans, dp[r][y]);
            }
        }

        return ans;
    }
}
