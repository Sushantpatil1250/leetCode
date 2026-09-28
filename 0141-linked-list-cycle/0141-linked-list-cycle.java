/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        ListNode t = head;
        if(head == null || head.next ==null) return false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                while(t != null){
                    t = t.next;
                    slow = slow.next;
                    if(t ==slow){
                        return true;
                    }

                }
            }
        }
        return false;
        
    }
}