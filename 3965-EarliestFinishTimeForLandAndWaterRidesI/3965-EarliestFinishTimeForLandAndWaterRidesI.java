// Last updated: 8/7/2025, 11:36:03 AM
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int m = Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            for(int j=0;j<waterStartTime.length;j++){
                int l=landStartTime[i];
                int s1=l+landDuration[i];
                int c1=Math.max(s1,waterStartTime[j]);
                int w1=c1+waterDuration[j];

                int w2=waterStartTime[j]+waterDuration[j];
                int c2=Math.max(w2,landStartTime[i]);
                int s2=c2+landDuration[i];
                m=Math.min(m,Math.min(w1,s2));
            }
        }
        return m;
    }
}