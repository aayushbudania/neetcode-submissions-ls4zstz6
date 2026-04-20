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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return head;

        int sz = 0;
        ListNode t = head;

        while (t != null) {
            sz++;
            t = t.next;
        }

        int count = sz - n;
        if (count == 0) return head.next;

        t = head;

        while (count != 1 && t != null) {
            count--;
            t = t.next;
        }

        t.next = t.next.next;
        return head;
    }
}
