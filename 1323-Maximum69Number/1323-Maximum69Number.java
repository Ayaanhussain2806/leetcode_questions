// Last updated: 10/6/2025, 1:20:04 PM
class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        int[][] memo = new int[n][n];
        // Initialize with a special value to indicate "uncomputed"
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                memo[i][j] = Integer.MIN_VALUE;
            }
        }
        return helper(nums, 0, n - 1, memo) >= 0;
    }

    private int helper(int[] nums, int i, int j, int[][] memo) {
        if (i == j) return nums[i];
        if (memo[i][j] != Integer.MIN_VALUE) return memo[i][j];

        int pickLeft = nums[i] - helper(nums, i + 1, j, memo);
        int pickRight = nums[j] - helper(nums, i, j - 1, memo);

        memo[i][j] = Math.max(pickLeft, pickRight);
        return memo[i][j];
    }
}
