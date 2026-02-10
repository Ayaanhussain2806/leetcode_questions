// Last updated: 2/10/2026, 3:12:07 PM
class Solution {
    public int[] countRectangles(int[][] rectangles, int[][] points) {
        List<Integer>[] height = new ArrayList[101];
        for (int i = 0; i <= 100; i++) {
            height[i] = new ArrayList<>();
        }
        for (int[] r : rectangles) {
            height[r[1]].add(r[0]);
        }
        for (int i = 0; i <= 100; i++) {
            Collections.sort(height[i]);
        }

        int[] result = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];
            int count = 0;
            for (int h = y; h <= 100; h++) {
                List<Integer> widths = height[h];
                if (widths.size() == 0) continue;
                int idx = Collections.binarySearch(widths, x);
                if (idx < 0) idx = -idx - 1;
                count += widths.size() - idx;
            }
            result[i] = count;
        }
        return result;
    }
}
