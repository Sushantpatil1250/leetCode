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
    public int pairSum(ListNode head) {
        List<Integer> l = new ArrayList();
        ListNode t = head;
        int max = 0;

        while(t != null){
            l.add(t.val);
            t = t.next;
        }
        int i = 0 , j = l.size()-1;
        while(i < j){
            int c = l.get(i) + l.get(j);
            i++;
            j--;
            if(max<c) max = c;
        }
        return max;


        
    }
}