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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        if(list1==null) return list2;
        ListNode left=list1;
        ListNode right=list1;
        ListNode curr=list2;
        for(int i=0;i<a-1;i++){
            left=left.next;
        }
        for(int i=0;i<b;i++){
            right=right.next;
        }
        left.next=list2;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=right.next;
        right.next=null;
        return list1;
    }
}