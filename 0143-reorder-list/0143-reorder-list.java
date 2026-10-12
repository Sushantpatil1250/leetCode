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
    public void reorderList(ListNode head) {
        ListNode temp = head;
        ListNode s = head;
        ListNode f = head;
        if(head == null) return ;
        while(f.next != null && f.next.next != null){
            s=s.next;
            f= f.next.next;
        }
        ListNode newNode = s.next;
        s.next =null;
        temp = head;

        ListNode t = newNode;

        ListNode pre = null;
        ListNode c = t;
        while(c != null){
            ListNode n = c.next;
            c.next = pre;
            pre = c;
            c = n;
        }
        ListNode head1 = pre;
        ListNode x = head1;
        

      while (temp != null && x != null) {

    ListNode next1 = temp.next;
    ListNode next2 = x.next;

    temp.next = x;
    x.next = next1;

    temp = next1;
    x = next2;
}
        return;

        
    }
}