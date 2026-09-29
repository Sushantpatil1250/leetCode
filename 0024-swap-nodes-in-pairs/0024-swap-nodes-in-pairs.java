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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode o1 = new ListNode(-1);
          ListNode e1 = new ListNode(-1);
          ListNode r1 = new ListNode(1);
          ListNode r = r1;

          ListNode o = o1;
          ListNode e = e1;
          ListNode t = head;
          int len =0;

          while(t != null)
          {
            t = t.next;
            len++;
          }
          t = head;

          for(int i =1 ; i<=len ; i++){
            if(i % 2 != 0){
                o.next = t;
                o = o.next;
            }
            else{
                e.next = t;
                e = e.next;
            }
            t = t.next;

          }
          o.next = null;
          e.next = null;
          o = o1.next;
          e = e1.next;
          while(o != null && e != null){
            
            r.next =e;
            r = r.next;
            e=e.next;
            r.next = o;
            r =r.next;
            o = o.next;
          }
if(o != null){
    r.next = o;
}
        return r1.next;
    }
}