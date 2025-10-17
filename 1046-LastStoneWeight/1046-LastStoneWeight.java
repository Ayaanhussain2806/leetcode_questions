// Last updated: 10/17/2025, 11:42:47 PM
class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> ll=new ArrayList<>();
        for(int s:stones){
            ll.add(s);
        }
        while(ll.size()>1){
            Collections.sort(ll);
            int y=ll.remove(ll.size()-1);
            int x=ll.remove(ll.size()-1);
            if(x!=y){
                ll.add(y-x);
            }
        }
        return ll.isEmpty() ? 0 : ll.get(0);
    }
}