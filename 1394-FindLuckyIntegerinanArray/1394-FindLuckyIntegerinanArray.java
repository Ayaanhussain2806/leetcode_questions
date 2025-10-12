// Last updated: 10/12/2025, 5:30:02 PM
class Solution {
    public int findLucky(int[] arr) {
        int[] freq=new int[501];
        for(int num:arr){
            freq[num]++;
        }
        int max=-1;
        for(int i=1;i<=500;i++){
            if(freq[i]==i){
                max=i;
            }
        }
        return max;
    }
}