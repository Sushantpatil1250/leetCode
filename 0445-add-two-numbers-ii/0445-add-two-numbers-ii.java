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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode c1 = l1;
        ListNode f1 = null;
        ListNode p1 = null;
        while(c1 != null){
            f1 = c1.next ; 
            c1.next = p1;
            p1 = c1; 
            c1 = f1; 
        }
        ListNode c2 = l2;
        ListNode f2 = null;
        ListNode p2 = null;
        while(c2 != null){
            f2 = c2.next ; 
            c2.next = p2;
            p2 = c2; 
            c2 = f2; 
        }
       ListNode dummy = new ListNode(-1);
ListNode k = dummy;

int carry = 0;

while(p1 != null || p2 != null || carry != 0){

    int a = 0;
    int b = 0;

    if(p1 != null){
        a = p1.val;
        p1 = p1.next;
    }

    if(p2 != null){
        b = p2.val;
        p2 = p2.next;
    }

    int sum = a + b + carry;

    int digit = sum % 10;
    carry = sum / 10;

    ListNode y = new ListNode(digit);

    k.next = y;
    k = k.next;
}
  ListNode c3 = dummy.next;
        ListNode f3 = null;
        ListNode p3 = null;
        while(c3 != null){
            f3 = c3.next ; 
            c3.next = p3;
            p3 = c3; 
            c3 = f3; 
        }
        return p3;


        
    }
}