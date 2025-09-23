// Last updated: 9/23/2025, 4:44:03 PM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq=new int[101];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        int sum=0;
        int min=0;
        for(int i=0;i<101;i++){
            if(freq[i]>=min){
                min=freq[i];
            }
        }
        for(int i=0;i<101;i++){
            if(freq[i]==min){
                sum+=freq[i];
            }
        }
        return sum;
    }
}