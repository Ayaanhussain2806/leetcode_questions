// Last updated: 2/10/2026, 3:15:27 PM
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total=0;
        for(int i=0;i<timeSeries.length-1;i++){
            total+=Math.min(duration,timeSeries[i+1]-timeSeries[i]);
        }
        total+=duration;
        return total;
    }
}