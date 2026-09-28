/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {

        ListNode a = head1;
        int len1 =0;
        ListNode b = head2;
        int len2 = 0;

        while(a !=null){
            a=a.next;
            len1++;
        }
        while(b !=null){
            b=b.next;
            len2++; 
        }
        a = head1;
        b=head2;
        if(len1>len2){
            int x =len1 -len2;
            for(int i = 0 ; i<x ; i++){
                a = a.next;
            }
        }
        else{
            int x =len2 -len1;
            for(int i = 0 ; i<x ; i++){
                b = b.next;
            }
        }
        while(a != null && b!= null){
            if (a==b){
                return a;
            }  
            a = a.next;
            b = b.next;

        }
        return null;
        
    }
}