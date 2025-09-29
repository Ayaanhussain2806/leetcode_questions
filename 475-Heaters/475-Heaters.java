// Last updated: 9/29/2025, 3:14:12 PM
class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int[] an=new int[houses.length];
        for(int i=0;i<houses.length;i++){
            int cal=Integer.MAX_VALUE;
            for(int j=0;j<heaters.length;j++){
                int ans=Math.abs(houses[i]-heaters[j]);
                cal=Math.min(ans,cal);
            }
            an[i]=cal;
        }
        Arrays.sort(an);
        return an[an.length-1];
    }
}