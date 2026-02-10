// Last updated: 2/10/2026, 3:14:26 PM
class Solution {
    public int minDeletionSize(String[] strs) {
        int rows = strs.length;
        int cols = strs[0].length();
        boolean[] sorted = new boolean[rows - 1];
        int deleteCount = 0;

        for (int col = 0; col < cols; col++) {
            boolean needDelete = false;
            for (int i = 0; i < rows - 1; i++) {
                if (!sorted[i] && strs[i].charAt(col) > strs[i + 1].charAt(col)) {
                    needDelete = true;
                    break;
                }
            }
            if (needDelete) {
                deleteCount++;
                continue;
            }
            for (int i = 0; i < rows - 1; i++) {
                if (!sorted[i] && strs[i].charAt(col) < strs[i + 1].charAt(col)) {
                    sorted[i] = true;
                }
            }
        }
        return deleteCount;
    }
}
