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
    int idx;
    private TreeNode solve(int[] preorder, int[] inorder,int start,int end){
        if(start>end)
            return null;
        int rootVal=preorder[idx++];
        int i=start;
        while(i<=end){
            if(inorder[i]==rootVal) break;
            i++;
        }
        TreeNode root=new TreeNode(rootVal);
        root.left=solve(preorder,inorder,start,i-1);
        root.right=solve(preorder,inorder,i+1,end);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
        idx=0;
        return solve(preorder,inorder,0,n-1);
    }
}