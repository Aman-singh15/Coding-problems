//Given the head of a singly linked list, reverse the list, and return the reversed list.
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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode finalhead=reverseList(head.next);
        ListNode temp=finalhead;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;//adding the head into the last node which came after reversing 
        head.next=null;//so that it could be the last node of the reversed list
        return finalhead;

    }
}
