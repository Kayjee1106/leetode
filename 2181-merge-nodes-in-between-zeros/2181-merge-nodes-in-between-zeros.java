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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr1=head.next;
        ListNode curr2=curr1;
        while(curr2!=null){
            int sum=0;
            while(curr2!=null && curr2.val!=0){
                sum+=curr2.val;
                curr2=curr2.next;
            }
            curr1.val = sum;
            curr2=curr2.next;
            curr1.next=curr2;
            curr1=curr1.next;
        }
        return head.next ;
    }
}