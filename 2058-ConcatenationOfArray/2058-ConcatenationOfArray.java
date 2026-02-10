// Last updated: 2/10/2026, 3:12:37 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int l=nums.length;
        int[] arr=new int[2*l];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            arr[nums.length+i]=nums[i];
        }
        return arr;
    }
}