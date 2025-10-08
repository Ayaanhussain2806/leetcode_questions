// Last updated: 10/9/2025, 12:46:57 AM
class Solution {
    public int[] transformArray(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }
        // Arrays.sort(arr);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}