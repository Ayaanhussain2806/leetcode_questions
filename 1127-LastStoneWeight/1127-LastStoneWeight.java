// Last updated: 2/10/2026, 3:14:08 PM
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int x:stones){
            pq.offer(x);
        }
        while(pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            if(a!=b){
                pq.offer(a-b);
            }
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }
}