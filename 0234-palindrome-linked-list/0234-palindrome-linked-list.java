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
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode fut = head;
        while(curr!=null){
            fut = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fut;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode slow1 = head;
        ListNode fast = head;
        ListNode first = head;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode rev = reverse(slow);

        while(first != null && rev != null){
            if(first.val != rev.val) return false;
            first = first.next;
            rev = rev.next;
        }
        return true;

    }
}