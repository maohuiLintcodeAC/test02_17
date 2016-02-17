/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */ 
public class Solution {
    /**
     * @param head: The head of linked list.
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
        if(head == null) {
            return null;
        }

        ListNode next;
        ListNode front = null;
        while(head != null) {
            next = head.next;
            head.next = front;
            front = head;
            head = next;
        }
        return front;
    }
}

