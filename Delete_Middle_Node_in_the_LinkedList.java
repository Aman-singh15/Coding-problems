/*You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.
The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing, where ⌊x⌋ denotes the largest integer less than or equal to x.
For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.
Example 1:
Input: head = [1,3,4,7,1,2,6]
Output: [1,3,4,1,2,6]
Explanation:
The above figure represents the given linked list. The indices of the nodes are written below.
Since n = 7, node 3 with value 7 is the middle node, which is marked in red.
We return the new list after removing this node. 
Example 2:
Input: head = [1,2,3,4]
Output: [1,2,4]
Explanation:
The above figure represents the given linked list.
For n = 4, node 2 with value 3 is the middle node, which is marked in red.
Example 3:
Input: head = [2,1]
Output: [2]
Explanation:
The above figure represents the given linked list.
For n = 2, node 1 with value 1 is the middle node, which is marked in red.
Node 0 with value 2 is the only node remaining after removing node 1.  



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
//     public ListNode deleteMiddle(ListNode head) {
//         int length=0;
//         ListNode temp=head;
//         while(temp!=null){
//           length++;
//           temp=temp.next;
//         }
//         if(length==1){
//           return null;
//         }
//         int midPos= (length/2);
//         if (midPos == 1 && length == 2) { 
//             head.next = null;
//             return head;
//         }
//         ListNode temp1=head;
//         int k=0;
//       while(k<midPos-1 ){
//           temp1=temp1.next;
//           k++;
//       }
//       temp1.next=temp1.next.next;
//       return head;
//     }
// }

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null){
            return null;
        }
        else if(head.next==null){
            return null;
        }
        ListNode fast=head.next.next;
        ListNode slow= head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode temp=slow.next.next;
        slow.next.next=null;
        slow.next=temp;
        
    return head;
    }
}
