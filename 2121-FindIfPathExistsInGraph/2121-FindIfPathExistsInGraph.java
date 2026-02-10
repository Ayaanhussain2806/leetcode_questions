// Last updated: 2/10/2026, 3:12:27 PM
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> map=new ArrayList<>();
        for(int i=0;i<n;i++){
            map.add(new ArrayList<>());
        }
       for(int[] edge:edges){
        map.get(edge[0]).add(edge[1]);
        map.get(edge[1]).add(edge[0]);
       }
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> visited=new HashSet<>();
        // boolean[] visited=new boolean[n];
        // visited[source]=true;
        q.add(source);
        while(!q.isEmpty()){
            int r=q.poll();
            if(visited.contains(r)){
                continue;
            }
            visited.add(r);
            if(r==destination){
                return true;
            }
            for(int nbrs:map.get(r)){
                if(!visited.contains(nbrs)){
                    // visited[nbrs]=true;
                    q.add(nbrs);
                }
            }
        }
        return false;
    }
}