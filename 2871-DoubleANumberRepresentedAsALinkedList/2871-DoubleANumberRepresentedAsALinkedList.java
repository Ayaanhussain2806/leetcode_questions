// Last updated: 2/10/2026, 3:11:17 PM
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
    public ListNode doubleIt(ListNode head) {
        head=reverse(head);
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        ListNode temp=head;
        int carry=0;
        while(temp!=null){
            int sum=carry;
            sum+=temp.val*2;
            ListNode newN=new ListNode(sum%10);
            carry=sum/10;
            curr.next=newN;
            curr=curr.next;
            temp=temp.next;
        }
        if(carry>0){
            ListNode newR=new ListNode(carry);
            curr.next=newR;
            curr=curr.next;
        }
        return reverse(dummy.next);
    }
    public ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode nex=temp.next;
            temp.next=prev;
            prev=temp;
            temp=nex;
        }
        return prev;
    }
}