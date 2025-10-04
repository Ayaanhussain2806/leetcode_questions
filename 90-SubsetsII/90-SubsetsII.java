// Last updated: 10/4/2025, 1:26:45 PM
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        solve(nums,ans,0,ll);
        return ans;
    }
    public static void solve(int[] nums, List<List<Integer>> ans,int idx,List<Integer> ll){
        ans.add(new ArrayList<>(ll));
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]){
                continue;
            }
            ll.add(nums[i]);
            solve(nums,ans,i+1,ll);
            ll.remove(ll.size()-1);
        }
    }
}