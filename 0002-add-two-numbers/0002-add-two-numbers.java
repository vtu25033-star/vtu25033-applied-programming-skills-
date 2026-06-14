/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, Lis) tNode next{ this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode fwd = null;
        ListNode curr = head;
        while(curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        int carry = 0;
        while(t1 != null || t2 != null){
            ListNode newNode = new ListNode();
            int a = 0,b = 0;
            if(t1 == null){
                a = 0;
                b = t2.val;
            }
            else if(t2 == null){
                a = t1.val;
                b = 0;
            }
            else{
                a = t1.val;
                b = t2.val;
            }
            int sum = a+b+carry;
            if(carry == 1) carry = 0;
            if(sum > 9){
                sum = sum % 10;
                carry = 1;
            }
            newNode.val = sum;
            t.next = newNode;
            t = t.next;
            if(t1 == null){
               t2 = t2.next;
            }
            else if(t2 == null){
               t1 = t1.next;
            }
            else{
                t1 = t1.next;
                t2 = t2.next;
            }
        }
        if(carry == 1){
            ListNode newNode = new ListNode(1);
            t.next = newNode;
        }
        dummy = dummy.next;
        return dummy;
    }
}