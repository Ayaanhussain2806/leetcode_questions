// Last updated: 2/10/2026, 3:11:11 PM
class Solution {
    public int findChampion(int n, int[][] edges) {
        // List<List<Integer>> graph=new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     graph.add(new ArrayList<>());
        // }
        int[] indegree=new int[n];
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            // graph.get(u).add(v);
            indegree[v]++;
        }
        int count=0;
        int ans=-1;
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                ans=i;
                count++;
            }
        }
        if(count==1){
            return ans;
        }
        return -1;
    }
}