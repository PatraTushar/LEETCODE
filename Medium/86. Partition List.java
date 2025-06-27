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
    public ListNode partition(ListNode head, int x) {

        ListNode smallerThanX=new ListNode(-1);
        ListNode p1=smallerThanX;
        ListNode greaterThanOrEqualToX=new ListNode(-1);
        ListNode p2=greaterThanOrEqualToX;

        ListNode temp=head;

        while(temp!=null){

            if(temp.val < x){

                p1.next=temp;
                p1=p1.next;

            }

            else{

                p2.next=temp;
                p2=p2.next;


            }

            temp=temp.next;


        }

        p1.next=greaterThanOrEqualToX.next;
        p2.next=null;

        return smallerThanX.next;
        
    }
}