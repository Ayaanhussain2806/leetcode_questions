// Last updated: 2/10/2026, 3:13:20 PM
import java.util.*;

class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];

        HashMap<Integer, Integer> lastRain = new HashMap<>();
        TreeSet<Integer> zeroDays = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            if (rains[i] == 0) {
                zeroDays.add(i);
                ans[i] = 1; 
            } else {
                int lake = rains[i];
                ans[i] = -1; 

                if (lastRain.containsKey(lake)) {
                    int last = lastRain.get(lake);

                    Integer dryDay = zeroDays.higher(last); 
                    if (dryDay == null) return new int[0]; 

                    ans[dryDay] = lake;      
                    zeroDays.remove(dryDay); 
                }

                lastRain.put(lake, i);
            }
        }
        return ans;
    }
}
