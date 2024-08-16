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
    public int solve(TreeNode root){
        int max=Integer.MIN_VALUE;
        if(root==null)return 0;
        int left=solve(root.left);
        int right=solve(root.right);
        max=Math.max(left,right);
        return max+1;
    }
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        return solve(root);
    }
}