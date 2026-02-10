// Last updated: 2/10/2026, 3:11:15 PM
import java.util.*;

class Solution {
    public int minAbsoluteDifference(List<Integer> nums, int x) {
        if (x == 0) return 0;

        TreeSet<Integer> set = new TreeSet<>();
        int ans = Integer.MAX_VALUE;

        for (int i = x; i < nums.size(); i++) {
            set.add(nums.get(i - x));

            Integer floor = set.floor(nums.get(i));
            Integer ceil = set.ceiling(nums.get(i));

            if (floor != null) {
                ans = Math.min(ans, Math.abs(nums.get(i) - floor));
            }
            if (ceil != null) {
                ans = Math.min(ans, Math.abs(nums.get(i) - ceil));
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
