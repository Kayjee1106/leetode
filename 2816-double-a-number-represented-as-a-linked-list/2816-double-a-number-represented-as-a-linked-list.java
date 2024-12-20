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
    public int doubleUtil(ListNode head){
        if(head==null){
            return 0;
        }
        int carry=doubleUtil(head.next);
        int newVal=(head.val)*2+carry;
        head.val=newVal%10;
        return newVal/10;
    }
    public ListNode doubleIt(ListNode head) {
        int lastCarry =doubleUtil(head);
        if (lastCarry > 0) {
            ListNode newHead = new ListNode(lastCarry);
            newHead.next = head;
            return newHead;
        }
        return head;
    }
}