/*Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
The first node is considered odd, and the second node is even, and so on.
Note that the relative order inside both the even and odd groups should remain as it was in the input.
You must solve the problem in O(1) extra space complexity and O(n) time complexity.
Example 1:
Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]*/


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
//     public ListNode oddEvenList(ListNode head) {
//         if(head==null){
//             return null;
//         }
//         ListNode dummy=new ListNode(-1);
//         ListNode ans=dummy;
//         ListNode odd=head;
//         ListNode evenhead=head.next;
//         ListNode even=evenhead;
//         while(odd!=null && odd.next!=null){
//             ans.next=new ListNode(odd.val);
//             ans=ans.next;
//             odd=odd.next.next;
            
//         }
//           if(odd!=null){
//             ans.next=new ListNode(odd.val);
//             ans=ans.next;
//           }
//         while(even!=null && even.next!=null){
//             ans.next=new ListNode(even.val);
//             ans=ans.next;
//             even=even.next.next;
//         }
//         if(even!=null){
//             ans.next=new ListNode(even.val);
//             ans=ans.next;
//         }
//         return dummy.next;
//     }
// }
// Approach 2:- Optimal Solution...
  class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;         // Start with the first node
        ListNode even = head.next;  // Start with the second node
        ListNode evenHead = even;   // Save the head of the even list

        while (even != null && even.next != null) {
            odd.next = even.next;   // Connect odd nodes
            odd = odd.next;         // Move odd pointer forward
            even.next = odd.next;   // Connect even nodes
            even = even.next;       // Move even pointer forward
        }

        odd.next = evenHead;        // Attach even list to the end of the odd list
        return head;                // Return the rearranged list
    }
}
