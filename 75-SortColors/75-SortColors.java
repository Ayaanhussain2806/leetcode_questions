// Last updated: 8/7/2025, 11:38:50 AM
class Solution {
    public void sortColors(int[] nums) {
        int mid=0;
        int high=nums.length-1;
        int low=0;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }
    }
        private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}