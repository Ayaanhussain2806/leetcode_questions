// Last updated: 2/10/2026, 3:10:38 PM
class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int x:nums){
            list.add(x);
        }
        int ops=0;
        while(hasinverse(list)){
            int sum=Integer.MAX_VALUE;
            int idx=0;
            for(int i=0;i<list.size()-1;i++){
                int ans=list.get(i)+list.get(i+1);
                if(ans<sum){
                    sum=ans;
                    idx=i;
                }
            }
            list.set(idx,sum);
            list.remove(idx+1);
            ops++;
        }
        return ops;
    }
    private boolean hasinverse(List<Integer> list){
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)) return true;
        }
        return false;
    }
}