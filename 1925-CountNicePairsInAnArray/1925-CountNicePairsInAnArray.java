// Last updated: 2/10/2026, 3:12:50 PM
class Solution {
    public int countNicePairs(int[] nums) {
        long MOD=1_000_000_007;
        Map<Integer,Long> map=new HashMap<>();
        for(int num:nums){
            int key=num-rev(num);
            map.put(key,map.getOrDefault(key,0L)+1);
        }
        long ans=0;
        for(long count:map.values()){
            ans=(ans+(count*(count-1))/2)%MOD;
        }
        return (int)ans;
    }
    public static int rev(int n){
        int r=0;
        while(n>0){
            int d=n%10;
            r=r*10+d;
            n=n/10;
        }
        return r;
    }
}