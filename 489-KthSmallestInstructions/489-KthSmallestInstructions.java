// Last updated: 2/10/2026, 3:15:29 PM
class Solution {
    public String kthSmallestPath(int[] destination, int k) {
        int v = destination[0];  // number of vertical moves needed
        int h = destination[1];  // number of horizontal moves needed
        int totalLen = v + h;   
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < totalLen; i++) {
            // Calculate remaining positions to fill
            int remainingLen = totalLen - i - 1;
            
            if (h > 0) {  // if we can still go horizontal
    
                long combinations = combination(remainingLen, v);
                
                if (combinations >= k) {
                    result.append('H');
                    h--;
                } else {
                    result.append('V');
                    v--;
                    k -= combinations;
                }
            } else {
                result.append('V');
                v--;
            }
        }
        
        return result.toString();
    }
    
    private long combination(int n, int r) {
        if (r > n) return 0;
        if (r == 0 || r == n) return 1;
        
        r = Math.min(r, n - r); // optimize by using the smaller value
        long result = 1;

        //nCr=n!/(r!*(n-r)!)=((n-1+1)*(n-2+1)*...(n-r+1))/r!
        
        for (int i = 1; i <= r; i++) {
            result *= (n - i + 1);
            result /= i;
        }     
        return result;
    }
}