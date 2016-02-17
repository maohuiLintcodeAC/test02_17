/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    /**
     * @param head a ListNode
     * @param val an integer
     * @return a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        // Write your code here
        if(head == null) {
            return null;
        }
        
        while(head.val == val) {
            if(head.next != null) {
                head = head.next;
            } else {
                return null;
            }
        }
        
        ListNode pointer = head.next;
        ListNode pre = head;
        
        while(pointer != null) {
            while(pointer.val == val) {
                if(pointer.next != null) {
                    pointer = pointer.next;
                } else {
                    pre.next = null;
                    return head;
                }
            }
            pre.next = pointer;
            pre = pointer;
            pointer = pointer.next;
        }
        
        return head;
    }
}
