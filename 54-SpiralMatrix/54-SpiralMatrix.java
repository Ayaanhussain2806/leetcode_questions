// Last updated: 8/7/2025, 11:39:03 AM
class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        return Spiral(arr); // Return the result from Spiral
    }

    public static List<Integer> Spiral(int[][] arr) {
        List<Integer> result = new ArrayList<>(); // List to store the spiral order
        int minc = 0, minr = 0, maxc = arr[0].length - 1, maxr = arr.length - 1;
        int te = arr.length * arr[0].length; // Total elements
        int c = 0;
        while (c < te) {
            // Traverse from left to right
            for (int i = minc; i <= maxc && c < te; i++) {
                result.add(arr[minr][i]); // Add element to result list
                c++;
            }
            minr++;

            // Traverse from top to bottom
            for (int i = minr; i <= maxr && c < te; i++) {
                result.add(arr[i][maxc]);
                c++;
            }
            maxc--;

            // Traverse from right to left
            for (int i = maxc; i >= minc && c < te; i--) {
                result.add(arr[maxr][i]);
                c++;
            }
            maxr--;

            // Traverse from bottom to top
            for (int i = maxr; i >= minr && c < te; i--) {
                result.add(arr[i][minc]);
                c++;
            }
            minc++;
        }

        return result; // Return the list of elements in spiral order
    }
}
