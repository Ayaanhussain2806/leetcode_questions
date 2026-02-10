// Last updated: 2/10/2026, 3:11:07 PM
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