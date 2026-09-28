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
    public ListNode sortList(ListNode head) {
        if( head ==null || head.next == null ) return head;

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next !=null){
            slow = slow.next;
            fast  =fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next =null;
        ListNode x1 = sortList(head);
       ListNode x2 = sortList(head2);
       return merge(x1 ,x2);

        
    }

    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode i = list1;
        ListNode j =list2;
        ListNode dum = new ListNode(1);
        ListNode k = dum;

        while(i != null && j != null){
            if(i.val<j.val){
                k.next = i;
                i = i.next;
            }
            else{
                k.next = j;
                j = j.next;
            }
            k= k.next;
        }
        if(i==null){
            k.next = j;
            
        }else k.next =i;
        return dum.next;
        
    }
}