// Last updated: 2/10/2026, 3:15:18 PM
class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> map=new ArrayList<>();
        for(int i=0;i<isConnected.length;i++){
            map.add(new ArrayList<>());
        }
        for(int i = 0; i < isConnected.length; i++){
    for(int j = 0; j < isConnected.length; j++){
        if(isConnected[i][j] == 1 && i != j){
            map.get(i).add(j);
        }
    }
}
        int count=0;
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> visited=new HashSet<>();
        for(int src=0;src<isConnected.length;src++){
            if(visited.contains(src)){
                continue;
            }
            count++;
            q.add(src);
            while(!q.isEmpty()){
                int r=q.poll();
                if(visited.contains(r)){
                    continue;
                }
                visited.add(r);
                for(int nbrs:map.get(r)){
                    if(!visited.contains(nbrs)){
                        q.add(nbrs);
                    }
                }
            }
        }
        return count;
    }
}