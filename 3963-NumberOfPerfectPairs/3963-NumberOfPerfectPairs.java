// Last updated: 2/10/2026, 3:10:29 PM
import java.util.*;

class Solution {
    public long perfectPairs(int[] nums) {
        int n = nums.length;
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) arr[i] = Math.abs((long) nums[i]);

        Arrays.sort(arr);

        long ans = 0;
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (j < i) j = i;

            while (j + 1 < n && arr[j + 1] <= 2 * arr[i]) {
                j++;
            }

            ans += (j - i); 
        }
        return ans;
    }
}
