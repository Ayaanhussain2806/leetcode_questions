// Last updated: 2/10/2026, 3:11:55 PM
import java.util.*;

class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long k = (long) k1 + k2;

        int maxD = 0;
        for (int i = 0; i < n; i++) {
            maxD = Math.max(maxD, Math.abs(nums1[i] - nums2[i]));
        }

        long[] freq = new long[maxD + 1];
        for (int i = 0; i < n; i++) {
            freq[Math.abs(nums1[i] - nums2[i])]++;
        }

        for (int d = maxD; d > 0 && k > 0; d--) {
            if (freq[d] == 0) continue;

            long move = Math.min(freq[d], k);
            freq[d] -= move;
            freq[d - 1] += move;
            k -= move;

            if (freq[d] > 0) { 
                
            }
        }

        long ans = 0;
        for (int d = 0; d <= maxD; d++) {
            if (freq[d] == 0) continue;
            ans += freq[d] * (long) d * d;
        }
        return ans;
    }
}
