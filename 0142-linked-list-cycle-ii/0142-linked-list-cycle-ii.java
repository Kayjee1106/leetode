/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null )return null;
        ListNode slow=head;
        ListNode fast=head;
        ListNode p=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(fast!=slow){
            return null;
        }
        while(p!=slow){
            slow=slow.next;
            p=p.next;
        }
        return p;
    }
}