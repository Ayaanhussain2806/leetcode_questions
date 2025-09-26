// Last updated: 9/26/2025, 9:55:22 PM
class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] indegree=new int[n+1];
        for(int[] arr:trust){
            int a=arr[0];
            int b=arr[1];
            indegree[a]--;
            indegree[b]++;
        }
        for(int i=1;i<=n;i++){
            if(indegree[i]==n-1){
                return i;
            }
        }
        return -1;
    }
}