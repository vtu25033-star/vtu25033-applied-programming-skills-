/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int n = 0;
        int lenA = 0;
        ListNode temp = headA;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp != null){
            temp = temp.next;
            lenA++;
        }
        int lenB = 0;
        temp = headB;
        while(temp != null){
            temp = temp.next;
            lenB++;
        }
        if(lenA > lenB){
            n = lenA - lenB;
            for(int i=1;i<=n;i++){
                temp1 = temp1.next;
            }
            for(int i = 1;i<=lenA;i++){
                if(temp1 == temp2) return temp2;
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        else if(lenA < lenB){
            n = lenB - lenA;
            temp1 = headA;
            temp2 = headB;
            for(int i=1;i<=n;i++){
                temp2 = temp2.next;
            }
            for(int i = 1;i<=lenB;i++){
                if(temp1 == temp2) return temp1;
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        else{
            for(int i = 1;i<=lenA;i++){
                if(temp1 == temp2) return temp1;
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        return null;
    }
}