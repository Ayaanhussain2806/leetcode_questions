// Last updated: 2/10/2026, 3:12:01 PM
class Solution {
    public int totalSteps(int[] nums) {
        Deque<int[]> st=new ArrayDeque<>();
        int ans=0;
        for(int x:nums){
            int steps=0;
            while(!st.isEmpty() && x>=st.peek()[0]){
                steps=Math.max(steps,st.peek()[1]);
                st.pop();
            }
            if(st.isEmpty()) steps=0;
            else steps++;
            ans=Math.max(ans,steps);
            st.push(new int[]{x,steps});
        }
        return ans;
    }
}