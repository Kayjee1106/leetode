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
    int min=Integer.MAX_VALUE;
    TreeNode prev;
    public void solve(TreeNode root){
        if(root==null)return;
        solve(root.left);
        if(prev!=null){
            min=Math.min(min,root.val-prev.val);
        }
        prev=root;
        solve(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        if(root==null)return 0;
        prev=null;
        solve(root);
        return min;
    }
}