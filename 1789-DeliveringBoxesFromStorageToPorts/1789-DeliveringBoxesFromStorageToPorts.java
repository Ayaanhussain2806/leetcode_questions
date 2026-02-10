// Last updated: 2/10/2026, 3:13:03 PM
class Solution {
    public int boxDelivering(int[][] boxes, int portsCount, int maxBoxes, int maxWeight) {
        int[] diffCity = new int[boxes.length+1];
        int[] weights = new int[boxes.length+1];
        
        for (int i = 0; i < boxes.length; i++) {
            diffCity[i+1] = diffCity[i] + ((i != 0 && boxes[i][0] == boxes[i-1][0]) ? 0 : 1);
            weights[i+1] = weights[i] + boxes[i][1];
        }
        int[] dp = new int[boxes.length+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        Deque<int[]> dq = new ArrayDeque<>();
        dq.offer(new int[] {0, -1});
        for (int i = 1; i <= boxes.length; i++) {
            while (!dq.isEmpty() && (i - dq.peek()[0] > maxBoxes || weights[i] - weights[dq.peek()[0]] > maxWeight)) { // filter values no longer can be used.
                dq.poll();
            }
            
            dp[i] = dq.peek()[1] + diffCity[i] + 2;
            if (i != boxes.length) {
                while (dq.peekLast()[1] >= dp[i] - diffCity[i+1]) { // throw away greater values than current value.
                    dq.pollLast();
                }
                dq.offer(new int[] {i, dp[i] - diffCity[i+1]});
            }
        }
            
        return dp[boxes.length];
    }
}