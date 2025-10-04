// Last updated: 10/4/2025, 1:20:30 PM
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        solve(nums,ll,0,ans);
        return ans;
    }
    public static void solve(int[] nums,List<Integer> ll,int idx,List<List<Integer>> ans){
        ans.add(new ArrayList<>(ll));
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]){
                continue;
            }
            ll.add(nums[i]);
            solve(nums,ll,i+1,ans);
            ll.remove(ll.size()-1);
        }
    }
}