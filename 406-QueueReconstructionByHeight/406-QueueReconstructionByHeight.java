// Last updated: 2/10/2026, 3:15:47 PM
class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return b[0] - a[0]; 
        });

        List<int[]> list = new LinkedList<>();
        for (int[] p : people) {
            list.add(p[1], p); 
        }

        return list.toArray(new int[people.length][]);
    }
}