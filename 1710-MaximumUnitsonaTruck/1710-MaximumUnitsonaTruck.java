// Last updated: 10/1/2025, 1:48:33 PM
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int sum=0;
        for(int[] box:boxTypes){
            int count=Math.min(truckSize,box[0]);
            sum+=count*box[1];
            truckSize-=count;
            if(truckSize==0){
            break;
        }
        }
        
        return sum;
    }
}