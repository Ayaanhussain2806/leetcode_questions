// Last updated: 2/10/2026, 3:14:37 PM
class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] d : dislikes) {
            graph.get(d[0]).add(d[1]);
            graph.get(d[1]).add(d[0]);
        }

        int[] color = new int[n + 1]; 

        for (int i = 1; i <= n; i++) {
            if (color[i] == 0) {
                if (!bfsCheck(i, graph, color)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean bfsCheck(int start, List<List<Integer>> graph, int[] color) {

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        color[start] = 1;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int nbr : graph.get(node)) {
                if (color[nbr] == 0) {
                    color[nbr] = -color[node];
                    q.add(nbr);
                } 
                else if (color[nbr] == color[node]) {
                    return false; 
                }
            }
        }
        return true;
    }
}
