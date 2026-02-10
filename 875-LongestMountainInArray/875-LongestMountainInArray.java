// Last updated: 2/10/2026, 3:14:46 PM
class Solution {
    public int longestMountain(int[] arr) {
        int max=0;
        int left=0;
        int right=0;
        for(int i=1;i<arr.length-1;i++){
            
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                left=i;
                right=i;
                while(left>0 && arr[left-1]<arr[left]){
                    left--;
                }
                while(right<arr.length-1 && arr[right+1]<arr[right]){
                    right++;
                }
                max=Math.max(max,right-left+1);
                i=right;
            }
            
        }
        return max;
    }
}