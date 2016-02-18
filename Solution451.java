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
     * @return a ListNode
     */
    public ListNode swapPairs(ListNode head) {
        // Write your code here
        if(head == null) {
            return null;
        }
        
        ListNode p = head;
        ListNode q = head.next;
        ListNode pre = null;
        
        if(q == null) {
            return head;
        }
        head = q;
        
        while(p.next != null) {
            if(pre != null) {
                pre.next = q;
            }
            if(q.next != null) {
                p.next = q.next;
            } else {
                q.next = p;
                p.next = null;
                break;
            }
            q.next = p;   //回指
            pre = p;
            p = p.next;
            q = p.next;
        }
        
        return head;
    }
}
