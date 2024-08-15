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
    int sum=0;
    public int solve(TreeNode root, int low, int high){
        if(root==null)return 0;
        if(root.val>=low && root.val<=high)sum+=root.val;
        int left=solve(root.left,low,high);
        int right=solve(root.right,low,high);
        return sum;
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null)return 0;
        return solve(root,low,high);
    }
}