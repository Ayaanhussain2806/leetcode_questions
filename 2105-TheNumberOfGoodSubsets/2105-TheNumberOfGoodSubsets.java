// Last updated: 2/10/2026, 3:12:34 PM
class Solution {
    static final int MOD = 1_000_000_007;

    public int numberOfGoodSubsets(int[] nums) {
        int[] count = new int[31];
        for (int num : nums) count[num]++;

        int[] primes = {2,3,5,7,11,13,17,19,23,29};
        int[] mask = new int[31];

        for (int i = 2; i <= 30; i++) {
            int x = i;
            boolean valid = true;
            int m = 0;
            for (int j = 0; j < 10; j++) {
                int p = primes[j];
                int cnt = 0;
                while (x % p == 0) {
                    x /= p;
                    cnt++;
                }
                if (cnt > 1) {
                    valid = false;
                    break;
                }
                if (cnt == 1) m |= (1 << j);
            }
            if (valid) mask[i] = m;
        }

        long[] dp = new long[1 << 10];
        dp[0] = 1;

        for (int i = 2; i <= 30; i++) {
            if (count[i] == 0 || mask[i] == 0) continue;
            long[] next = dp.clone();
            for (int m = 0; m < (1 << 10); m++) {
                if ((m & mask[i]) == 0) {
                    next[m | mask[i]] =
                        (next[m | mask[i]] + dp[m] * count[i]) % MOD;
                }
            }
            dp = next;
        }

        long ans = 0;
        for (int m = 1; m < (1 << 10); m++) {
            ans = (ans + dp[m]) % MOD;
        }

        long pow = 1;
        for (int i = 0; i < count[1]; i++) {
            pow = (pow * 2) % MOD;
        }

        return (int)((ans * pow) % MOD);
    }
}
