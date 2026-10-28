/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {

        if(head == null) return head;

        Node temp = head;

        while(temp != null){

            if(temp.child == null){
                temp = temp.next;

            }
            else{

                Node f = temp.next;
                Node c = flatten(temp.child);
                temp.child =null;
                temp.next = c;
                c.prev = temp;
                Node t = c;
                while(t.next != null){
                    t = t.next;
                }
                t.next = f;
                if(f != null) f.prev = t;
                temp =f;
            }
        }
        return head;
        
    }
}