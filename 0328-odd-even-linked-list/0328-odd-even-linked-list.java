class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(1);
        ListNode even = new ListNode(1);
        ListNode to = odd;
        ListNode te = even;
        ListNode temp = head;
        while(temp!=null ){
            to.next = temp;
            to = to.next;
            temp = temp.next;
            if(temp == null) break;
            te.next = temp;
            te = te.next;
            temp = temp.next;
        }
        to.next = even.next;
        te.next = null;

        return odd.next;
    }
}