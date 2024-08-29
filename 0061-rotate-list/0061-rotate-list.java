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
    public ListNode solve(ListNode head,int k,int length){
        ListNode curr=head;
        ListNode temp=head;
        ListNode prev=new ListNode(-1);
        prev.next=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=head;
        int x=length-k;
        for(int i=0;i<x;i++){
            temp=temp.next;
            prev=prev.next;
        }
        prev.next=null;
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)return null;
        int length=0;
        ListNode curr=head;
        while(curr!=null){
            length++;
            curr=curr.next;
        }
        k=k%length;
        return solve(head,k,length);
    }
}