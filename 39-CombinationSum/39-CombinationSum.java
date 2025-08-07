// Last updated: 8/7/2025, 11:39:16 AM
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ll=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        Combination(candidates,target,ll,0,ans);
        return ans;
    }
    public static void Combination(int[] candidates,int target,List<Integer> ll,int idx,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            if(target>=candidates[i]){
                ll.add(candidates[i]);
                Combination(candidates,target-candidates[i],ll,i,ans);
                ll.remove(ll.size()-1);
            }
        }
    }
}