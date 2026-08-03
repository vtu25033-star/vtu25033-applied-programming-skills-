/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int count = 0;
        while(fast != null && fast.next != null){
            if(slow == fast){
                count++;
                if(count >= 2) {
                    break;
                }
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        if(count<2) return null;
        ListNode check = head;
        while(check!=slow){
            slow = slow.next;
            check = check.next;
        }
        return check;
    }
}