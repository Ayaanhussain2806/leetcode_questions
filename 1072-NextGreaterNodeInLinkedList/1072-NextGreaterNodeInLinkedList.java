// Last updated: 2/10/2026, 3:14:11 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        int[] arr=new int[count];
        int j=0;
        while(temp!=null){
            arr[j]=temp.val;
            j++;
            temp=temp.next;
        }
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                ans[st.pop()]=arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()) ans[st.pop()]=0;
        return ans;
    }
}