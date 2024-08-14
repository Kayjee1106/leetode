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
    public int getDecimalValue(ListNode head) {
        if(head==null)return 0;
        ListNode temp=head;
        int result=0;
        while(temp!=null){
            result=result*2 + temp.val;
            temp=temp.next;
        }
        return result;
    }
}