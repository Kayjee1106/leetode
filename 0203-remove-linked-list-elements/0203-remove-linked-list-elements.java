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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dum=new ListNode(0);
        dum.next=head;
        ListNode curr2=head;
        ListNode curr1=dum;
        while(curr2!=null){
            if(curr2.val==val){
               curr1.next=curr2.next;
            }
            else{
                curr1=curr2;
            }
            curr2=curr2.next;
        }
        return dum.next;
    }
}