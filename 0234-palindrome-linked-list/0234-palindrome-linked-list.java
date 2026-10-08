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
    public boolean isPalindrome(ListNode head) {
        
        

        ArrayList<Integer> a = new ArrayList<>();

        ListNode temp = head;
        while(temp != null){
            a.add(temp.val);
            temp = temp.next;
        } 

        int i = 0 , j = a.size()- 1;
        if(a.size() == 2){
            if(head.val != head.next.val) return false;
        }
        while(i< j){
            if(a.get(i) != a.get(j)) return false;
            i++;
            j--;
        }

        return true;
        
    }
}