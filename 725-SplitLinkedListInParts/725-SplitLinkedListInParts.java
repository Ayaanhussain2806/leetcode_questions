// Last updated: 2/10/2026, 3:15:00 PM
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {

        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        int partSize = n / k;
        int extra = n % k;

        ListNode[] ans = new ListNode[k];
        ListNode curr = head;

        for (int i = 0; i < k; i++) {

            if (curr == null) {
                ans[i] = null;
                continue;
            }

            ans[i] = curr; 

            int currentPartLen = partSize + (extra > 0 ? 1 : 0);
            if (extra > 0) extra--;

            for (int j = 1; j < currentPartLen; j++) {
                curr = curr.next;
            }

            ListNode nextPart = curr.next;
            curr.next = null;
            curr = nextPart;
        }

        return ans;
    }
}
