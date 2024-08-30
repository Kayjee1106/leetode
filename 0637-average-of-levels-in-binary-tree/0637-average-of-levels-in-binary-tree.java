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
    public int height(TreeNode root){
        if (root == null)
            return 0;
        else {
            int lheight=height(root.left);
            int rheight=height(root.right);
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }
    public double solve(TreeNode root,int level){
        if(root==null)return 0;
        if(level==1)return root.val;
        else if(level>1){
            double left=solve(root.left,level-1);
            double right=solve(root.right,level-1);
            return left+right;
        }
        return 0;
    }
    public int countNodesAtLevel(TreeNode root,int level){
        if(root==null)return 0;
        if(level==1)return 1;
        else if(level>1){
            int left=countNodesAtLevel(root.left,level-1);
            int right=countNodesAtLevel(root.right,level-1);
            return left+right;
        }
        return 0;
    }
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans=new ArrayList<>();
        int h=height(root);
        for(int i=1;i<=h;i++){
            double sum=solve(root, i);
            int count=countNodesAtLevel(root,i);
            ans.add(sum/(double)count);
        }
        return ans;
    }
}