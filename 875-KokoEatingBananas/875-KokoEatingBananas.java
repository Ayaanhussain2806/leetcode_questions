// Last updated: 9/27/2025, 2:29:10 PM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Integer.MAX_VALUE;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(ispossible(piles,mid,h)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        return ans;
    }

    public static boolean ispossible(int[] arr,int mid,int h){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i]/mid + (arr[i]%mid==0 ? 0 : 1);
        }
       return sum<=h;
    }
}