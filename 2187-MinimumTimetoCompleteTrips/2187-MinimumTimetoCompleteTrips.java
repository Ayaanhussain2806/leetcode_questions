// Last updated: 9/28/2025, 6:18:57 PM
class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        int min=Integer.MAX_VALUE;
        for(int i:time){
            min=Math.min(i,min);
        }
        long left=1;
        long right=(long)min*totalTrips;
        long ans=right;
        while(left<=right){
            long mid=left+(right-left)/2;
            if(ispossible(time,mid,totalTrips)){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }
    public static boolean ispossible(int[] time,long giventime,int totalTrips){
        long t=0;
        for(int bus:time){
            t+=giventime/bus;
        }
        return t>=totalTrips;
    }
}