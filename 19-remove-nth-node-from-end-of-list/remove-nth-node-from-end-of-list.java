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

        // 1. Count total nodes
        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // 2. Agar first node delete karna hai
        if (n == count) {
            return head.next;
        }

        // 3. Us node se pehle wale node tak jao
        temp = head;

        for (int i = 1; i < count - n; i++) {
            temp = temp.next;
        }

        // 4. Nth node ko skip karo
        temp.next = temp.next.next;

        return head;
    }
}