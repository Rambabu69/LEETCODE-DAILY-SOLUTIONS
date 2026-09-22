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
    public ListNode deleteMiddle(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }

        ArrayList<Integer> arr = new ArrayList<>();

        ListNode temp = head;

        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }

        int mid = arr.size() / 2;

        temp = head;

        
        for (int i = 1; i < mid; i++) {
            temp = temp.next;
        }

    
        temp.next = temp.next.next;

        return head;
    }
}