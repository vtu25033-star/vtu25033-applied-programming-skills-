class Solution {
    public Node deepCopy(Node head1){
        Node temp1 = head1;
        Node head2 = new Node(-1);  // New Node
        Node temp2 = head2; 
        while(temp1!=null){
            Node n = new Node(temp1.val); 
            temp2.next = n;     // Connections to new nodes
            temp2 = temp2.next;
            temp1 = temp1.next;
        }
        return head2.next;   
    }
    public void merge(Node head1,Node head2){
        Node dummy = new Node(-1);
        Node temp = dummy;
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp1 != null && temp2 != null){
            temp.next = temp1;
            temp = temp.next;
            temp1 = temp1.next;

            temp.next = temp2;
            temp = temp.next;
            temp2 = temp2.next;
        }
    }
    public void randomConnections(Node head1,Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp1 != null && temp2 != null){
            if(temp1.random == null) temp2.random = null;
            else temp2.random = temp1.random.next;
            temp1 = temp1.next.next;
            if(temp2.next != null) temp2 = temp2.next.next;
        }
    }
    public void split(Node head){
        Node h1 = new Node(-1);
        Node h2 = new Node(-1);
        Node t1 = h1;
        Node t2 = h2;
        Node t = head;
        while(t != null ){
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
        // Step 1 : DeepCopy of List
        Node head2 = deepCopy(head1);
        // Step 2 : Merge head1 and head2
        merge(head1,head2);
        // Step 3 : Connecting random Connections
        randomConnections(head1,head2);
        // Step 4 : Split Big List 
        split(head1);

        return head2;
    }
}