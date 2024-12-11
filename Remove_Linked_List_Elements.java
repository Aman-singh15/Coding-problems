// Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
// Example 1:
// Input: head = [1,2,6,3,4,5,6], val = 6
// Output: [1,2,3,4,5]

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
//     public ListNode removeElements(ListNode head, int val) {
//         ListNode temp=head;
//         ListNode dummy=new ListNode(-1);
//         ListNode ans=dummy;
//         while(temp!=null){
//            if(temp.val==val){
//             temp=temp.next;
//            }else{
//                 ans.next=new ListNode(temp.val);
//                 ans=ans.next;
//                 temp=temp.next;
//            }
//         }
//         return dummy.next;
//     }
// }
// Both Approach are fine downside takes O(1) space complexity only.
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode current = dummy;

        while (current.next != null) {
            if (current.next.val == val) {
                // Skip the node with the matching value
                current.next = current.next.next;
            } else {
                // Move to the next node
                current = current.next;
            }
        }

        return dummy.next;
    }
}
