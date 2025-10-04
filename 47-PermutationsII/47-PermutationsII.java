// Last updated: 10/4/2025, 3:10:32 PM
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] visit=new boolean[nums.length];
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        solve(nums,ans,ll,visit,0);
        return ans;
    }
    public static void solve(int[] nums,List<List<Integer>> ans,List<Integer> ll,boolean[] visit,int idx){
        if(idx==nums.length){
            ans.add(new ArrayList<>(ll));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1] && !visit[i-1]) continue;
            if(visit[i]==false){
                ll.add(nums[i]);
            visit[i]=true;
            solve(nums,ans,ll,visit,idx+1);
            visit[i]=false;
            ll.remove(ll.size()-1);
            }
            
        }
    }
}