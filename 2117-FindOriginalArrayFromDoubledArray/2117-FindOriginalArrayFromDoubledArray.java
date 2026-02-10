// Last updated: 2/10/2026, 3:12:28 PM
class Solution {
    public int[] findOriginalArray(int[] changed) {
        if(changed.length==1) return new int[]{};
        Arrays.sort(changed);
        Queue<Integer> q=new LinkedList<>();
        List<Integer> res=new ArrayList<>();
        for(int i:changed){
        if(!q.isEmpty() && 2*q.peek()==i){
            res.add(q.poll());
        }else{
            q.offer(i);
        }
        }
        if(!q.isEmpty()) return new int[]{};
        int[] arr=new int[res.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=res.get(i);
        }
        return arr;
    }
}