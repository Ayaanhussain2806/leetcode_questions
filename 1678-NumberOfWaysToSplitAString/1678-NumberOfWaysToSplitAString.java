// Last updated: 2/10/2026, 3:13:12 PM
class Solution {
    public int numWays(String s) {
        int MOD = 1_000_000_007;
        int n = s.length();
        int ones = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') ones++;
        }
        if (ones % 3 != 0) return 0;
        if (ones == 0) {
            long gaps = n - 1;
            return (int)((gaps * (gaps - 1) / 2) % MOD);
        }
        int each = ones / 3;
        int count = 0;
        long fG = 0, sG = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') count++;
            else {
                if (count == each) fG++;
                else if (count == 2 * each) sG++;
            }
        }
        return (int)(((fG + 1) * (sG + 1)) % MOD);
    }
}
