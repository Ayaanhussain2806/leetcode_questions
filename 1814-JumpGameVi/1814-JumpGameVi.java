// Last updated: 2/10/2026, 3:12:59 PM
class Solution {
    public int maxResult(int[] nums, int k) {
        int n=nums.length,a=0,b=0;
        int[] res=new int[n];
        res[0]=n-1;
        for(int i=n-2;i>=0;i--){
            if(res[a]-i>k) a++;
            nums[i]+=nums[res[a]];
            while(b>=a && nums[res[b]]<=nums[i]) b--;
            res[++b]=i;
        }
        return nums[0];
    }
}