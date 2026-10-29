/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node deepcopy(Node head1) {
        Node head2 = new Node(-1);
        Node k = head2;
        Node temp = head1;

        while(temp != null){
            Node n = new Node(temp.val);
            k.next =n;
            k = n;
            temp = temp.next;
        }
        return head2.next;

    }
    public void merge(Node head1 ,Node head2){

        Node dummy = new Node(-1);
        Node temp = dummy;
        Node t1 = head1;
        Node t2 = head2;

        while(t1 !=null && t2 != null){
            temp.next = t1;
            t1 = t1.next;
            temp = temp.next;

            temp.next = t2;
            t2 = t2.next;
            temp = temp.next;



        } 

    }
    public void randomconeecton(Node head1 , Node head2) {
        Node t1 = head1;
        Node t2 = head2;

        while(t1 != null && t2 != null){
            if(t1.random == null) t2.random = null;
            else{

                t2.random = t1.random.next;

            }
            t1 = t1.next.next;
            if(t2.next != null) t2 = t2.next.next;
            
        }



    }
    public void split(Node head1) {

        Node dummy1 = new Node(-1);
        Node t1 = dummy1;
        Node dummy2 = new Node(-1);
             Node t2 = dummy2;
             Node t = head1;

             while(t != null){

                t1.next = t;
                t = t.next;
                t1 = t1.next;

                 t2.next = t;
                t = t.next;
                t2 = t2.next;
             }
             t1.next = null;
    }
    public Node copyRandomList(Node head1) {
        Node head2 = deepcopy(head1);

        merge(head1 , head2);

        randomconeecton(head1 , head2);

        split(head1);

        return head2;

    }
}