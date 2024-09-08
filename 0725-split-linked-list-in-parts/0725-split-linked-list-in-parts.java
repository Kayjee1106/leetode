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
    private int length(ListNode head){
        int x=0;
        ListNode curr=head;
        while(curr!=null){
            x++;
            curr=curr.next;
        }
        return x;
    }
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans=new ListNode[k];
        int l=length(head);
        int eachBucketNodes=l/k;
        int remainderNodes=l%k;
        ListNode curr=head;
        ListNode prev=null;
        for(int i=0;i<k;i++){
            ans[i]=curr;
            for(int count=1;count<=eachBucketNodes+(remainderNodes>0?1:0);count++){
                prev=curr;
                if (curr != null) {
                    curr = curr.next;
                }
            }
            if (prev != null) {
                prev.next = null;
            }
            remainderNodes--;
        }
        return ans;
    }
}