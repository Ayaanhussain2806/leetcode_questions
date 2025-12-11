// Last updated: 12/12/2025, 1:04:07 AM
1
2/**
3 * Definition for singly-linked list.
4 * public class ListNode {
5 *     int val;
6 *     ListNode next;
7 *     ListNode() {}
8 *     ListNode(int val) { this.val = val; }
9 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
10 * }
11 */
12class Solution {
13    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
14        ListNode dummy = new ListNode(0);
15        int carry = 0;
16        ListNode cur = dummy;
17        while (l1 != null || l2 != null || carry != 0) {
18            int s = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
19            carry = s / 10;
20            cur.next = new ListNode(s % 10);
21            cur = cur.next;
22            l1 = l1 == null ? null : l1.next;
23            l2 = l2 == null ? null : l2.next;
24        }
25        return dummy.next;
26    }
27}
28
29
30