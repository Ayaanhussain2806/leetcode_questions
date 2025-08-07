// Last updated: 8/7/2025, 11:37:14 AM
class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}