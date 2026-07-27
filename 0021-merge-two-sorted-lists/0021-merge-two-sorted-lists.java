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
        ListNode t = dummy;
        ListNode t1 = h1;
        ListNode t2 = h2;

        while(t1 != null && t2 != null){
            if(t1.val>t2.val){
                t.next = t2;
                t2 = t2.next;
            }
            else{
                t.next = t1;
                t1 = t1.next;
            }
            t = t.next;
        }
        if(t1==null) t.next = t2;
        if(t2==null) t.next = t1;

        return dummy.next;

    }
}