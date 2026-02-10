// Last updated: 2/10/2026, 3:14:27 PM
class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> q=new LinkedList<>();
        Arrays.sort(deck);
        for(int i=0;i<deck.length;i++){
            q.offer(i);
        }
        int[] ans=new int[deck.length];
        for(int x:deck){
            int front=q.poll();
            ans[front]=x;
            if(!q.isEmpty()){
                q.offer(q.poll());
            }
        }
        return ans;
    }
}