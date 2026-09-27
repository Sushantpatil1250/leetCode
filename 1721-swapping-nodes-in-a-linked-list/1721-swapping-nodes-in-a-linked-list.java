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
    public ListNode swapNodes(ListNode head, int k) {

        ListNode a =head;
        ListNode b = head;
        int len=0;

        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            len++;
        }
      for(int i = 1; i < k; i++){
            a = a.next;
        }

        for(int i = 1; i <= len-k; i++){
            b = b.next;
        }
        int t = a.val;
        a.val = b.val;
        b.val = t;
       
        return head;
        
    }
}