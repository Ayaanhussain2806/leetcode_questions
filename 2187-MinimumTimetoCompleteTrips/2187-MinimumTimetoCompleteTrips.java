// Last updated: 9/28/2025, 7:11:50 PM
class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        int min=Integer.MAX_VALUE;
        for(int i:time){
            min=Math.min(i,min);
        }
        long left=1;
        long right=(long)min*totalTrips;
        while(left<right){
            long mid=left+(right-left)/2;
            if(ispossible(time,mid,totalTrips)){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
    public static boolean ispossible(int[] time,long givenTime,int totalTrips){
        long t=0;
        for(int bus:time){
            t+=givenTime/bus;
        }
        return t>=totalTrips;
    }
}