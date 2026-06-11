class Solution {
    public ListNode swapPairs(ListNode head) {
       ListNode d1 = new ListNode(1);
       ListNode temp = head;
       ListNode t1 = d1;
       while(temp!=null && temp.next!=null){
            ListNode nextNode = temp.next.next;
            t1.next = temp.next;
            t1 = t1.next;
            t1.next = temp;
            t1 = t1.next; 
            temp = nextNode;
        
       }
       t1.next = temp;

       return d1.next;

    }
}