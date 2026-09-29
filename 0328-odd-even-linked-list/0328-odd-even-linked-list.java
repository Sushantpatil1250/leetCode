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
    public ListNode oddEvenList(ListNode head) {

        ListNode t1 = new ListNode(1);
         ListNode t2 = new ListNode(1);
         ListNode temp = head;
         ListNode o = t1;
         ListNode e = t2;
         int len =0;

         while(temp != null){
            temp = temp.next;
            len++;
         }
         temp=head;

         for(int i =1 ; i <=len ; i++){
            if(i % 2 !=0){
                o.next = temp;
                o = o.next;

            }else{
                e.next = temp;
                e = e.next;
            }
            temp = temp.next;
         }
         o.next = t2.next;
         e.next = null;
         return t1.next;


        
    }
}