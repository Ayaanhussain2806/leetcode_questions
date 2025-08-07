// Last updated: 8/7/2025, 11:37:33 AM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
                boolean[] s = new boolean[1001];
        for (int x : nums1) {
            s[x] = true;
        }
        List<Integer> ans = new ArrayList<>();
        for (int x : nums2) {
            if (s[x]) {
                ans.add(x);
                s[x] = false;
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    
    }
}