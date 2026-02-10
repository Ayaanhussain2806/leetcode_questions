// Last updated: 2/10/2026, 3:13:32 PM
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