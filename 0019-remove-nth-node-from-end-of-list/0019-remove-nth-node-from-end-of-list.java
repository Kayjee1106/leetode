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
        int count=0;
        ListNode dummy=new ListNode(0);
        ListNode curr=head;
        dummy.next=head;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        curr=dummy;
        for(int i=0;i<count-n;i++){
            curr=curr.next;
            
        }
        curr.next=curr.next.next;
        return dummy.next;
    }
}