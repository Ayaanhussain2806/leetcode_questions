// Last updated: 2/10/2026, 3:13:41 PM
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
    public int getDecimalValue(ListNode head) {
        int ans=0;
        if(head.next==null && head.val==1) return 1;
        
        if(head.next==null){
            return ans;
        }
        
        while(head!=null){
        ans=(ans<< 1) | head.val;
           head=head.next;
        }
        return ans;
    }
}