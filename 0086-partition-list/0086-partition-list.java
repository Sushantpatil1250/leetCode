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
    public ListNode partition(ListNode head, int x) {
        ListNode t1 = new ListNode(1);
         ListNode t2 = new ListNode(1);
         ListNode temp = head;
         ListNode s = t1;
         ListNode b = t2;

         while(temp != null){
            if( temp.val < x){
                s.next = temp;
                
                s= s.next;

            }
            else{
                b.next = temp;
                b = b.next;
            }
            temp = temp.next;
         }
         s.next = t2.next;
         b.next = null;

         return t1.next;
        
    }
}