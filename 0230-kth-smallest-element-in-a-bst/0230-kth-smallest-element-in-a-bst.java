/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int min;
    int x;
    public void solve(TreeNode root,int k){
        if(root==null)return;
        solve(root.left,k);
        x++;
        if(x==k){
            min=root.val;
            return;
        }
        solve(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        min=Integer.MAX_VALUE;
        x=0;
        solve(root,k);
        return min;
    }
}