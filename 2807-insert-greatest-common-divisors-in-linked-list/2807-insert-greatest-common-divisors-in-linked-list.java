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
    private int bcd(int a,int b){
        if(b==0)return a;
        return bcd(b,a%b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr=head;
        ListNode nxt=curr.next;
        while(nxt!=null){
            ListNode temp=new ListNode(bcd(curr.val,nxt.val));
            curr.next=temp;
            temp.next=nxt;
            curr=nxt;
            nxt=nxt.next;
        }
        return head;
    }
}