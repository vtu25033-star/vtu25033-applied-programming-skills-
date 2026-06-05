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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        for(int i=1;i<=n;i++){
            if(fast.next==null){
                head = head.next;
                return head;
            }
            fast = fast.next;
        }
        if(fast == null){
            head.next = head.next.next;
            return head;
        }
        ListNode temp = head;
        ListNode slow = head;
        while(fast != null){
            temp = slow;
            slow = slow.next;
            fast = fast.next;
        }

        temp.next = temp.next.next;

        return head;
    }
}