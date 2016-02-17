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
     * @param head: The first node of linked list.
     * @return: True if it has a cycle, or false
     */
    public boolean hasCycle(ListNode head) {  
        // write your code here
        if(head == null) {
            return false;
        }
        
        ListNode head2 = head;
        ListNode first;
        ListNode second;
        
        while(true) {
            if(head.next == null || head2.next == null || head2.next.next == null) {
                break;
            }
            first = head.next;
            second = head2.next.next;
            head = first;
            head2 = second;
            if(first == second) {
                return true;
            }
        }
        return false;
    }
}
