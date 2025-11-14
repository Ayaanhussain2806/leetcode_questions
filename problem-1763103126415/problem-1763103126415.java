// Last updated: 11/14/2025, 12:22:06 PM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            a[i]=nums[i];
            b[i]=nums[i+n];
        }
        for(int i=0;i<2*n;i++){
            if(i%2==0){
                nums[i]=a[i/2];
            }else{
                nums[i]=b[i/2];
            }
        }
        return nums;
    }
}