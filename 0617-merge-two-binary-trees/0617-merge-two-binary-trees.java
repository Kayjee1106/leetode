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
    public TreeNode solve(TreeNode r1,TreeNode r2){
        if(r1==null)return r2;
        if(r2==null)return r1;
        TreeNode r3=new TreeNode(r1.val+r2.val);
        r3.left=solve(r1.left,r2.left);
        r3.right=solve(r1.right,r2.right);
        return r3;
    }
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null)return root2;
        if(root2==null)return root1;
        return solve(root1,root2);
    }
}