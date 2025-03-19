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

        ListNode Dummy=new ListNode(0);
        ListNode prev=Dummy;
        Dummy.next=head;

        while(head!=null){

            if(head.next!=null && head.val==head.next.val){
                while(head.next!=null && head.val==head.next.val){
                    head=head.next;
                }

                prev.next=head.next;
                head=head.next;

            }

            else{
                head=head.next;
                prev=prev.next;
            }
        }

       return  Dummy.next;


        
    }
}