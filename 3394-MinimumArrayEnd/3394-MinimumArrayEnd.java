// Last updated: 2/10/2026, 3:10:59 PM
class Solution {
    public long minEnd(int n, int x) {
        long ans = x;
        long add = n - 1;
        long bit = 1;

        while (add > 0) {
            if ((ans & bit) == 0) {
                if ((add & 1) == 1) {
                    ans |= bit;
                }
                add >>= 1;
            }
            bit <<= 1;
        }
        return ans;
    }
}
