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
        Node curr = head;
        Node fwd = head;
        while(curr != null){
            if(curr.child == null) curr = curr.next;
            else{
                fwd = curr.next;
                Node c = flatten(curr.child);
                curr.child = null;
                curr.next = c;
                c.prev = curr;
                Node ite = curr;
                while(ite.next != null) ite = ite.next;
                ite.next = fwd;
                if(fwd != null) fwd.prev = ite;
                curr = fwd;
            }
        }
        return head;
    }
}