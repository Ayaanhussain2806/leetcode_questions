// Last updated: 2/10/2026, 3:11:02 PM
import java.util.*;

class Solution {
    public int maxOperations(int[] nums) {
        int n = nums.length;
        if (n < 2) return 0;

        int ans = 0;

        ans = Math.max(ans, 1 + solve(nums, 2, n - 1, nums[0] + nums[1]));
        ans = Math.max(ans, 1 + solve(nums, 0, n - 3, nums[n - 2] + nums[n - 1]));
        ans = Math.max(ans, 1 + solve(nums, 1, n - 2, nums[0] + nums[n - 1]));

        return ans;
    }

    private int solve(int[] nums, int l, int r, int target) {
        int n = nums.length;
        int[][] memo = new int[n][n];
        for (int[] row : memo) Arrays.fill(row, -1);

        return dfs(nums, l, r, target, memo);
    }

    private int dfs(int[] nums, int l, int r, int target, int[][] memo) {
        if (l >= r) return 0; 

        if (memo[l][r] != -1) return memo[l][r];

        int best = 0;

        if (l + 1 <= r && nums[l] + nums[l + 1] == target) {
            best = Math.max(best, 1 + dfs(nums, l + 2, r, target, memo));
        }

        if (r - 1 >= l && nums[r] + nums[r - 1] == target) {
            best = Math.max(best, 1 + dfs(nums, l, r - 2, target, memo));
        }

        if (nums[l] + nums[r] == target) {
            best = Math.max(best, 1 + dfs(nums, l + 1, r - 1, target, memo));
        }

        return memo[l][r] = best;
    }
}
