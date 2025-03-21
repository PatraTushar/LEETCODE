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
    public ListNode removeNthFromEnd(ListNode head, int n) {

       if(head.next==null) return null;;

        ListNode temp=head;
        int length=0;

        while(temp!=null){
            temp=temp.next;
            length++;
        }

        if(length==n) return head.next;

        temp=head;

        int t=length-n;

        for(int i=0;i<t-1;i++){

         temp=temp.next;
           
        }

        temp.next=temp.next.next;


        return head;
        
    }
}