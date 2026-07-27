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
// class Solution {
//     public ListNode mergeTwoLists(ListNode h1, ListNode h2) {
//         ListNode d = new ListNode(0);
//         ListNode k = d;
//         ListNode i = h1;
//         ListNode j = h2;
        
//         while(i != null && j != null){
//             if(i.val < j.val){
//                 k.next = i;
//                 i = i.next;
//             }
//             else{
//                 k.next = j;
//                 j = j.next;
//             }
//             k = k.next;
//         }
//         if(i == null) k.next = j;
//         if(j == null) k.next = i;
        
        
//         return d.next;
//     }
// }

class Solution {
    public ListNode mergeTwoLists(ListNode h1, ListNode h2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        ListNode a = h1;
        ListNode b = h2;

        while(a != null && b != null){
            if(a.val>b.val){
                temp.next = b;
                b = b.next;
            }
            else{
                temp.next = a;
                a = a.next;
            }
            temp = temp.next;
        }
        if(a==null) temp.next = b;
        if(b==null) temp.next = a;

        return dummy.next;

    }
}