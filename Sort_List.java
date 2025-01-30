/*Given the head of a linked list, return the list after sorting it in ascending order.
Example 1:
Input: head = [4,2,1,3]
Output: [1,2,3,4]

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
     public ListNode sortList(ListNode head) {
            if (head == null) {
            return null;
        }
        int length=0;
        ListNode temp=head;
        while(temp!=null){
          length++;
          temp=temp.next;
        }
        int arr[]=new int[length];
        temp=head;
        int k=0;
        while(temp!=null){
           arr[k]=temp.val;
           k++;
           temp=temp.next;
        }
        Arrays.sort(arr);
        ListNode ans=new ListNode(arr[0]);
        ListNode dummy=ans;
        for(int i=1;i<arr.length;i++){
          dummy.next=new ListNode(arr[i]);
          dummy=dummy.next;
        }
        return ans;
    }
}

