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

    


     static ListNode reverse(ListNode head){

        if(head==null || head.next==null) return head;

        ListNode curr=head;
        ListNode prev=null;
        ListNode agla=null;

        while (curr!=null){

            agla=curr.next;
            curr.next=prev;
            prev=curr;
            curr=agla;

        }

        return prev;

    }
    public void reorderList(ListNode head) {

    if (head == null || head.next == null) return ;


        ListNode slow=head;
        ListNode fast=head;

        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

       ListNode reverse2ndHalf=reverse(slow.next);
        slow.next=reverse2ndHalf;

        ListNode t1=head;
        ListNode t2=slow.next;

        while (t2!=null){
            slow.next=t2.next;
            t2.next=t1.next;
            t1.next=t2;
            t1=t2.next;
             if(t1 == null) break;
            t2=slow.next;
        }

    

        
    }
}