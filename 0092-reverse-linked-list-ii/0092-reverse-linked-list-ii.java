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
    public ListNode reverse(ListNode head){
        ListNode pre = null;
         ListNode curr= head ;
          ListNode f = null;
           while(curr !=null){
            f=curr.next;
            curr.next = pre;
            pre = curr;
            curr = f;
           }
           return pre;
    }
    public ListNode reverseBetween(ListNode head, int a, int b) {

        // ArrayList<ListNode> arr = new ArrayList<>();

        // ListNode temp = head;
        // while(temp != null){
        //     arr.add(temp);
        //     temp = temp.next;
        // }

        // int i = a-1;
        // int j = b -1;

        // while(i<j){

        //     ListNode t1 = arr.get(i);
        //     ListNode t2 = arr.get(j);

        //     arr.set(i , t2);
        //     arr.set(j , t1);
        //     i++;
        //     j--;
        // }
        // for(i = 0 ; i< arr.size() ; i++){
        //     arr.get(i).next = (i == arr.size() -1) ? null :arr.get(i+1);
        // }
        // return arr.get(0);
          if (head == null || a == b) return head;


        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;
         

        for(int i = 0 ; i< a- 1 ; i++){
            temp = temp.next;
        } 
        ListNode tail1 = temp;
        ListNode head2 = temp.next;

        for(int i = 0 ; i <b-a+1 ; i++ ){
            temp = temp.next;
        }
        ListNode tail2 = temp;
        ListNode head3 = temp.next;

        tail2.next = null;

tail1.next = reverse(head2);
head2.next = head3;
        return dummy.next;
        
    }
}