// Last updated: 2/10/2026, 3:10:51 PM
class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        Arrays.fill(ans, -1);
        if (k == 1) return nums;
        int cnt = 0;
        for (int i = 0; i < k - 1; i++) {
            if (nums[i + 1] == nums[i] + 1)
                cnt++;
        }
        if (cnt == k - 1)
            ans[0] = nums[k - 1];
        for (int i = 1; i + k <= n; i++) {

            if (nums[i] == nums[i - 1] + 1)
                cnt--;
            if (nums[i + k - 1] == nums[i + k - 2] + 1)
                cnt++;

            if (cnt == k - 1)
                ans[i] = nums[i + k - 1];
        }

        return ans;
    }
}