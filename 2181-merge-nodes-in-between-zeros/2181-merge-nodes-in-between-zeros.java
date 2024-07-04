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
    public ListNode solve(int [] sum){
        ListNode head= new ListNode(sum[0]);
        ListNode curr=head;
        for(int i=1;i<sum.length;i++){
            ListNode newNode =new ListNode(sum[i]);
            curr.next=newNode;
            curr=curr.next;
        }
        return head;
    }
    public ListNode mergeNodes(ListNode head) {
        ListNode curr=head;
        ArrayList<Integer> suml=new ArrayList<>();
        int sum=0;
        while(curr.next!=null){
            if(curr.next.val>0){
            sum+=curr.next.val;
            curr=curr.next;
            }
            else{
                suml.add(sum);
                sum=0;
                curr=curr.next;
            }
        }
        int[] newArray = suml.stream().mapToInt(i -> i).toArray();
        return solve(newArray);
    }
}