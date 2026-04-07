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
    public boolean hasCycle(ListNode head) {
        Set<ListNode> st = new HashSet<>();
        
        while (head != null) {
            if (st.contains(head)) return true;
            st.add(head);
            head = head.next;
        }

        return false;
        //Floyd Algorithm
        // if (head == null || head.next == null)  return false;

        // ListNode slow = head, fast = head;

        // while (slow != null && fast != null) {
        //     slow = slow.next;
        //     if (fast.next == null) return false;
        //     fast = fast.next.next;
        //     if (slow == fast) return true;
        // }

        // return false;
    }
}
