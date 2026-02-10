// Last updated: 2/10/2026, 3:12:17 PM
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<tickets.length;i++){
            q.offer(i);
        }
        int time=0;
        while(!q.isEmpty()){
            time++;
            int start=q.poll();
            tickets[start]--;
            if(tickets[start]!=0){
                q.offer(start);
            }else{
                if(start==k){
                    return time;
                }
            }
        }
        return time;
    }
}