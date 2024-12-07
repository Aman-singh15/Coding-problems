// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
// Example 1:
// Input: head = [1,1,2]
//Output: [1,2]
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
    public ListNode deleteDuplicates(ListNode head) {
//          if(head==null){
//             return head;
//          }
//         ListNode temp=head;
//         ListNode dummy=new ListNode(0);
//         ListNode ans=dummy;
//         while(temp!=null){
//              if(temp.next==null || temp.val!=temp.next.val){
//                 ans.next=new ListNode(temp.val);
//                 ans=ans.next;
//              }
//                 temp=temp.next;
//         }
//         return dummy.next;
//     }
// }

// Approach 2:-
          if(head==null){
            return null;
          }
          ListNode temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
            }else{
            temp=temp.next;
            }
        }
        return head;
    }
}
