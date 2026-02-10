// Last updated: 2/10/2026, 3:15:26 PM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums2.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<nums2.length;i++){
            while(!st.isEmpty() && nums2[i]>nums2[st.peek()]){
                ans[st.pop()]=nums2[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    nums1[i]=ans[j];
                    break;
                }
            }
        } 
        return nums1;
    }
}