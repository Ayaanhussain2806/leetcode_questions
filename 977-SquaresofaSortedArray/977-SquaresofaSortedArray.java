// Last updated: 10/9/2025, 11:46:34 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i]*nums[i];
        }
         Arrays.sort(arr);
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(arr[i]>arr[j]){
        //             int temp=arr[i];
        //             arr[i]=arr[j];
        //             arr[j]=temp;
        //         }
        //     }
        // }
        return arr;
    }
}