// Last updated: 2/10/2026, 3:11:32 PM
class Solution {
    public long makeSubKSumEqual(int[] arr, int k) {
        int n = arr.length;
        boolean[] visited = new boolean[n];
        long ans = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            List<Integer> cycle = new ArrayList<>();
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                cycle.add(arr[j]);
                j = (j + k) % n;
            }

            Collections.sort(cycle);
            int m = cycle.size();
            int median = cycle.get(m / 2);

            for (int val : cycle) {
                ans += Math.abs(val - median);
            }
        }

        return ans;
    }
}
