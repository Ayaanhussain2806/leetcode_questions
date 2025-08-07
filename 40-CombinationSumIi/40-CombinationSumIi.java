// Last updated: 8/7/2025, 11:39:15 AM
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
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
            if (i > idx && candidates[i] == candidates[i - 1]) continue;
            if(target>=candidates[i]){
                ll.add(candidates[i]);
                Combination(candidates,target-candidates[i],ll,i+1,ans);
                ll.remove(ll.size()-1);
            }
        }
    }
}