// Last updated: 2/10/2026, 3:13:28 PM
class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge:prerequisites){
            graph.get(edge[0]).add(edge[1]);
        }
        List<Boolean> ans=new ArrayList<>();
        for(int[] edge:queries){
            ans.add(possible(graph,edge[0],edge[1]));
        }
        return ans;
    }
    public boolean possible(List<List<Integer>> graph,int src,int des){
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> visited=new HashSet<>();
        q.add(src);
        while(!q.isEmpty()){
            int r=q.poll();
            if(visited.contains(r)){
                continue;
            }
            visited.add(r);
            if(r==des){
                return true;
            }
            for(int nbrs:graph.get(r)){
                if(!visited.contains(nbrs)){
                    q.add(nbrs);
                }
            }
        }
        return false;
    }
}