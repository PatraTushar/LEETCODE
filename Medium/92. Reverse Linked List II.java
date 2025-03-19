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
    public ListNode reverseBetween(ListNode head, int left, int right) {


        ListNode Dummy=new ListNode(0);
        Dummy.next=head;
        ListNode t=Dummy;
        ListNode temp=head;

        for(int i=0;i<left-1;i++){
          t=t.next;
          temp=temp.next;
        }

        ListNode curr=temp;
        ListNode prev=null;
        ListNode Agla=null;

        for(int i=0;i<right-left+1;i++){
            Agla=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Agla;
        }

        t.next=prev;
        temp.next=curr;

        return Dummy.next;
        
    }
}